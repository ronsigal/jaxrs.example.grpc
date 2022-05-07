package org.jboss.resteasy.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.container.AsyncResponse;
import jakarta.ws.rs.container.Suspended;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.Cookie;
import jakarta.ws.rs.core.Response;

@Path("p")
public class CC1 {

   @Path("ready")
   @GET
   public String ready() {
      System.out.println("gRPC server ready");
      return "ready";
   }

   @Path("boolean")
   @POST
   public boolean getBoolean(boolean b) {
      return !b;
   }

   @Path("Boolean")
   @POST
   public Boolean getBooleanWrapper(Boolean b) {
      return Boolean.valueOf(!b);
   }

   @Path("byte")
   @POST
   public byte getByte(byte b) {
      int i = b + 1;
      return (byte) i;
   }

   @Path("Byte")
   @POST
   public Byte getByteWrapper(Byte b) {
      return Byte.valueOf((byte) (b.byteValue() + 1));
   }

   @Path("short")
   @POST
   public short getShort(short n) {
      int i = n + 1;
      return (short) i;
   }

   @Path("Short")
   @POST
   public Short getShortWrapper(Short n) {
      return Short.valueOf((short) (n.shortValue() + 1));
   }

   @Path("int")
   @POST
   public int getInt(int n) {
      return n + 1;
   }

   @Path("Integer")
   @POST
   public Integer getInteger(Integer n) {
      return Integer.valueOf(n.intValue() + 1);
   }

   @Path("long")
   @POST
   public long getLong(long n) {
      return n + 1;
   }

   @Path("Long")
   @POST
   public Long getLongWrapper(Long n) {
      return Long.valueOf(n.longValue() + 1);
   }

   @Path("float")
   @POST
   public float getFloat(float f) {
      return Float.valueOf((float) (f + 1.0f));
   }

   @Path("Float")
   @POST
   public Float getFloatWrapper(Float f) {
      return Float.valueOf((float) (f.floatValue() + 1.0f));
   }

   @Path("double")
   @POST
   public double getDouble(double d) {
      return Double.valueOf((double) (d + 1.0d));
   }

   @Path("Double")
   @POST
   public Double getDoubleWrapper(Double d) {
      return Double.valueOf((double) (d.floatValue() + 1.0d));
   }

   @Path("char")
   @POST
   public char getChar(char c) {
      return Character.toUpperCase(c);
   }

   @Path("Character")
   @POST
   public Character getCharacter(Character c) {
      return Character.toUpperCase(c);
   }

   @Path("string")
   @POST
   public String getString(String s) {
      return s.toUpperCase();
   }

   @Path("response")
   @GET
   public Response getResponse() {
      CC7 cc7 = new CC7("cc7", 11);
      return Response.ok(cc7).build();
   }

   @Path("async/cs")
   @GET
   public CompletionStage<String> getResponseCompletionStage() {
      final CompletableFuture<String> response = new CompletableFuture<>();
      Thread t = new Thread() {
         @Override
         public void run() {
            try {
               response.complete("cs");
            } catch (Exception e) {
               response.completeExceptionally(e);
            }
         }
      };
      t.start();
      return response;
   }

   @Path("cc7")
   @GET
   public CC7 getCC7() {
      CC7 cc7 = new CC7("cc7", 11);
      return cc7;
   }

   @Path("produces")
   @Produces("abc/xyz")
   @GET
   public String produces() {
      return "produces";
   }

   @Path("consumes")
   @Consumes("xyz/abc")
   @GET
   public String consumes() {
      return "consumes";
   }

   @Path("path/{p1}/param/{p2}")
   @GET
   public String pathParams(@PathParam("p1") String p1, @PathParam("p2") String p2) {
      return "x" + p1 + "y" + p2 + "z";
   }

   @Path("query")
   @GET
   public String queryParams(@QueryParam("q1") String q1, @QueryParam("q2") String q2) {
      return "x" + q1 + "y" + q2 + "z";
   }

   @Path("matrix/more")
   @GET
   public String matrixParams(@MatrixParam("m1") String m1, @MatrixParam("m2") String m2, @MatrixParam("m3") String m3) {
      return "w" + m1 + "x" + m2 + "y" + m3 + "z";
   }

   @Path("cookieParams")
   @GET
   public String cookieParams(@CookieParam("c1") Cookie c1, @CookieParam("c2") Cookie c2) {
      return "x" + cookieStringify(c1) + "y" + cookieStringify(c2) + "z";
   }

   private String cookieStringify(Cookie c) {
      StringBuilder sb = new StringBuilder();
      sb.append(c.getName())
      .append("=")
      .append(c.getValue())
      .append(";")
      .append(c.getDomain()).append(",")
      .append(c.getPath()).append(",")
      .append(c.getVersion());
      return sb.toString();
   }

   @Path("headerParams")
   @GET
   public String headerParams(@HeaderParam("h1") String h1, @HeaderParam("h2") String h2) {
      return "x" + h1 + "y" + h2 + "z";
   }

   @Path("params/{p1}/list/{p1}")
   @GET
   public String paramsList(
         @HeaderParam("h1") final List<String> headerList,
         @MatrixParam("m1") final List<String> matrixList,
         @PathParam("p1") final List<String> pathList,
         @QueryParam("q1") final List<String> queryList
         ) {
      StringBuilder sb = new StringBuilder();
      for (String s : headerList) {
         sb.append(s);
      }
      for (String s : matrixList) {
         sb.append(s);
      }
      for (String s : pathList) {
         sb.append(s);
      }
      for (String s : queryList) {
         sb.append(s);
      }
      return sb.toString();
   }

   @Path("params/{p1}/set/{p1}")
   @GET
   public String paramsSet(
         @HeaderParam("h1") final Set<String> headerSet,
         @MatrixParam("m1") final Set<String> matrixSet,
         @PathParam("p1")   final Set<String> pathSet,
         @QueryParam("q1")  final Set<String> querySet
         ) {
      List<String> headerList = new ArrayList<String>(headerSet);
      List<String> matrixList = new ArrayList<String>(matrixSet);
      List<String> pathList =   new ArrayList<String>(pathSet);
      List<String> queryList =  new ArrayList<String>(querySet);
      Collections.sort(headerList);
      Collections.sort(matrixList);
      Collections.sort(pathList);
      Collections.sort(queryList);
      StringBuilder sb = new StringBuilder();
      for (String s : headerList) {
         sb.append(s);
      }
      for (String s : matrixList) {
         sb.append(s);
      }
      for (String s : pathList) {
         sb.append(s);
      }
      for (String s : queryList) {
         sb.append(s);
      }
      return sb.toString();
   }

   @Path("params/{p1}/sortedset/{p1}")
   @GET
   public String paramsSortedSet(
         @HeaderParam("h1") final SortedSet<String> headerSet,
         @MatrixParam("m1") final SortedSet<String> matrixSet,
         @PathParam("p1") final SortedSet<String> pathSet,
         @QueryParam("q1") final SortedSet<String> querySet
         ) {
      StringBuilder sb = new StringBuilder();
      for (String s : headerSet) {
         sb.append(s);
      }
      for (String s : matrixSet) {
         sb.append(s);
      }
      for (String s : pathSet) {
         sb.append(s);
      }
      for (String s : querySet) {
         sb.append(s);
      }
      return sb.toString();
   }

   @GET
   @Path("suspend")
   public void suspend(@Suspended final AsyncResponse response) //throws Exception
   {
      Thread t = new Thread()
      {
         @Override
         public void run()
         {
            try
            {
               Response jaxrs = Response.ok("suspend").build();
               response.resume(jaxrs);
            }
            catch (Exception e)
            {
               response.resume(e);
            }
         }
      };
      t.start();
   }

   @GET
   @Path("context")
   public String context(@Context HttpServletRequest request) {
      String contextPath = request.getServletContext().getContextPath();
      return contextPath;
   }

   @Path("inheritance")
   @POST
   public CC2 inheritance(CC2 cc2) {
      return new CC2("x" + cc2.s + "y", cc2.j + 1);
   }

   @Path("reference")
   @POST
   public CC4 referenceField(CC4 cc4) {
      CC5 newCC5 = new CC5(cc4.cc5.k + 1);
      CC4 newCC4 = new CC4("x" + cc4.s + "y", newCC5);
      //	   CC4 newCC4 = new CC4(cc4.s + 1, newCC5);
      return newCC4;
   }

   String m2(String s) {
      return "x";
   }

   @Path("m3")
   @POST
   public String m3(CC4 cc4) {
      return "x";
   }

   @Path("m4")
   @POST
   public boolean m4(int i) {
      return true;
   }

   @Path("m5")
   @GET
   public String m5() {
      return "m5";
   }

   //   @Path("m6")
   //   @POST
   //   public CC4 m6(CC2 cc2) {
   //      CC5 cc5 = new CC5(cc2.j);
   //      System.out.println("cc2.s: " + cc2.s + ", cc5.k: " + cc5.k);
   //      return new CC4(cc2.s, cc5);
   //   }

   @Path("m7")
   @POST
   public CC6 m7(int i) {
      CC7 cc7 = new CC7("m7", i + 1);
      CC6 cc6 = new CC6(i + 2, cc7);
      return cc6;
   }

   @Path("servletInfo")
   @POST
   public String testServletInfo(@Context HttpServletRequest request) {
      String characterEncoding = request.getCharacterEncoding().toUpperCase();
      String remoteAddr = request.getRemoteAddr();
      remoteAddr = remoteAddr.substring(0, remoteAddr.lastIndexOf(".") + 1) + "5";
      String remoteHost = request.getRemoteHost().toUpperCase();
      int remotePort = request.getRemotePort() + 1;
      return characterEncoding + "|" + remoteAddr + "|" + remoteHost + "|" + remotePort;
   }
   //   @GET
   //   @Path("sse")
   //   @Produces(MediaType.SERVER_SENT_EVENTS)
   //   public void sse(@Context SseEventSink eventSink, @Context Sse sse) {
   //      ExecutorService executor = Executors.newFixedThreadPool(3);
   //      executor.execute(() -> {
   //         try (SseEventSink sink = eventSink) {
   //            System.out.println("sending event1");
   //            eventSink.send(sse.newEvent("event1"));
   //            System.out.println("sent event1");
   //            System.out.println("sending event2");
   //            eventSink.send(sse.newEvent("event2"));
   //            System.out.println("sent event2");
   //            System.out.println("sending event3");
   //            eventSink.send(sse.newEvent("event3"));
   //            System.out.println("send event3");
   //         }
   //      });
   //   }
}
