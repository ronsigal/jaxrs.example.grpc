package jaxrs.example;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import jakarta.annotation.Priority;
import jakarta.servlet.ServletConfig;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.ext.MessageBodyReader;
import jakarta.ws.rs.ext.MessageBodyWriter;
import jakarta.ws.rs.ext.Provider;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import jakarta.servlet.http.HttpServletResponse;
import org.jboss.resteasy.grpc.servlet.AsyncMockServletOutputStream;
import org.jboss.resteasy.grpc.servlet.HttpServletResponseImpl;
import jaxrs.example.CC1_JavabufTranslator;
import org.jboss.resteasy.core.ResteasyContext;
import org.jboss.resteasy.grpc.servlet.ServletConfigWrapper;
import jaxrs.example.CC1_proto.GeneralReturnMessage;
import jaxrs.example.CC1_proto.GeneralEntityMessage;
import jaxrs.example.CC1_proto.ServletInfo;
import jaxrs.example.CC1_proto.Cookie;
import jaxrs.example.CC1_proto.Header;
import jaxrs.example.CC1_proto.gShort;
import jaxrs.example.CC1_proto.gDouble;
import jaxrs.example.CC1_proto.gBoolean;
import jaxrs.example.CC1_proto.gString;
import jaxrs.example.CC1_proto.gLong;
import jaxrs.example.CC1_proto.gByte;
import jaxrs.example.CC1_proto.gCharacter;
import jaxrs.example.CC1_proto.gFloat;
import jaxrs.example.CC1_proto.gInteger;
import jaxrs.example.CC1_proto.gEmpty;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC5;
import org.jboss.resteasy.example.CC5;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4;
import org.jboss.resteasy.example.CC4;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2;
import org.jboss.resteasy.example.CC2;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC3;
import org.jboss.resteasy.example.CC3;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6;
import org.jboss.resteasy.example.CC6;
import jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7;
import org.jboss.resteasy.example.CC7;


@Provider
@Consumes("application/grpc-jaxrs;grpc-jaxrs=true")
@Produces("*/*;grpc-jaxrs=true")
@Priority(Integer.MIN_VALUE)
@SuppressWarnings("rawtypes")
public class CC1MessageBodyReaderWriter implements MessageBodyReader<Object>, MessageBodyWriter<Object> {

   @Override
   public boolean isReadable(Class type, Type genericType, Annotation[] annotations, MediaType mediaType) {
      System.out.println("isReadable: " +  CC1_JavabufTranslator.handlesFromJavabuf(type));
      return CC1_JavabufTranslator.handlesFromJavabuf(type);
   }

   @SuppressWarnings("unchecked")
   @Override
   public Object readFrom(Class type, Type genericType, Annotation[] annotations, MediaType mediaType,
        MultivaluedMap httpHeaders, InputStream entityStream) throws IOException, WebApplicationException {
      try {
      if (httpHeaders.getFirst(HttpServletResponseImpl.GRPC_RETURN_RESPONSE) != null) {
         return Any.parseFrom(CodedInputStream.newInstance(entityStream));
      } else {
         GeneratedMessageV3 message = getMessage(type, entityStream);
         return CC1_JavabufTranslator.translateFromJavabuf(message);
      }
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   @Override
   public boolean isWriteable(Class type, Type genericType, Annotation[] annotations, MediaType mediaType) {
      return CC1_JavabufTranslator.handlesToJavabuf(type);
   }

   @Override
   public void writeTo(Object t, Class type, Type genericType, Annotation[] annotations, MediaType mediaType,
      MultivaluedMap httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
      System.out.println("entering writeTo()");      System.out.println("t: " + t);
      Message message = CC1_JavabufTranslator.translateToJavabuf(t);
      HttpServletResponse servletResponse = ResteasyContext.getContextData(HttpServletResponse.class);
      if (servletResponse != null && servletResponse.getHeader(HttpServletResponseImpl.GRPC_RETURN_RESPONSE) != null) {
         CodedOutputStream cos = CodedOutputStream.newInstance(entityStream);
         Any.pack(message).writeTo(cos);
         cos.flush();
         if (servletResponse.getOutputStream() instanceof AsyncMockServletOutputStream) {
            AsyncMockServletOutputStream amsos = (AsyncMockServletOutputStream) servletResponse.getOutputStream();
            amsos.release();
            return;
         }
      } else {
         message.writeTo(entityStream);
         entityStream.flush();
      }
      if (servletResponse.getOutputStream() instanceof AsyncMockServletOutputStream) {
         AsyncMockServletOutputStream amsos = (AsyncMockServletOutputStream) servletResponse.getOutputStream();
         amsos.release();
      }
   }

   private static GeneratedMessageV3 getMessage(Class<?> clazz, InputStream is) throws IOException {
      if (GeneralReturnMessage.class.equals(clazz)) {
         return GeneralReturnMessage.parseFrom(is);
      } else       if (GeneralEntityMessage.class.equals(clazz)) {
         return GeneralEntityMessage.parseFrom(is);
      } else       if (ServletInfo.class.equals(clazz)) {
         return ServletInfo.parseFrom(is);
      } else       if (Cookie.class.equals(clazz)) {
         return Cookie.parseFrom(is);
      } else       if (Header.class.equals(clazz)) {
         return Header.parseFrom(is);
      } else       if (java.lang.Short.class.equals(clazz) || short.class.equals(clazz)) {
         return gShort.parseFrom(is);
      } else       if (java.lang.Double.class.equals(clazz) || double.class.equals(clazz)) {
         return gDouble.parseFrom(is);
      } else       if (java.lang.Boolean.class.equals(clazz) || boolean.class.equals(clazz)) {
         return gBoolean.parseFrom(is);
      } else       if (java.lang.String.class.equals(clazz)) {
         return gString.parseFrom(is);
      } else       if (java.lang.Long.class.equals(clazz) || long.class.equals(clazz)) {
         return gLong.parseFrom(is);
      } else       if (java.lang.Byte.class.equals(clazz) || byte.class.equals(clazz)) {
         return gByte.parseFrom(is);
      } else       if (java.lang.Character.class.equals(clazz) || char.class.equals(clazz)) {
         return gCharacter.parseFrom(is);
      } else       if (java.lang.Float.class.equals(clazz) || float.class.equals(clazz)) {
         return gFloat.parseFrom(is);
      } else       if (java.lang.Integer.class.equals(clazz) || int.class.equals(clazz)) {
         return gInteger.parseFrom(is);
      } else       if (gEmpty.class.equals(clazz)) {
         return gEmpty.parseFrom(is);
      } else       if (CC5.class.equals(clazz)) {
         return org_jboss_resteasy_example___CC5.parseFrom(is);
      } else       if (CC4.class.equals(clazz)) {
         return org_jboss_resteasy_example___CC4.parseFrom(is);
      } else       if (CC2.class.equals(clazz)) {
         return org_jboss_resteasy_example___CC2.parseFrom(is);
      } else       if (CC3.class.equals(clazz)) {
         return org_jboss_resteasy_example___CC3.parseFrom(is);
      } else       if (CC6.class.equals(clazz)) {
         return org_jboss_resteasy_example___CC6.parseFrom(is);
      } else       if (CC7.class.equals(clazz)) {
         return org_jboss_resteasy_example___CC7.parseFrom(is);
      } else {
         throw new IOException("unrecognized class: " + clazz);
      }
   }

   private static GeneratedMessageV3 unpackMessage(Class<?> clazz, Any any) throws IOException {
      if (GeneralReturnMessage.class.equals(clazz)) {
         return any.unpack(GeneralReturnMessage.class);
      } else       if (GeneralEntityMessage.class.equals(clazz)) {
         return any.unpack(GeneralEntityMessage.class);
      } else       if (ServletInfo.class.equals(clazz)) {
         return any.unpack(ServletInfo.class);
      } else       if (Cookie.class.equals(clazz)) {
         return any.unpack(Cookie.class);
      } else       if (Header.class.equals(clazz)) {
         return any.unpack(Header.class);
      } else       if (java.lang.Short.class.equals(clazz) || short.class.equals(clazz)) {
         return any.unpack(gShort.class);
      } else       if (java.lang.Double.class.equals(clazz) || double.class.equals(clazz)) {
         return any.unpack(gDouble.class);
      } else       if (java.lang.Boolean.class.equals(clazz) || boolean.class.equals(clazz)) {
         return any.unpack(gBoolean.class);
      } else       if (java.lang.String.class.equals(clazz)) {
         return any.unpack(gString.class);
      } else       if (java.lang.Long.class.equals(clazz) || long.class.equals(clazz)) {
         return any.unpack(gLong.class);
      } else       if (java.lang.Byte.class.equals(clazz) || byte.class.equals(clazz)) {
         return any.unpack(gByte.class);
      } else       if (java.lang.Character.class.equals(clazz) || char.class.equals(clazz)) {
         return any.unpack(gCharacter.class);
      } else       if (java.lang.Float.class.equals(clazz) || float.class.equals(clazz)) {
         return any.unpack(gFloat.class);
      } else       if (java.lang.Integer.class.equals(clazz) || int.class.equals(clazz)) {
         return any.unpack(gInteger.class);
      } else       if (gEmpty.class.equals(clazz)) {
         return any.unpack(gEmpty.class);
      } else       if (CC5.class.equals(clazz)) {
         return any.unpack(org_jboss_resteasy_example___CC5.class);
      } else       if (CC4.class.equals(clazz)) {
         return any.unpack(org_jboss_resteasy_example___CC4.class);
      } else       if (CC2.class.equals(clazz)) {
         return any.unpack(org_jboss_resteasy_example___CC2.class);
      } else       if (CC3.class.equals(clazz)) {
         return any.unpack(org_jboss_resteasy_example___CC3.class);
      } else       if (CC6.class.equals(clazz)) {
         return any.unpack(org_jboss_resteasy_example___CC6.class);
      } else       if (CC7.class.equals(clazz)) {
         return any.unpack(org_jboss_resteasy_example___CC7.class);
      } else {
         throw new IOException("unrecognized class: " + clazz);
      }
   }

}
