package jaxrs.example;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.DynamicMessage;
import com.google.protobuf.Message;
import org.jboss.resteasy.grpc.protobuf.AssignFromJavabuf;
import org.jboss.resteasy.grpc.protobuf.AssignToJavabuf;
import org.jboss.resteasy.grpc.protobuf.TranslateFromJavabuf;
import org.jboss.resteasy.grpc.protobuf.TranslateToJavabuf;
import org.jboss.resteasy.grpc.servlet.HttpServletResponseImpl;
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
import org.jboss.resteasy.example.CC5;
import org.jboss.resteasy.example.CC4;
import org.jboss.resteasy.example.CC2;
import org.jboss.resteasy.example.CC3;
import org.jboss.resteasy.example.CC6;
import org.jboss.resteasy.example.CC7;

public class CC1_JavabufTranslator {
   private static Map<Class<?>, TranslateToJavabuf> toJavabufMap = new HashMap<Class<?>, TranslateToJavabuf>();
   private static Map<String, TranslateFromJavabuf> fromJavabufMap = new HashMap<String, TranslateFromJavabuf>();

   static {
      toJavabufMap.put(Short.class, new gShort_ToJavabuf());
      fromJavabufMap.put("gShort", new gShort_FromJavabuf());
      toJavabufMap.put(Double.class, new gDouble_ToJavabuf());
      fromJavabufMap.put("gDouble", new gDouble_FromJavabuf());
      toJavabufMap.put(Boolean.class, new gBoolean_ToJavabuf());
      fromJavabufMap.put("gBoolean", new gBoolean_FromJavabuf());
      toJavabufMap.put(String.class, new gString_ToJavabuf());
      fromJavabufMap.put("gString", new gString_FromJavabuf());
      toJavabufMap.put(Long.class, new gLong_ToJavabuf());
      fromJavabufMap.put("gLong", new gLong_FromJavabuf());
      toJavabufMap.put(Byte.class, new gByte_ToJavabuf());
      fromJavabufMap.put("gByte", new gByte_FromJavabuf());
      toJavabufMap.put(Character.class, new gCharacter_ToJavabuf());
      fromJavabufMap.put("gCharacter", new gCharacter_FromJavabuf());
      toJavabufMap.put(Float.class, new gFloat_ToJavabuf());
      fromJavabufMap.put("gFloat", new gFloat_FromJavabuf());
      toJavabufMap.put(Integer.class, new gInteger_ToJavabuf());
      fromJavabufMap.put("gInteger", new gInteger_FromJavabuf());
      toJavabufMap.put(CC5.class, new org_jboss_resteasy_example___CC5_ToJavabuf());
      fromJavabufMap.put("org_jboss_resteasy_example___CC5", new org_jboss_resteasy_example___CC5_FromJavabuf());
      toJavabufMap.put(CC4.class, new org_jboss_resteasy_example___CC4_ToJavabuf());
      fromJavabufMap.put("org_jboss_resteasy_example___CC4", new org_jboss_resteasy_example___CC4_FromJavabuf());
      toJavabufMap.put(CC2.class, new org_jboss_resteasy_example___CC2_ToJavabuf());
      fromJavabufMap.put("org_jboss_resteasy_example___CC2", new org_jboss_resteasy_example___CC2_FromJavabuf());
      toJavabufMap.put(CC3.class, new org_jboss_resteasy_example___CC3_ToJavabuf());
      fromJavabufMap.put("org_jboss_resteasy_example___CC3", new org_jboss_resteasy_example___CC3_FromJavabuf());
      toJavabufMap.put(CC6.class, new org_jboss_resteasy_example___CC6_ToJavabuf());
      fromJavabufMap.put("org_jboss_resteasy_example___CC6", new org_jboss_resteasy_example___CC6_FromJavabuf());
      toJavabufMap.put(CC7.class, new org_jboss_resteasy_example___CC7_ToJavabuf());
      fromJavabufMap.put("org_jboss_resteasy_example___CC7", new org_jboss_resteasy_example___CC7_FromJavabuf());
   }

   public static boolean handlesToJavabuf(Class<?> clazz) {
      return clazz.isPrimitive() || toJavabufMap.containsKey(clazz);
   }

   public static boolean handlesFromJavabuf(Class<?> clazz) {
      return clazz.isPrimitive() || toJavabufMap.containsKey(clazz);
   }

   public static Message translateToJavabuf(Object o) {
      TranslateToJavabuf ttj = toJavabufMap.get(o.getClass());
      if (ttj == null) {
         throw new RuntimeException(o.getClass() + " is not recognized");
      }
      return ttj.assignToJavabuf(o);
   }

   public static Object translateFromJavabuf(Message message) {
      String s = null;
      try {
         s = message.getDescriptorForType().getFullName();
         s = s.substring(s.lastIndexOf(".") + 1);
         TranslateFromJavabuf tfj = fromJavabufMap.get(s);
         if (tfj == null) {
            throw new RuntimeException(message.getClass() + " is not recognized");
         }
         return tfj.assignFromJavabuf(message);
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   private static AssignToJavabuf toJavabuf(Class<?> javaClass, FieldDescriptor fd) {
      try {
         AssignToJavabuf assignToJavabuf = (obj, messageBuilder) -> {
            try {
               if (isSuperClass(fd.getName())) {
                  Message message = toJavabufMap.get(obj.getClass().getSuperclass()).assignToJavabuf(obj);
                  messageBuilder.setField(fd, message);
               } else {
                  final Field field = javaClass.getDeclaredField(fd.getName());
                  field.setAccessible(true);
                  if (!String.class.equals(field.getType()) && toJavabufMap.keySet().contains(field.getType())) {
                     Message message = toJavabufMap.get(field.getType()).assignToJavabuf(field.get(obj));
                     messageBuilder.setField(fd, message);
                  } else {
                     messageBuilder.setField(fd, field.get(obj));
                  }
               }
            } catch (Exception e) {
               //
            }
         };
         return assignToJavabuf;
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   private static AssignFromJavabuf fromJavabuf(Class<?> javaClass, FieldDescriptor fd) {
      try {
         AssignFromJavabuf assignFromJavabuf = (message, object) -> {
            try {
               if (isSuperClass(fd.getName())) {
                  String superClassName = javaClassToJavabufClass(javaClass.getSuperclass().getName());
                  TranslateFromJavabuf t = fromJavabufMap.get(superClassName);
                  FieldDescriptor sfd = getSuperField(message);
                  Message superMessage = (Message) message.getField(sfd);
                  t.assignExistingFromJavabuf(superMessage, object);
               } else {
                  final Field field = javaClass.getDeclaredField(fd.getName());
                  field.setAccessible(true);
                  if (Descriptors.FieldDescriptor.Type.MESSAGE.equals(fd.getType())
                      && fromJavabufMap.keySet().contains(fd.getMessageType().getName())) {
                     Message submessage = (Message) message.getField(fd);
                     Object obj = fromJavabufMap.get(fd.getMessageType().getName()).assignFromJavabuf(submessage);
                     field.set(object, obj);
                  } else {
                     Object ooo = message.getField(fd);
                     field.set(object, ooo);
                  }
               }
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         };
         return assignFromJavabuf;
      } catch (Exception e) {
         throw new RuntimeException(e);
      }
   }

   private static String javaClassToJavabufClass(String javaClassName) {
      String javabufClassName = javaClassName.replace(".", "_");
      int i = javabufClassName.lastIndexOf("_");
      javabufClassName = javabufClassName.substring(0, i) + "___" + javabufClassName.substring(i + 1);
      return javabufClassName;
   }

   private static FieldDescriptor getSuperField(Message message) {
      Map<FieldDescriptor, Object> map = message.getAllFields();
      for (FieldDescriptor fd : map.keySet()) {
         if (fd.getName().endsWith("___super")) {
            return fd;
         }
      }
      return null;
   }

   private static Object messageToObject(Message message) throws ClassNotFoundException {
      String messageClassName = message.getClass().getName();
      int i = messageClassName.indexOf("___");
      String classname = messageClassName.substring(0, i).replaceAll("_", ".") + "." + messageClassName.substring(i + 2);
      return Class.forName(classname);
   }

   private static boolean isSuperClass(String fieldName) {
      return fieldName.endsWith("___super");
   }

   static class gShort_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gShort.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);

      public Message assignToJavabuf(Object x) {
         Short p = (Short) x;
         jaxrs.example.CC1_proto.gShort.Builder builder = jaxrs.example.CC1_proto.gShort.newBuilder();
         return builder.setValue(p.shortValue()).build();
      }
   }

   static class gShort_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gShort.getDescriptor();
      public Short assignFromJavabuf(Message message) {
         FieldDescriptor fd = descriptor.getFields().get(0);
         return ((Integer) message.getField(fd)).shortValue();
      }

      public void assignExistingFromJavabuf(Message message, Object obj) { }
   }

   static class gDouble_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gDouble.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);

      public Message assignToJavabuf(Object x) {
         Double p = (Double) x;
         jaxrs.example.CC1_proto.gDouble.Builder builder = jaxrs.example.CC1_proto.gDouble.newBuilder();
         return builder.setValue(p.doubleValue()).build();
      }
   }

   static class gDouble_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gDouble.getDescriptor();
      public Double assignFromJavabuf(Message message) {
         FieldDescriptor fd = descriptor.getFields().get(0);
         return (Double) message.getField(fd);
      }

      public void assignExistingFromJavabuf(Message message, Object obj) { }
   }

   static class gBoolean_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gBoolean.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);

      public Message assignToJavabuf(Object x) {
         Boolean p = (Boolean) x;
         jaxrs.example.CC1_proto.gBoolean.Builder builder = jaxrs.example.CC1_proto.gBoolean.newBuilder();
         return builder.setValue(p.booleanValue()).build();
      }
   }

   static class gBoolean_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gBoolean.getDescriptor();
      public Boolean assignFromJavabuf(Message message) {
         FieldDescriptor fd = descriptor.getFields().get(0);
         return (Boolean) message.getField(fd);
      }

      public void assignExistingFromJavabuf(Message message, Object obj) { }
   }

   static class gString_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gString.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);

      public Message assignToJavabuf(Object x) {
         String p = (String) x;
         jaxrs.example.CC1_proto.gString.Builder builder = jaxrs.example.CC1_proto.gString.newBuilder();
         return builder.setValue(p).build();
      }
   }

   static class gString_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gString.getDescriptor();
      public String assignFromJavabuf(Message message) {
         FieldDescriptor fd = descriptor.getFields().get(0);
         return (String) message.getField(fd);
      }

      public void assignExistingFromJavabuf(Message message, Object obj) { }
   }

   static class gLong_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gLong.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);

      public Message assignToJavabuf(Object x) {
         Long p = (Long) x;
         jaxrs.example.CC1_proto.gLong.Builder builder = jaxrs.example.CC1_proto.gLong.newBuilder();
         return builder.setValue(p.longValue()).build();
      }
   }

   static class gLong_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gLong.getDescriptor();
      public Long assignFromJavabuf(Message message) {
         FieldDescriptor fd = descriptor.getFields().get(0);
         return (Long) message.getField(fd);
      }

      public void assignExistingFromJavabuf(Message message, Object obj) { }
   }

   static class gByte_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gByte.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);

      public Message assignToJavabuf(Object x) {
         Byte p = (Byte) x;
         jaxrs.example.CC1_proto.gByte.Builder builder = jaxrs.example.CC1_proto.gByte.newBuilder();
         return builder.setValue(p.byteValue()).build();
      }
   }

   static class gByte_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gByte.getDescriptor();
      public Byte assignFromJavabuf(Message message) {
         FieldDescriptor fd = descriptor.getFields().get(0);
         return ((Integer) message.getField(fd)).byteValue();
      }

      public void assignExistingFromJavabuf(Message message, Object obj) { }
   }

   static class gCharacter_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gCharacter.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);

      public Message assignToJavabuf(Object x) {
         Character p = (Character) x;
         jaxrs.example.CC1_proto.gCharacter.Builder builder = jaxrs.example.CC1_proto.gCharacter.newBuilder();
         return builder.setValue(p.toString()).build();
      }
   }

   static class gCharacter_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gCharacter.getDescriptor();
      public Character assignFromJavabuf(Message message) {
         FieldDescriptor fd = descriptor.getFields().get(0);
         return ((String) message.getField(fd)).charAt(0);
      }

      public void assignExistingFromJavabuf(Message message, Object obj) { }
   }

   static class gFloat_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gFloat.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);

      public Message assignToJavabuf(Object x) {
         Float p = (Float) x;
         jaxrs.example.CC1_proto.gFloat.Builder builder = jaxrs.example.CC1_proto.gFloat.newBuilder();
         return builder.setValue(p.floatValue()).build();
      }
   }

   static class gFloat_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gFloat.getDescriptor();
      public Float assignFromJavabuf(Message message) {
         FieldDescriptor fd = descriptor.getFields().get(0);
         return (Float) message.getField(fd);
      }

      public void assignExistingFromJavabuf(Message message, Object obj) { }
   }

   static class gInteger_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gInteger.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);

      public Message assignToJavabuf(Object x) {
         Integer p = (Integer) x;
         jaxrs.example.CC1_proto.gInteger.Builder builder = jaxrs.example.CC1_proto.gInteger.newBuilder();
         return builder.setValue(p.intValue()).build();
      }
   }

   static class gInteger_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.gInteger.getDescriptor();
      public Integer assignFromJavabuf(Message message) {
         FieldDescriptor fd = descriptor.getFields().get(0);
         return (Integer) message.getField(fd);
      }

      public void assignExistingFromJavabuf(Message message, Object obj) { }
   }

   static class org_jboss_resteasy_example___CC5_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC5.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);
      private static List<AssignToJavabuf> assignList = new ArrayList<AssignToJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(toJavabuf(CC5.class, descriptor.findFieldByName(name)));
         }
      }

      public Message assignToJavabuf(Object c1) {
         for (AssignToJavabuf assignTo : assignList) {
            try {
               assignTo.assign(c1, builder);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return builder.build();
      }
   }

   static class org_jboss_resteasy_example___CC5_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC5.getDescriptor();
      private static List<AssignFromJavabuf> assignList = new ArrayList<AssignFromJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(fromJavabuf(CC5.class, descriptor.findFieldByName(name)));
         }
      }

      public CC5 assignFromJavabuf(Message message) {
         CC5 obj = new CC5();
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return obj;
      }

      public void assignExistingFromJavabuf(Message message, Object obj) {
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }
   }

   static class org_jboss_resteasy_example___CC4_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);
      private static List<AssignToJavabuf> assignList = new ArrayList<AssignToJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(toJavabuf(CC4.class, descriptor.findFieldByName(name)));
         }
      }

      public Message assignToJavabuf(Object c1) {
         for (AssignToJavabuf assignTo : assignList) {
            try {
               assignTo.assign(c1, builder);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return builder.build();
      }
   }

   static class org_jboss_resteasy_example___CC4_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4.getDescriptor();
      private static List<AssignFromJavabuf> assignList = new ArrayList<AssignFromJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(fromJavabuf(CC4.class, descriptor.findFieldByName(name)));
         }
      }

      public CC4 assignFromJavabuf(Message message) {
         CC4 obj = new CC4();
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return obj;
      }

      public void assignExistingFromJavabuf(Message message, Object obj) {
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }
   }

   static class org_jboss_resteasy_example___CC2_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);
      private static List<AssignToJavabuf> assignList = new ArrayList<AssignToJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(toJavabuf(CC2.class, descriptor.findFieldByName(name)));
         }
      }

      public Message assignToJavabuf(Object c1) {
         for (AssignToJavabuf assignTo : assignList) {
            try {
               assignTo.assign(c1, builder);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return builder.build();
      }
   }

   static class org_jboss_resteasy_example___CC2_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2.getDescriptor();
      private static List<AssignFromJavabuf> assignList = new ArrayList<AssignFromJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(fromJavabuf(CC2.class, descriptor.findFieldByName(name)));
         }
      }

      public CC2 assignFromJavabuf(Message message) {
         CC2 obj = new CC2();
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return obj;
      }

      public void assignExistingFromJavabuf(Message message, Object obj) {
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }
   }

   static class org_jboss_resteasy_example___CC3_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC3.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);
      private static List<AssignToJavabuf> assignList = new ArrayList<AssignToJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(toJavabuf(CC3.class, descriptor.findFieldByName(name)));
         }
      }

      public Message assignToJavabuf(Object c1) {
         for (AssignToJavabuf assignTo : assignList) {
            try {
               assignTo.assign(c1, builder);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return builder.build();
      }
   }

   static class org_jboss_resteasy_example___CC3_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC3.getDescriptor();
      private static List<AssignFromJavabuf> assignList = new ArrayList<AssignFromJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(fromJavabuf(CC3.class, descriptor.findFieldByName(name)));
         }
      }

      public CC3 assignFromJavabuf(Message message) {
         CC3 obj = new CC3();
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return obj;
      }

      public void assignExistingFromJavabuf(Message message, Object obj) {
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }
   }

   static class org_jboss_resteasy_example___CC6_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);
      private static List<AssignToJavabuf> assignList = new ArrayList<AssignToJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(toJavabuf(CC6.class, descriptor.findFieldByName(name)));
         }
      }

      public Message assignToJavabuf(Object c1) {
         for (AssignToJavabuf assignTo : assignList) {
            try {
               assignTo.assign(c1, builder);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return builder.build();
      }
   }

   static class org_jboss_resteasy_example___CC6_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6.getDescriptor();
      private static List<AssignFromJavabuf> assignList = new ArrayList<AssignFromJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(fromJavabuf(CC6.class, descriptor.findFieldByName(name)));
         }
      }

      public CC6 assignFromJavabuf(Message message) {
         CC6 obj = new CC6();
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return obj;
      }

      public void assignExistingFromJavabuf(Message message, Object obj) {
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }
   }

   static class org_jboss_resteasy_example___CC7_ToJavabuf implements TranslateToJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7.getDescriptor();
      private static DynamicMessage.Builder builder = DynamicMessage.newBuilder(descriptor);
      private static List<AssignToJavabuf> assignList = new ArrayList<AssignToJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(toJavabuf(CC7.class, descriptor.findFieldByName(name)));
         }
      }

      public Message assignToJavabuf(Object c1) {
         for (AssignToJavabuf assignTo : assignList) {
            try {
               assignTo.assign(c1, builder);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return builder.build();
      }
   }

   static class org_jboss_resteasy_example___CC7_FromJavabuf implements TranslateFromJavabuf {
      private static Descriptor descriptor = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7.getDescriptor();
      private static List<AssignFromJavabuf> assignList = new ArrayList<AssignFromJavabuf>();

      static {
         for (FieldDescriptor f : descriptor.getFields()) {
            String name = f.getName();
            if (descriptor.findFieldByName(name) == null) {
               continue;
            }
            assignList.add(fromJavabuf(CC7.class, descriptor.findFieldByName(name)));
         }
      }

      public CC7 assignFromJavabuf(Message message) {
         CC7 obj = new CC7();
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
         return obj;
      }

      public void assignExistingFromJavabuf(Message message, Object obj) {
         for (AssignFromJavabuf assignFrom : assignList) {
            try {
               assignFrom.assign(message, obj);
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         }
      }
   }

}
