package jaxrs.example;

import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import io.grpc.stub.StreamObserver;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jakarta.ws.rs.RuntimeType;
import jakarta.ws.rs.core.MediaType;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.jboss.as.weld.WeldProvider;
import org.jboss.weld.environment.se.WeldSEProvider;
import org.jboss.resteasy.core.ResteasyContext;
import org.jboss.resteasy.core.SynchronousDispatcher;
import org.jboss.resteasy.core.providerfactory.ResteasyProviderFactoryImpl;
import org.jboss.resteasy.grpc.servlet.ServletConfigWrapper;
import org.jboss.resteasy.grpc.GrpcCdiExtension;
import org.jboss.resteasy.grpc.servlet.AsyncContextImpl;
import org.jboss.resteasy.grpc.servlet.AsyncMockServletOutputStream;
import org.jboss.resteasy.grpc.servlet.HttpServletRequestImpl;
import org.jboss.resteasy.grpc.servlet.HttpServletResponseImpl;
import org.jboss.resteasy.grpc.servlet.MockServletInputStream;
import org.jboss.resteasy.grpc.servlet.MockServletOutputStream;
import org.jboss.resteasy.plugins.providers.sse.InboundSseEventImpl;
import org.jboss.resteasy.plugins.providers.sse.SseEventInputImpl;
import org.jboss.resteasy.plugins.server.servlet.HttpServletDispatcher;
import org.jboss.resteasy.plugins.server.servlet.HttpServlet30Dispatcher;
import org.jboss.resteasy.plugins.server.servlet.ServletContainerDispatcher;
import org.jboss.resteasy.spi.Dispatcher;
import org.jboss.resteasy.spi.ResteasyProviderFactory;
import org.jboss.weld.SimpleCDI;
import org.jboss.weld.context.bound.BoundRequestContext;
import org.wildfly.grpc.GrpcService;
import javax.inject.Inject;
import jakarta.enterprise.inject.spi.BeanManager;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.ContextNotActiveException;
import org.jboss.weld.context.http.HttpRequestContext;
import org.jboss.weld.module.web.context.http.HttpRequestContextImpl;
import org.jboss.weld.manager.BeanManagerImpl;
import org.jboss.weld.bean.builtin.BeanManagerProxy;
import com.google.protobuf.Any;
import test.grpc.CC1_Server;
import jaxrs.example.CC1ServiceGrpc.CC1ServiceImplBase;
import jaxrs.example.CC1_proto.gEmpty;
import jaxrs.example.CC1_proto.gString;
import jaxrs.example.CC1_proto.gBoolean;
import jaxrs.example.CC1_proto.gBoolean;
import jaxrs.example.CC1_proto.gByte;
import jaxrs.example.CC1_proto.gByte;
import jaxrs.example.CC1_proto.gShort;
import jaxrs.example.CC1_proto.gShort;
import jaxrs.example.CC1_proto.gInteger;
import jaxrs.example.CC1_proto.gInteger;
import jaxrs.example.CC1_proto.gLong;
import jaxrs.example.CC1_proto.gLong;
import jaxrs.example.CC1_proto.gFloat;
import jaxrs.example.CC1_proto.gFloat;
import jaxrs.example.CC1_proto.gDouble;
import jaxrs.example.CC1_proto.gDouble;
import jaxrs.example.CC1_proto.gCharacter;
import jaxrs.example.CC1_proto.gCharacter;
import jaxrs.example.CC1_proto.gString;
import com.google.protobuf.Any;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6;

@GrpcService
public class CC1ServiceGrpcImpl extends CC1ServiceImplBase {

   private static CC1_proto.gString.Builder builder = CC1_proto.gString.newBuilder();
   private static FieldDescriptor fd = builder.getDescriptorForType().getFields().iterator().next();
   private HttpServletDispatcher servlet;
   private HttpRequestContext cdiContext;

   @java.lang.Override
   public void ready(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/ready", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getBoolean(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gBoolean> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gBoolean", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGBooleanField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/boolean", response, "POST", "jaxrs.example.CC1_proto.gBoolean");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gBoolean reply = jaxrs.example.CC1_proto.gBoolean.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getBooleanWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gBoolean> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gBoolean", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGBooleanField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/Boolean", response, "POST", "jaxrs.example.CC1_proto.gBoolean");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gBoolean reply = jaxrs.example.CC1_proto.gBoolean.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getByte(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gByte> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gByte", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGByteField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/byte", response, "POST", "jaxrs.example.CC1_proto.gByte");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gByte reply = jaxrs.example.CC1_proto.gByte.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getByteWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gByte> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gByte", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGByteField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/Byte", response, "POST", "jaxrs.example.CC1_proto.gByte");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gByte reply = jaxrs.example.CC1_proto.gByte.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getShort(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gShort> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gShort", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGShortField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/short", response, "POST", "jaxrs.example.CC1_proto.gShort");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gShort reply = jaxrs.example.CC1_proto.gShort.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getShortWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gShort> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gShort", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGShortField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/Short", response, "POST", "jaxrs.example.CC1_proto.gShort");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gShort reply = jaxrs.example.CC1_proto.gShort.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getInt(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gInteger> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gInteger", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGIntegerField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/int", response, "POST", "jaxrs.example.CC1_proto.gInteger");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gInteger reply = jaxrs.example.CC1_proto.gInteger.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getInteger(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gInteger> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gInteger", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGIntegerField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/Integer", response, "POST", "jaxrs.example.CC1_proto.gInteger");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gInteger reply = jaxrs.example.CC1_proto.gInteger.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getLong(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gLong> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gLong", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGLongField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/long", response, "POST", "jaxrs.example.CC1_proto.gLong");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gLong reply = jaxrs.example.CC1_proto.gLong.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getLongWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gLong> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gLong", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGLongField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/Long", response, "POST", "jaxrs.example.CC1_proto.gLong");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gLong reply = jaxrs.example.CC1_proto.gLong.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getFloat(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gFloat> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gFloat", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGFloatField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/float", response, "POST", "jaxrs.example.CC1_proto.gFloat");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gFloat reply = jaxrs.example.CC1_proto.gFloat.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getFloatWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gFloat> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gFloat", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGFloatField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/Float", response, "POST", "jaxrs.example.CC1_proto.gFloat");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gFloat reply = jaxrs.example.CC1_proto.gFloat.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getDouble(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gDouble> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gDouble", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGDoubleField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/double", response, "POST", "jaxrs.example.CC1_proto.gDouble");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gDouble reply = jaxrs.example.CC1_proto.gDouble.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getDoubleWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gDouble> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gDouble", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGDoubleField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/Double", response, "POST", "jaxrs.example.CC1_proto.gDouble");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gDouble reply = jaxrs.example.CC1_proto.gDouble.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getChar(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gCharacter> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gCharacter", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGCharacterField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/char", response, "POST", "jaxrs.example.CC1_proto.gCharacter");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gCharacter reply = jaxrs.example.CC1_proto.gCharacter.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getCharacter(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gCharacter> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gCharacter", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGCharacterField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/Character", response, "POST", "jaxrs.example.CC1_proto.gCharacter");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gCharacter reply = jaxrs.example.CC1_proto.gCharacter.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getString(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGStringField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/string", response, "POST", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getResponse(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<com.google.protobuf.Any> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("com.google.protobuf.Any", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/response", response, "GET", "com.google.protobuf.Any");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         com.google.protobuf.Any reply = com.google.protobuf.Any.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getResponseCompletionStage(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "completionStage", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/async/cs", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         AsyncMockServletOutputStream amsos = (AsyncMockServletOutputStream) response.getOutputStream();
         amsos.await();
         ByteArrayOutputStream baos = amsos.getDelegate();
         ByteArrayInputStream bais1 = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais1);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void getCC7(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/cc7", response, "GET", "jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7 reply = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void produces(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/produces", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void consumes(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/consumes", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void pathParams(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/path/{p1}/param/{p2}", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void queryParams(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/query", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void matrixParams(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/matrix/more", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void cookieParams(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/cookieParams", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void headerParams(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/headerParams", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void paramsList(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/params/{p1}/list/{p1}", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void paramsSet(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/params/{p1}/set/{p1}", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void paramsSortedSet(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/params/{p1}/sortedset/{p1}", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void suspend(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<com.google.protobuf.Any> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("com.google.protobuf.Any", "suspended", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/suspend", response, "GET", "com.google.protobuf.Any");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         AsyncMockServletOutputStream amsos = (AsyncMockServletOutputStream) response.getOutputStream();
         amsos.await();
         ByteArrayOutputStream baos = amsos.getDelegate();
         ByteArrayInputStream bais1 = new ByteArrayInputStream(baos.toByteArray());
         com.google.protobuf.Any reply = com.google.protobuf.Any.parseFrom(bais1);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void context(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/context", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void inheritance(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getOrgJbossResteasyExampleCC2Field();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/inheritance", response, "POST", "jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2 reply = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void referenceField(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getOrgJbossResteasyExampleCC4Field();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/reference", response, "POST", "jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4 reply = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void m3(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getOrgJbossResteasyExampleCC4Field();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/m3", response, "POST", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void m4(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gBoolean> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gBoolean", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGIntegerField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/m4", response, "POST", "jaxrs.example.CC1_proto.gBoolean");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gBoolean reply = jaxrs.example.CC1_proto.gBoolean.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void m5(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/m5", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void m7(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGIntegerField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/m7", response, "POST", "jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6 reply = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void testServletInfo(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "p/servletInfo", response, "POST", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("POST", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

   @java.lang.Override
   public void found(jaxrs.example.CC1_proto.GeneralEntityMessage param, StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      try {
         HttpServletResponse response = new HttpServletResponseImpl("jaxrs.example.CC1_proto.gString", "sync", CC1_Server.getContext(), builder, fd);
         GeneratedMessageV3 actualParam = param.getGEmptyField();
         HttpServletRequest request = getHttpServletRequest(param, actualParam, "q/found", response, "GET", "jaxrs.example.CC1_proto.gString");
         associateCdiContext(request);
         HttpServletDispatcher servlet = getServlet();
         servlet.service("GET", request, response);
         MockServletOutputStream msos = (MockServletOutputStream) response.getOutputStream();
         ByteArrayOutputStream baos = msos.getDelegate();
         ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
         jaxrs.example.CC1_proto.gString reply = jaxrs.example.CC1_proto.gString.parseFrom(bais);
         responseObserver.onNext(reply);
      } catch (Exception e) {
         e.printStackTrace();
         responseObserver.onError(e);
      } finally {
         responseObserver.onCompleted();
      }
   }

//=============================  static methods =============================
   private void associateCdiContext(HttpServletRequest request) {
      if (cdiContext == null) {
         synchronized(this) {
            if (cdiContext == null) {
               CDI.setCDIProvider(new WeldProvider());
               cdiContext = new HttpRequestContextImpl("jaxrs.example.grpc-0.0.1-SNAPSHOT.war");
               cdiContext.associate(request);
               cdiContext.activate();
               BeanManager bm = GrpcCdiExtension.getBeanManager();
               if (bm == null) {
                  bm = CDI.current().getBeanManager();
               }
               try {
                  bm.getContext(RequestScoped.class);
               } catch (ContextNotActiveException e) {
                  BeanManagerProxy bmp = (BeanManagerProxy) bm;
                  BeanManagerImpl bmi = bmp.delegate();
                  bmi.addContext(cdiContext);
               }
               return;
            }
         }
      }
      cdiContext.associate(request);
      cdiContext.activate();
   }

   private HttpServletDispatcher getServlet() throws Exception {
      if (servlet == null) {
         synchronized(this) {
            if (servlet != null) {
               return servlet;
            }
            servlet = (HttpServletDispatcher) ResteasyContext.getServlet("org.jboss.resteasy.example.ExampleApp");
            ServletContainerDispatcher servletContainerDispatcher = servlet.getServletContainerDispatcher();
            ResteasyProviderFactory resteasyProviderFactory = servletContainerDispatcher.getProviderFactory();
            resteasyProviderFactory.registerProvider(Class.forName("jaxrs.example.CC1MessageBodyReaderWriter"), false);
         }
      }
      return servlet;
   }

   private static Map<String, List<String>> convertHeaders(Map<String, jaxrs.example.CC1_proto.Header> protoHeaders) {
      Map<String, List<String>> headers = new HashMap<String, List<String>>();
      for (Map.Entry<String, jaxrs.example.CC1_proto.Header> entry : protoHeaders.entrySet()) {
         String key = entry.getKey();
         jaxrs.example.CC1_proto.Header protoHeader = entry.getValue();
         List<String> values = new ArrayList<String>();
         for (int i = 0; i < protoHeader.getValuesCount(); i++) {
            values.add(protoHeader.getValues(i));
         }
         headers.put(key, values);
      }
      return headers;
   }

   private static HttpServletRequest getHttpServletRequest(jaxrs.example.CC1_proto.GeneralEntityMessage param, GeneratedMessageV3 actualParam, String path, HttpServletResponse response, String verb, String type) throws Exception {
      String url = param.getURL() == "" ? "http://localhost:8080/" + path : param.getURL();
      ByteArrayInputStream bais = new ByteArrayInputStream(actualParam.toByteArray());
      MockServletInputStream msis = new MockServletInputStream(bais);
      Map<String, List<String>> headers = convertHeaders(param.getHeadersMap());
      Cookie[] cookies = convertCookies(param.getCookiesList());
      ServletContext servletContext = CC1_Server.getContext();
      HttpServletRequestImpl request = new HttpServletRequestImpl(response, servletContext, url, verb, msis, type, headers, cookies);
      jaxrs.example.CC1_proto.ServletInfo servletInfo = param.getServletInfo();
      if (servletInfo != null) {
         if (servletInfo.getCharacterEncoding() != null) {
            request.setCharacterEncoding(servletInfo.getCharacterEncoding());
         }
         if (servletInfo.getClientAddress() != null) {
            request.setRemoteAddr(servletInfo.getClientAddress());
         }
         if (servletInfo.getClientHost() != null) {
            request.setRemoteHost(servletInfo.getClientHost());
         }
         if (servletInfo.getClientPort() != -1) {
            request.setRemotePort(servletInfo.getClientPort());
         }
      }
      return request;
   }

   private static jakarta.servlet.http.Cookie[] convertCookies(List<jaxrs.example.CC1_proto.Cookie> cookieList) {
      jakarta.servlet.http.Cookie[] cookieArray = new jakarta.servlet.http.Cookie[cookieList.size()];
      int i = 0;
      for (Iterator<jaxrs.example.CC1_proto.Cookie> it = cookieList.iterator(); it.hasNext(); ) {
         jaxrs.example.CC1_proto.Cookie protoCookie = it.next();
         jakarta.servlet.http.Cookie cookie = new jakarta.servlet.http.Cookie(protoCookie.getName(), protoCookie.getValue());
         cookie.setVersion(protoCookie.getVersion());
         cookie.setPath(protoCookie.getPath());
         cookie.setDomain(protoCookie.getDomain());
         cookieArray[i++] = cookie;
      }
      return cookieArray;
   }

}
