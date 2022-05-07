package jaxrs.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: CC1.proto")
public final class CC1ServiceGrpc {

  private CC1ServiceGrpc() {}

  public static final String SERVICE_NAME = "jaxrs.example.CC1Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getReadyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ready",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getReadyMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getReadyMethod;
    if ((getReadyMethod = CC1ServiceGrpc.getReadyMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getReadyMethod = CC1ServiceGrpc.getReadyMethod) == null) {
          CC1ServiceGrpc.getReadyMethod = getReadyMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ready"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("ready"))
              .build();
        }
      }
    }
    return getReadyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gBoolean> getGetBooleanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBoolean",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gBoolean.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gBoolean> getGetBooleanMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gBoolean> getGetBooleanMethod;
    if ((getGetBooleanMethod = CC1ServiceGrpc.getGetBooleanMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetBooleanMethod = CC1ServiceGrpc.getGetBooleanMethod) == null) {
          CC1ServiceGrpc.getGetBooleanMethod = getGetBooleanMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gBoolean>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBoolean"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gBoolean.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getBoolean"))
              .build();
        }
      }
    }
    return getGetBooleanMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gBoolean> getGetBooleanWrapperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBooleanWrapper",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gBoolean.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gBoolean> getGetBooleanWrapperMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gBoolean> getGetBooleanWrapperMethod;
    if ((getGetBooleanWrapperMethod = CC1ServiceGrpc.getGetBooleanWrapperMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetBooleanWrapperMethod = CC1ServiceGrpc.getGetBooleanWrapperMethod) == null) {
          CC1ServiceGrpc.getGetBooleanWrapperMethod = getGetBooleanWrapperMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gBoolean>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBooleanWrapper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gBoolean.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getBooleanWrapper"))
              .build();
        }
      }
    }
    return getGetBooleanWrapperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gByte> getGetByteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByte",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gByte.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gByte> getGetByteMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gByte> getGetByteMethod;
    if ((getGetByteMethod = CC1ServiceGrpc.getGetByteMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetByteMethod = CC1ServiceGrpc.getGetByteMethod) == null) {
          CC1ServiceGrpc.getGetByteMethod = getGetByteMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gByte>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByte"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gByte.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getByte"))
              .build();
        }
      }
    }
    return getGetByteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gByte> getGetByteWrapperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getByteWrapper",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gByte.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gByte> getGetByteWrapperMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gByte> getGetByteWrapperMethod;
    if ((getGetByteWrapperMethod = CC1ServiceGrpc.getGetByteWrapperMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetByteWrapperMethod = CC1ServiceGrpc.getGetByteWrapperMethod) == null) {
          CC1ServiceGrpc.getGetByteWrapperMethod = getGetByteWrapperMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gByte>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getByteWrapper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gByte.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getByteWrapper"))
              .build();
        }
      }
    }
    return getGetByteWrapperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gShort> getGetShortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getShort",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gShort.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gShort> getGetShortMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gShort> getGetShortMethod;
    if ((getGetShortMethod = CC1ServiceGrpc.getGetShortMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetShortMethod = CC1ServiceGrpc.getGetShortMethod) == null) {
          CC1ServiceGrpc.getGetShortMethod = getGetShortMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gShort>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getShort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gShort.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getShort"))
              .build();
        }
      }
    }
    return getGetShortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gShort> getGetShortWrapperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getShortWrapper",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gShort.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gShort> getGetShortWrapperMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gShort> getGetShortWrapperMethod;
    if ((getGetShortWrapperMethod = CC1ServiceGrpc.getGetShortWrapperMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetShortWrapperMethod = CC1ServiceGrpc.getGetShortWrapperMethod) == null) {
          CC1ServiceGrpc.getGetShortWrapperMethod = getGetShortWrapperMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gShort>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getShortWrapper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gShort.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getShortWrapper"))
              .build();
        }
      }
    }
    return getGetShortWrapperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gInteger> getGetIntMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInt",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gInteger.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gInteger> getGetIntMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gInteger> getGetIntMethod;
    if ((getGetIntMethod = CC1ServiceGrpc.getGetIntMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetIntMethod = CC1ServiceGrpc.getGetIntMethod) == null) {
          CC1ServiceGrpc.getGetIntMethod = getGetIntMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gInteger>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getInt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gInteger.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getInt"))
              .build();
        }
      }
    }
    return getGetIntMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gInteger> getGetIntegerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getInteger",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gInteger.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gInteger> getGetIntegerMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gInteger> getGetIntegerMethod;
    if ((getGetIntegerMethod = CC1ServiceGrpc.getGetIntegerMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetIntegerMethod = CC1ServiceGrpc.getGetIntegerMethod) == null) {
          CC1ServiceGrpc.getGetIntegerMethod = getGetIntegerMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gInteger>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getInteger"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gInteger.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getInteger"))
              .build();
        }
      }
    }
    return getGetIntegerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gLong> getGetLongMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLong",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gLong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gLong> getGetLongMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gLong> getGetLongMethod;
    if ((getGetLongMethod = CC1ServiceGrpc.getGetLongMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetLongMethod = CC1ServiceGrpc.getGetLongMethod) == null) {
          CC1ServiceGrpc.getGetLongMethod = getGetLongMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gLong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLong"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gLong.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getLong"))
              .build();
        }
      }
    }
    return getGetLongMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gLong> getGetLongWrapperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLongWrapper",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gLong.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gLong> getGetLongWrapperMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gLong> getGetLongWrapperMethod;
    if ((getGetLongWrapperMethod = CC1ServiceGrpc.getGetLongWrapperMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetLongWrapperMethod = CC1ServiceGrpc.getGetLongWrapperMethod) == null) {
          CC1ServiceGrpc.getGetLongWrapperMethod = getGetLongWrapperMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gLong>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLongWrapper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gLong.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getLongWrapper"))
              .build();
        }
      }
    }
    return getGetLongWrapperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gFloat> getGetFloatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFloat",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gFloat.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gFloat> getGetFloatMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gFloat> getGetFloatMethod;
    if ((getGetFloatMethod = CC1ServiceGrpc.getGetFloatMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetFloatMethod = CC1ServiceGrpc.getGetFloatMethod) == null) {
          CC1ServiceGrpc.getGetFloatMethod = getGetFloatMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gFloat>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFloat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gFloat.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getFloat"))
              .build();
        }
      }
    }
    return getGetFloatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gFloat> getGetFloatWrapperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFloatWrapper",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gFloat.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gFloat> getGetFloatWrapperMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gFloat> getGetFloatWrapperMethod;
    if ((getGetFloatWrapperMethod = CC1ServiceGrpc.getGetFloatWrapperMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetFloatWrapperMethod = CC1ServiceGrpc.getGetFloatWrapperMethod) == null) {
          CC1ServiceGrpc.getGetFloatWrapperMethod = getGetFloatWrapperMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gFloat>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFloatWrapper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gFloat.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getFloatWrapper"))
              .build();
        }
      }
    }
    return getGetFloatWrapperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gDouble> getGetDoubleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDouble",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gDouble.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gDouble> getGetDoubleMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gDouble> getGetDoubleMethod;
    if ((getGetDoubleMethod = CC1ServiceGrpc.getGetDoubleMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetDoubleMethod = CC1ServiceGrpc.getGetDoubleMethod) == null) {
          CC1ServiceGrpc.getGetDoubleMethod = getGetDoubleMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gDouble>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDouble"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gDouble.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getDouble"))
              .build();
        }
      }
    }
    return getGetDoubleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gDouble> getGetDoubleWrapperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDoubleWrapper",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gDouble.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gDouble> getGetDoubleWrapperMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gDouble> getGetDoubleWrapperMethod;
    if ((getGetDoubleWrapperMethod = CC1ServiceGrpc.getGetDoubleWrapperMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetDoubleWrapperMethod = CC1ServiceGrpc.getGetDoubleWrapperMethod) == null) {
          CC1ServiceGrpc.getGetDoubleWrapperMethod = getGetDoubleWrapperMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gDouble>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDoubleWrapper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gDouble.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getDoubleWrapper"))
              .build();
        }
      }
    }
    return getGetDoubleWrapperMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gCharacter> getGetCharMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getChar",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gCharacter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gCharacter> getGetCharMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gCharacter> getGetCharMethod;
    if ((getGetCharMethod = CC1ServiceGrpc.getGetCharMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetCharMethod = CC1ServiceGrpc.getGetCharMethod) == null) {
          CC1ServiceGrpc.getGetCharMethod = getGetCharMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gCharacter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getChar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gCharacter.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getChar"))
              .build();
        }
      }
    }
    return getGetCharMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gCharacter> getGetCharacterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCharacter",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gCharacter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gCharacter> getGetCharacterMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gCharacter> getGetCharacterMethod;
    if ((getGetCharacterMethod = CC1ServiceGrpc.getGetCharacterMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetCharacterMethod = CC1ServiceGrpc.getGetCharacterMethod) == null) {
          CC1ServiceGrpc.getGetCharacterMethod = getGetCharacterMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gCharacter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCharacter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gCharacter.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getCharacter"))
              .build();
        }
      }
    }
    return getGetCharacterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getGetStringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getString",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getGetStringMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getGetStringMethod;
    if ((getGetStringMethod = CC1ServiceGrpc.getGetStringMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetStringMethod = CC1ServiceGrpc.getGetStringMethod) == null) {
          CC1ServiceGrpc.getGetStringMethod = getGetStringMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getString"))
              .build();
        }
      }
    }
    return getGetStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      com.google.protobuf.Any> getGetResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResponse",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = com.google.protobuf.Any.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      com.google.protobuf.Any> getGetResponseMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, com.google.protobuf.Any> getGetResponseMethod;
    if ((getGetResponseMethod = CC1ServiceGrpc.getGetResponseMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetResponseMethod = CC1ServiceGrpc.getGetResponseMethod) == null) {
          CC1ServiceGrpc.getGetResponseMethod = getGetResponseMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, com.google.protobuf.Any>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Any.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getResponse"))
              .build();
        }
      }
    }
    return getGetResponseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getGetResponseCompletionStageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getResponseCompletionStage",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getGetResponseCompletionStageMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getGetResponseCompletionStageMethod;
    if ((getGetResponseCompletionStageMethod = CC1ServiceGrpc.getGetResponseCompletionStageMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetResponseCompletionStageMethod = CC1ServiceGrpc.getGetResponseCompletionStageMethod) == null) {
          CC1ServiceGrpc.getGetResponseCompletionStageMethod = getGetResponseCompletionStageMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getResponseCompletionStage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getResponseCompletionStage"))
              .build();
        }
      }
    }
    return getGetResponseCompletionStageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7> getGetCC7Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCC7",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7> getGetCC7Method() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7> getGetCC7Method;
    if ((getGetCC7Method = CC1ServiceGrpc.getGetCC7Method) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getGetCC7Method = CC1ServiceGrpc.getGetCC7Method) == null) {
          CC1ServiceGrpc.getGetCC7Method = getGetCC7Method =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCC7"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("getCC7"))
              .build();
        }
      }
    }
    return getGetCC7Method;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getProducesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "produces",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getProducesMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getProducesMethod;
    if ((getProducesMethod = CC1ServiceGrpc.getProducesMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getProducesMethod = CC1ServiceGrpc.getProducesMethod) == null) {
          CC1ServiceGrpc.getProducesMethod = getProducesMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "produces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("produces"))
              .build();
        }
      }
    }
    return getProducesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getConsumesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "consumes",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getConsumesMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getConsumesMethod;
    if ((getConsumesMethod = CC1ServiceGrpc.getConsumesMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getConsumesMethod = CC1ServiceGrpc.getConsumesMethod) == null) {
          CC1ServiceGrpc.getConsumesMethod = getConsumesMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "consumes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("consumes"))
              .build();
        }
      }
    }
    return getConsumesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getPathParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pathParams",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getPathParamsMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getPathParamsMethod;
    if ((getPathParamsMethod = CC1ServiceGrpc.getPathParamsMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getPathParamsMethod = CC1ServiceGrpc.getPathParamsMethod) == null) {
          CC1ServiceGrpc.getPathParamsMethod = getPathParamsMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pathParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("pathParams"))
              .build();
        }
      }
    }
    return getPathParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getQueryParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "queryParams",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getQueryParamsMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getQueryParamsMethod;
    if ((getQueryParamsMethod = CC1ServiceGrpc.getQueryParamsMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getQueryParamsMethod = CC1ServiceGrpc.getQueryParamsMethod) == null) {
          CC1ServiceGrpc.getQueryParamsMethod = getQueryParamsMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "queryParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("queryParams"))
              .build();
        }
      }
    }
    return getQueryParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getMatrixParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "matrixParams",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getMatrixParamsMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getMatrixParamsMethod;
    if ((getMatrixParamsMethod = CC1ServiceGrpc.getMatrixParamsMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getMatrixParamsMethod = CC1ServiceGrpc.getMatrixParamsMethod) == null) {
          CC1ServiceGrpc.getMatrixParamsMethod = getMatrixParamsMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "matrixParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("matrixParams"))
              .build();
        }
      }
    }
    return getMatrixParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getCookieParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cookieParams",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getCookieParamsMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getCookieParamsMethod;
    if ((getCookieParamsMethod = CC1ServiceGrpc.getCookieParamsMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getCookieParamsMethod = CC1ServiceGrpc.getCookieParamsMethod) == null) {
          CC1ServiceGrpc.getCookieParamsMethod = getCookieParamsMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cookieParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("cookieParams"))
              .build();
        }
      }
    }
    return getCookieParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getHeaderParamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "headerParams",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getHeaderParamsMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getHeaderParamsMethod;
    if ((getHeaderParamsMethod = CC1ServiceGrpc.getHeaderParamsMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getHeaderParamsMethod = CC1ServiceGrpc.getHeaderParamsMethod) == null) {
          CC1ServiceGrpc.getHeaderParamsMethod = getHeaderParamsMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "headerParams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("headerParams"))
              .build();
        }
      }
    }
    return getHeaderParamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getParamsListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "paramsList",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getParamsListMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getParamsListMethod;
    if ((getParamsListMethod = CC1ServiceGrpc.getParamsListMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getParamsListMethod = CC1ServiceGrpc.getParamsListMethod) == null) {
          CC1ServiceGrpc.getParamsListMethod = getParamsListMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "paramsList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("paramsList"))
              .build();
        }
      }
    }
    return getParamsListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getParamsSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "paramsSet",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getParamsSetMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getParamsSetMethod;
    if ((getParamsSetMethod = CC1ServiceGrpc.getParamsSetMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getParamsSetMethod = CC1ServiceGrpc.getParamsSetMethod) == null) {
          CC1ServiceGrpc.getParamsSetMethod = getParamsSetMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "paramsSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("paramsSet"))
              .build();
        }
      }
    }
    return getParamsSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getParamsSortedSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "paramsSortedSet",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getParamsSortedSetMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getParamsSortedSetMethod;
    if ((getParamsSortedSetMethod = CC1ServiceGrpc.getParamsSortedSetMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getParamsSortedSetMethod = CC1ServiceGrpc.getParamsSortedSetMethod) == null) {
          CC1ServiceGrpc.getParamsSortedSetMethod = getParamsSortedSetMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "paramsSortedSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("paramsSortedSet"))
              .build();
        }
      }
    }
    return getParamsSortedSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      com.google.protobuf.Any> getSuspendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "suspend",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = com.google.protobuf.Any.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      com.google.protobuf.Any> getSuspendMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, com.google.protobuf.Any> getSuspendMethod;
    if ((getSuspendMethod = CC1ServiceGrpc.getSuspendMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getSuspendMethod = CC1ServiceGrpc.getSuspendMethod) == null) {
          CC1ServiceGrpc.getSuspendMethod = getSuspendMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, com.google.protobuf.Any>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "suspend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Any.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("suspend"))
              .build();
        }
      }
    }
    return getSuspendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "context",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getContextMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getContextMethod;
    if ((getContextMethod = CC1ServiceGrpc.getContextMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getContextMethod = CC1ServiceGrpc.getContextMethod) == null) {
          CC1ServiceGrpc.getContextMethod = getContextMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "context"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("context"))
              .build();
        }
      }
    }
    return getContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2> getInheritanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inheritance",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2> getInheritanceMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2> getInheritanceMethod;
    if ((getInheritanceMethod = CC1ServiceGrpc.getInheritanceMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getInheritanceMethod = CC1ServiceGrpc.getInheritanceMethod) == null) {
          CC1ServiceGrpc.getInheritanceMethod = getInheritanceMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "inheritance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("inheritance"))
              .build();
        }
      }
    }
    return getInheritanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4> getReferenceFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "referenceField",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4> getReferenceFieldMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4> getReferenceFieldMethod;
    if ((getReferenceFieldMethod = CC1ServiceGrpc.getReferenceFieldMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getReferenceFieldMethod = CC1ServiceGrpc.getReferenceFieldMethod) == null) {
          CC1ServiceGrpc.getReferenceFieldMethod = getReferenceFieldMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "referenceField"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("referenceField"))
              .build();
        }
      }
    }
    return getReferenceFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getM3Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "m3",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getM3Method() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getM3Method;
    if ((getM3Method = CC1ServiceGrpc.getM3Method) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getM3Method = CC1ServiceGrpc.getM3Method) == null) {
          CC1ServiceGrpc.getM3Method = getM3Method =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "m3"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("m3"))
              .build();
        }
      }
    }
    return getM3Method;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gBoolean> getM4Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "m4",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gBoolean.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gBoolean> getM4Method() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gBoolean> getM4Method;
    if ((getM4Method = CC1ServiceGrpc.getM4Method) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getM4Method = CC1ServiceGrpc.getM4Method) == null) {
          CC1ServiceGrpc.getM4Method = getM4Method =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gBoolean>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "m4"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gBoolean.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("m4"))
              .build();
        }
      }
    }
    return getM4Method;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getM5Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "m5",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getM5Method() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getM5Method;
    if ((getM5Method = CC1ServiceGrpc.getM5Method) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getM5Method = CC1ServiceGrpc.getM5Method) == null) {
          CC1ServiceGrpc.getM5Method = getM5Method =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "m5"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("m5"))
              .build();
        }
      }
    }
    return getM5Method;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6> getM7Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "m7",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6> getM7Method() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6> getM7Method;
    if ((getM7Method = CC1ServiceGrpc.getM7Method) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getM7Method = CC1ServiceGrpc.getM7Method) == null) {
          CC1ServiceGrpc.getM7Method = getM7Method =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "m7"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("m7"))
              .build();
        }
      }
    }
    return getM7Method;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getTestServletInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testServletInfo",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getTestServletInfoMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getTestServletInfoMethod;
    if ((getTestServletInfoMethod = CC1ServiceGrpc.getTestServletInfoMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getTestServletInfoMethod = CC1ServiceGrpc.getTestServletInfoMethod) == null) {
          CC1ServiceGrpc.getTestServletInfoMethod = getTestServletInfoMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testServletInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("testServletInfo"))
              .build();
        }
      }
    }
    return getTestServletInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getFoundMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "found",
      requestType = jaxrs.example.CC1_proto.GeneralEntityMessage.class,
      responseType = jaxrs.example.CC1_proto.gString.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage,
      jaxrs.example.CC1_proto.gString> getFoundMethod() {
    io.grpc.MethodDescriptor<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString> getFoundMethod;
    if ((getFoundMethod = CC1ServiceGrpc.getFoundMethod) == null) {
      synchronized (CC1ServiceGrpc.class) {
        if ((getFoundMethod = CC1ServiceGrpc.getFoundMethod) == null) {
          CC1ServiceGrpc.getFoundMethod = getFoundMethod =
              io.grpc.MethodDescriptor.<jaxrs.example.CC1_proto.GeneralEntityMessage, jaxrs.example.CC1_proto.gString>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "found"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.GeneralEntityMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jaxrs.example.CC1_proto.gString.getDefaultInstance()))
              .setSchemaDescriptor(new CC1ServiceMethodDescriptorSupplier("found"))
              .build();
        }
      }
    }
    return getFoundMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CC1ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CC1ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CC1ServiceStub>() {
        @java.lang.Override
        public CC1ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CC1ServiceStub(channel, callOptions);
        }
      };
    return CC1ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CC1ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CC1ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CC1ServiceBlockingStub>() {
        @java.lang.Override
        public CC1ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CC1ServiceBlockingStub(channel, callOptions);
        }
      };
    return CC1ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CC1ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CC1ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CC1ServiceFutureStub>() {
        @java.lang.Override
        public CC1ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CC1ServiceFutureStub(channel, callOptions);
        }
      };
    return CC1ServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CC1ServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * p/ready gEmpty GET sync
     * </pre>
     */
    public void ready(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadyMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/boolean gBoolean POST sync
     * </pre>
     */
    public void getBoolean(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gBoolean> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBooleanMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/Boolean gBoolean POST sync
     * </pre>
     */
    public void getBooleanWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gBoolean> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBooleanWrapperMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/byte gByte POST sync
     * </pre>
     */
    public void getByte(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gByte> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByteMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/Byte gByte POST sync
     * </pre>
     */
    public void getByteWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gByte> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetByteWrapperMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/short gShort POST sync
     * </pre>
     */
    public void getShort(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gShort> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetShortMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/Short gShort POST sync
     * </pre>
     */
    public void getShortWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gShort> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetShortWrapperMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/int gInteger POST sync
     * </pre>
     */
    public void getInt(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gInteger> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/Integer gInteger POST sync
     * </pre>
     */
    public void getInteger(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gInteger> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntegerMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/long gLong POST sync
     * </pre>
     */
    public void getLong(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gLong> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLongMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/Long gLong POST sync
     * </pre>
     */
    public void getLongWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gLong> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLongWrapperMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/float gFloat POST sync
     * </pre>
     */
    public void getFloat(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gFloat> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFloatMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/Float gFloat POST sync
     * </pre>
     */
    public void getFloatWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gFloat> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFloatWrapperMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/double gDouble POST sync
     * </pre>
     */
    public void getDouble(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gDouble> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDoubleMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/Double gDouble POST sync
     * </pre>
     */
    public void getDoubleWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gDouble> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDoubleWrapperMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/char gCharacter POST sync
     * </pre>
     */
    public void getChar(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gCharacter> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCharMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/Character gCharacter POST sync
     * </pre>
     */
    public void getCharacter(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gCharacter> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCharacterMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/string gString POST sync
     * </pre>
     */
    public void getString(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStringMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/response gEmpty GET sync
     * </pre>
     */
    public void getResponse(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Any> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResponseMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/async/cs gEmpty GET completionStage
     * </pre>
     */
    public void getResponseCompletionStage(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetResponseCompletionStageMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/cc7 gEmpty GET sync
     * </pre>
     */
    public void getCC7(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCC7Method(), responseObserver);
    }

    /**
     * <pre>
     * p/produces gEmpty GET sync
     * </pre>
     */
    public void produces(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProducesMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/consumes gEmpty GET sync
     * </pre>
     */
    public void consumes(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConsumesMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/path/{p1}/param/{p2} gEmpty GET sync
     * </pre>
     */
    public void pathParams(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPathParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/query gEmpty GET sync
     * </pre>
     */
    public void queryParams(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getQueryParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/matrix/more gEmpty GET sync
     * </pre>
     */
    public void matrixParams(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMatrixParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/cookieParams gEmpty GET sync
     * </pre>
     */
    public void cookieParams(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCookieParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/headerParams gEmpty GET sync
     * </pre>
     */
    public void headerParams(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHeaderParamsMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/params/{p1}/list/{p1} gEmpty GET sync
     * </pre>
     */
    public void paramsList(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsListMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/params/{p1}/set/{p1} gEmpty GET sync
     * </pre>
     */
    public void paramsSet(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/params/{p1}/sortedset/{p1} gEmpty GET sync
     * </pre>
     */
    public void paramsSortedSet(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParamsSortedSetMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/suspend gEmpty GET suspended
     * </pre>
     */
    public void suspend(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Any> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/context gEmpty GET sync
     * </pre>
     */
    public void context(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getContextMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/inheritance org_jboss_resteasy_example___CC2 POST sync
     * </pre>
     */
    public void inheritance(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInheritanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/reference org_jboss_resteasy_example___CC4 POST sync
     * </pre>
     */
    public void referenceField(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReferenceFieldMethod(), responseObserver);
    }

    /**
     * <pre>
     * p/m3 org_jboss_resteasy_example___CC4 POST sync
     * </pre>
     */
    public void m3(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getM3Method(), responseObserver);
    }

    /**
     * <pre>
     * p/m4 gInteger POST sync
     * </pre>
     */
    public void m4(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gBoolean> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getM4Method(), responseObserver);
    }

    /**
     * <pre>
     * p/m5 gEmpty GET sync
     * </pre>
     */
    public void m5(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getM5Method(), responseObserver);
    }

    /**
     * <pre>
     * p/m7 gInteger POST sync
     * </pre>
     */
    public void m7(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getM7Method(), responseObserver);
    }

    /**
     * <pre>
     * p/servletInfo gEmpty POST sync
     * </pre>
     */
    public void testServletInfo(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestServletInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * q/found gEmpty GET sync
     * </pre>
     */
    public void found(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFoundMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_READY)))
          .addMethod(
            getGetBooleanMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gBoolean>(
                  this, METHODID_GET_BOOLEAN)))
          .addMethod(
            getGetBooleanWrapperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gBoolean>(
                  this, METHODID_GET_BOOLEAN_WRAPPER)))
          .addMethod(
            getGetByteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gByte>(
                  this, METHODID_GET_BYTE)))
          .addMethod(
            getGetByteWrapperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gByte>(
                  this, METHODID_GET_BYTE_WRAPPER)))
          .addMethod(
            getGetShortMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gShort>(
                  this, METHODID_GET_SHORT)))
          .addMethod(
            getGetShortWrapperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gShort>(
                  this, METHODID_GET_SHORT_WRAPPER)))
          .addMethod(
            getGetIntMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gInteger>(
                  this, METHODID_GET_INT)))
          .addMethod(
            getGetIntegerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gInteger>(
                  this, METHODID_GET_INTEGER)))
          .addMethod(
            getGetLongMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gLong>(
                  this, METHODID_GET_LONG)))
          .addMethod(
            getGetLongWrapperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gLong>(
                  this, METHODID_GET_LONG_WRAPPER)))
          .addMethod(
            getGetFloatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gFloat>(
                  this, METHODID_GET_FLOAT)))
          .addMethod(
            getGetFloatWrapperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gFloat>(
                  this, METHODID_GET_FLOAT_WRAPPER)))
          .addMethod(
            getGetDoubleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gDouble>(
                  this, METHODID_GET_DOUBLE)))
          .addMethod(
            getGetDoubleWrapperMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gDouble>(
                  this, METHODID_GET_DOUBLE_WRAPPER)))
          .addMethod(
            getGetCharMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gCharacter>(
                  this, METHODID_GET_CHAR)))
          .addMethod(
            getGetCharacterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gCharacter>(
                  this, METHODID_GET_CHARACTER)))
          .addMethod(
            getGetStringMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_GET_STRING)))
          .addMethod(
            getGetResponseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                com.google.protobuf.Any>(
                  this, METHODID_GET_RESPONSE)))
          .addMethod(
            getGetResponseCompletionStageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_GET_RESPONSE_COMPLETION_STAGE)))
          .addMethod(
            getGetCC7Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7>(
                  this, METHODID_GET_CC7)))
          .addMethod(
            getProducesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_PRODUCES)))
          .addMethod(
            getConsumesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_CONSUMES)))
          .addMethod(
            getPathParamsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_PATH_PARAMS)))
          .addMethod(
            getQueryParamsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_QUERY_PARAMS)))
          .addMethod(
            getMatrixParamsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_MATRIX_PARAMS)))
          .addMethod(
            getCookieParamsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_COOKIE_PARAMS)))
          .addMethod(
            getHeaderParamsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_HEADER_PARAMS)))
          .addMethod(
            getParamsListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_PARAMS_LIST)))
          .addMethod(
            getParamsSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_PARAMS_SET)))
          .addMethod(
            getParamsSortedSetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_PARAMS_SORTED_SET)))
          .addMethod(
            getSuspendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                com.google.protobuf.Any>(
                  this, METHODID_SUSPEND)))
          .addMethod(
            getContextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_CONTEXT)))
          .addMethod(
            getInheritanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2>(
                  this, METHODID_INHERITANCE)))
          .addMethod(
            getReferenceFieldMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4>(
                  this, METHODID_REFERENCE_FIELD)))
          .addMethod(
            getM3Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_M3)))
          .addMethod(
            getM4Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gBoolean>(
                  this, METHODID_M4)))
          .addMethod(
            getM5Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_M5)))
          .addMethod(
            getM7Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6>(
                  this, METHODID_M7)))
          .addMethod(
            getTestServletInfoMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_TEST_SERVLET_INFO)))
          .addMethod(
            getFoundMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jaxrs.example.CC1_proto.GeneralEntityMessage,
                jaxrs.example.CC1_proto.gString>(
                  this, METHODID_FOUND)))
          .build();
    }
  }

  /**
   */
  public static final class CC1ServiceStub extends io.grpc.stub.AbstractAsyncStub<CC1ServiceStub> {
    private CC1ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CC1ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CC1ServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * p/ready gEmpty GET sync
     * </pre>
     */
    public void ready(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/boolean gBoolean POST sync
     * </pre>
     */
    public void getBoolean(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gBoolean> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBooleanMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/Boolean gBoolean POST sync
     * </pre>
     */
    public void getBooleanWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gBoolean> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBooleanWrapperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/byte gByte POST sync
     * </pre>
     */
    public void getByte(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gByte> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/Byte gByte POST sync
     * </pre>
     */
    public void getByteWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gByte> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetByteWrapperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/short gShort POST sync
     * </pre>
     */
    public void getShort(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gShort> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetShortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/Short gShort POST sync
     * </pre>
     */
    public void getShortWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gShort> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetShortWrapperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/int gInteger POST sync
     * </pre>
     */
    public void getInt(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gInteger> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/Integer gInteger POST sync
     * </pre>
     */
    public void getInteger(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gInteger> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntegerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/long gLong POST sync
     * </pre>
     */
    public void getLong(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gLong> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLongMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/Long gLong POST sync
     * </pre>
     */
    public void getLongWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gLong> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLongWrapperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/float gFloat POST sync
     * </pre>
     */
    public void getFloat(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gFloat> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFloatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/Float gFloat POST sync
     * </pre>
     */
    public void getFloatWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gFloat> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFloatWrapperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/double gDouble POST sync
     * </pre>
     */
    public void getDouble(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gDouble> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDoubleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/Double gDouble POST sync
     * </pre>
     */
    public void getDoubleWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gDouble> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDoubleWrapperMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/char gCharacter POST sync
     * </pre>
     */
    public void getChar(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gCharacter> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCharMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/Character gCharacter POST sync
     * </pre>
     */
    public void getCharacter(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gCharacter> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCharacterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/string gString POST sync
     * </pre>
     */
    public void getString(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/response gEmpty GET sync
     * </pre>
     */
    public void getResponse(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Any> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResponseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/async/cs gEmpty GET completionStage
     * </pre>
     */
    public void getResponseCompletionStage(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetResponseCompletionStageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/cc7 gEmpty GET sync
     * </pre>
     */
    public void getCC7(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCC7Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/produces gEmpty GET sync
     * </pre>
     */
    public void produces(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProducesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/consumes gEmpty GET sync
     * </pre>
     */
    public void consumes(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConsumesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/path/{p1}/param/{p2} gEmpty GET sync
     * </pre>
     */
    public void pathParams(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPathParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/query gEmpty GET sync
     * </pre>
     */
    public void queryParams(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/matrix/more gEmpty GET sync
     * </pre>
     */
    public void matrixParams(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMatrixParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/cookieParams gEmpty GET sync
     * </pre>
     */
    public void cookieParams(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCookieParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/headerParams gEmpty GET sync
     * </pre>
     */
    public void headerParams(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHeaderParamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/params/{p1}/list/{p1} gEmpty GET sync
     * </pre>
     */
    public void paramsList(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/params/{p1}/set/{p1} gEmpty GET sync
     * </pre>
     */
    public void paramsSet(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/params/{p1}/sortedset/{p1} gEmpty GET sync
     * </pre>
     */
    public void paramsSortedSet(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParamsSortedSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/suspend gEmpty GET suspended
     * </pre>
     */
    public void suspend(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Any> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/context gEmpty GET sync
     * </pre>
     */
    public void context(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/inheritance org_jboss_resteasy_example___CC2 POST sync
     * </pre>
     */
    public void inheritance(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInheritanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/reference org_jboss_resteasy_example___CC4 POST sync
     * </pre>
     */
    public void referenceField(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReferenceFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/m3 org_jboss_resteasy_example___CC4 POST sync
     * </pre>
     */
    public void m3(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getM3Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/m4 gInteger POST sync
     * </pre>
     */
    public void m4(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gBoolean> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getM4Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/m5 gEmpty GET sync
     * </pre>
     */
    public void m5(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getM5Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/m7 gInteger POST sync
     * </pre>
     */
    public void m7(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getM7Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * p/servletInfo gEmpty POST sync
     * </pre>
     */
    public void testServletInfo(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestServletInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * q/found gEmpty GET sync
     * </pre>
     */
    public void found(jaxrs.example.CC1_proto.GeneralEntityMessage request,
        io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFoundMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CC1ServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CC1ServiceBlockingStub> {
    private CC1ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CC1ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CC1ServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * p/ready gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString ready(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/boolean gBoolean POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gBoolean getBoolean(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBooleanMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/Boolean gBoolean POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gBoolean getBooleanWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBooleanWrapperMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/byte gByte POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gByte getByte(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/Byte gByte POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gByte getByteWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetByteWrapperMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/short gShort POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gShort getShort(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetShortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/Short gShort POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gShort getShortWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetShortWrapperMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/int gInteger POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gInteger getInt(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/Integer gInteger POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gInteger getInteger(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntegerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/long gLong POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gLong getLong(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLongMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/Long gLong POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gLong getLongWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLongWrapperMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/float gFloat POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gFloat getFloat(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFloatMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/Float gFloat POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gFloat getFloatWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFloatWrapperMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/double gDouble POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gDouble getDouble(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDoubleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/Double gDouble POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gDouble getDoubleWrapper(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDoubleWrapperMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/char gCharacter POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gCharacter getChar(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCharMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/Character gCharacter POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gCharacter getCharacter(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCharacterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/string gString POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString getString(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/response gEmpty GET sync
     * </pre>
     */
    public com.google.protobuf.Any getResponse(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResponseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/async/cs gEmpty GET completionStage
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString getResponseCompletionStage(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetResponseCompletionStageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/cc7 gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7 getCC7(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCC7Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/produces gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString produces(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProducesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/consumes gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString consumes(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConsumesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/path/{p1}/param/{p2} gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString pathParams(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPathParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/query gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString queryParams(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getQueryParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/matrix/more gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString matrixParams(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMatrixParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/cookieParams gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString cookieParams(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCookieParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/headerParams gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString headerParams(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHeaderParamsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/params/{p1}/list/{p1} gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString paramsList(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/params/{p1}/set/{p1} gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString paramsSet(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/params/{p1}/sortedset/{p1} gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString paramsSortedSet(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParamsSortedSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/suspend gEmpty GET suspended
     * </pre>
     */
    public com.google.protobuf.Any suspend(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/context gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString context(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getContextMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/inheritance org_jboss_resteasy_example___CC2 POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2 inheritance(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInheritanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/reference org_jboss_resteasy_example___CC4 POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4 referenceField(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReferenceFieldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/m3 org_jboss_resteasy_example___CC4 POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString m3(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getM3Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/m4 gInteger POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gBoolean m4(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getM4Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/m5 gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString m5(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getM5Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/m7 gInteger POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6 m7(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getM7Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     * p/servletInfo gEmpty POST sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString testServletInfo(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestServletInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * q/found gEmpty GET sync
     * </pre>
     */
    public jaxrs.example.CC1_proto.gString found(jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFoundMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CC1ServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CC1ServiceFutureStub> {
    private CC1ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CC1ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CC1ServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * p/ready gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> ready(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/boolean gBoolean POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gBoolean> getBoolean(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBooleanMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/Boolean gBoolean POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gBoolean> getBooleanWrapper(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBooleanWrapperMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/byte gByte POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gByte> getByte(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/Byte gByte POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gByte> getByteWrapper(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetByteWrapperMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/short gShort POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gShort> getShort(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetShortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/Short gShort POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gShort> getShortWrapper(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetShortWrapperMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/int gInteger POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gInteger> getInt(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/Integer gInteger POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gInteger> getInteger(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntegerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/long gLong POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gLong> getLong(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLongMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/Long gLong POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gLong> getLongWrapper(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLongWrapperMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/float gFloat POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gFloat> getFloat(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFloatMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/Float gFloat POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gFloat> getFloatWrapper(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFloatWrapperMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/double gDouble POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gDouble> getDouble(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDoubleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/Double gDouble POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gDouble> getDoubleWrapper(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDoubleWrapperMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/char gCharacter POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gCharacter> getChar(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCharMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/Character gCharacter POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gCharacter> getCharacter(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCharacterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/string gString POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> getString(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStringMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/response gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Any> getResponse(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResponseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/async/cs gEmpty GET completionStage
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> getResponseCompletionStage(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetResponseCompletionStageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/cc7 gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7> getCC7(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCC7Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/produces gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> produces(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProducesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/consumes gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> consumes(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConsumesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/path/{p1}/param/{p2} gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> pathParams(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPathParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/query gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> queryParams(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getQueryParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/matrix/more gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> matrixParams(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMatrixParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/cookieParams gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> cookieParams(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCookieParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/headerParams gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> headerParams(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHeaderParamsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/params/{p1}/list/{p1} gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> paramsList(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/params/{p1}/set/{p1} gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> paramsSet(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/params/{p1}/sortedset/{p1} gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> paramsSortedSet(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParamsSortedSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/suspend gEmpty GET suspended
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Any> suspend(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/context gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> context(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getContextMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/inheritance org_jboss_resteasy_example___CC2 POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2> inheritance(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInheritanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/reference org_jboss_resteasy_example___CC4 POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4> referenceField(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReferenceFieldMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/m3 org_jboss_resteasy_example___CC4 POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> m3(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getM3Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/m4 gInteger POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gBoolean> m4(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getM4Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/m5 gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> m5(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getM5Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/m7 gInteger POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6> m7(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getM7Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     * p/servletInfo gEmpty POST sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> testServletInfo(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestServletInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * q/found gEmpty GET sync
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<jaxrs.example.CC1_proto.gString> found(
        jaxrs.example.CC1_proto.GeneralEntityMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFoundMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READY = 0;
  private static final int METHODID_GET_BOOLEAN = 1;
  private static final int METHODID_GET_BOOLEAN_WRAPPER = 2;
  private static final int METHODID_GET_BYTE = 3;
  private static final int METHODID_GET_BYTE_WRAPPER = 4;
  private static final int METHODID_GET_SHORT = 5;
  private static final int METHODID_GET_SHORT_WRAPPER = 6;
  private static final int METHODID_GET_INT = 7;
  private static final int METHODID_GET_INTEGER = 8;
  private static final int METHODID_GET_LONG = 9;
  private static final int METHODID_GET_LONG_WRAPPER = 10;
  private static final int METHODID_GET_FLOAT = 11;
  private static final int METHODID_GET_FLOAT_WRAPPER = 12;
  private static final int METHODID_GET_DOUBLE = 13;
  private static final int METHODID_GET_DOUBLE_WRAPPER = 14;
  private static final int METHODID_GET_CHAR = 15;
  private static final int METHODID_GET_CHARACTER = 16;
  private static final int METHODID_GET_STRING = 17;
  private static final int METHODID_GET_RESPONSE = 18;
  private static final int METHODID_GET_RESPONSE_COMPLETION_STAGE = 19;
  private static final int METHODID_GET_CC7 = 20;
  private static final int METHODID_PRODUCES = 21;
  private static final int METHODID_CONSUMES = 22;
  private static final int METHODID_PATH_PARAMS = 23;
  private static final int METHODID_QUERY_PARAMS = 24;
  private static final int METHODID_MATRIX_PARAMS = 25;
  private static final int METHODID_COOKIE_PARAMS = 26;
  private static final int METHODID_HEADER_PARAMS = 27;
  private static final int METHODID_PARAMS_LIST = 28;
  private static final int METHODID_PARAMS_SET = 29;
  private static final int METHODID_PARAMS_SORTED_SET = 30;
  private static final int METHODID_SUSPEND = 31;
  private static final int METHODID_CONTEXT = 32;
  private static final int METHODID_INHERITANCE = 33;
  private static final int METHODID_REFERENCE_FIELD = 34;
  private static final int METHODID_M3 = 35;
  private static final int METHODID_M4 = 36;
  private static final int METHODID_M5 = 37;
  private static final int METHODID_M7 = 38;
  private static final int METHODID_TEST_SERVLET_INFO = 39;
  private static final int METHODID_FOUND = 40;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CC1ServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CC1ServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READY:
          serviceImpl.ready((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_GET_BOOLEAN:
          serviceImpl.getBoolean((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gBoolean>) responseObserver);
          break;
        case METHODID_GET_BOOLEAN_WRAPPER:
          serviceImpl.getBooleanWrapper((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gBoolean>) responseObserver);
          break;
        case METHODID_GET_BYTE:
          serviceImpl.getByte((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gByte>) responseObserver);
          break;
        case METHODID_GET_BYTE_WRAPPER:
          serviceImpl.getByteWrapper((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gByte>) responseObserver);
          break;
        case METHODID_GET_SHORT:
          serviceImpl.getShort((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gShort>) responseObserver);
          break;
        case METHODID_GET_SHORT_WRAPPER:
          serviceImpl.getShortWrapper((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gShort>) responseObserver);
          break;
        case METHODID_GET_INT:
          serviceImpl.getInt((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gInteger>) responseObserver);
          break;
        case METHODID_GET_INTEGER:
          serviceImpl.getInteger((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gInteger>) responseObserver);
          break;
        case METHODID_GET_LONG:
          serviceImpl.getLong((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gLong>) responseObserver);
          break;
        case METHODID_GET_LONG_WRAPPER:
          serviceImpl.getLongWrapper((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gLong>) responseObserver);
          break;
        case METHODID_GET_FLOAT:
          serviceImpl.getFloat((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gFloat>) responseObserver);
          break;
        case METHODID_GET_FLOAT_WRAPPER:
          serviceImpl.getFloatWrapper((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gFloat>) responseObserver);
          break;
        case METHODID_GET_DOUBLE:
          serviceImpl.getDouble((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gDouble>) responseObserver);
          break;
        case METHODID_GET_DOUBLE_WRAPPER:
          serviceImpl.getDoubleWrapper((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gDouble>) responseObserver);
          break;
        case METHODID_GET_CHAR:
          serviceImpl.getChar((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gCharacter>) responseObserver);
          break;
        case METHODID_GET_CHARACTER:
          serviceImpl.getCharacter((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gCharacter>) responseObserver);
          break;
        case METHODID_GET_STRING:
          serviceImpl.getString((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_GET_RESPONSE:
          serviceImpl.getResponse((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Any>) responseObserver);
          break;
        case METHODID_GET_RESPONSE_COMPLETION_STAGE:
          serviceImpl.getResponseCompletionStage((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_GET_CC7:
          serviceImpl.getCC7((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC7>) responseObserver);
          break;
        case METHODID_PRODUCES:
          serviceImpl.produces((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_CONSUMES:
          serviceImpl.consumes((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_PATH_PARAMS:
          serviceImpl.pathParams((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_QUERY_PARAMS:
          serviceImpl.queryParams((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_MATRIX_PARAMS:
          serviceImpl.matrixParams((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_COOKIE_PARAMS:
          serviceImpl.cookieParams((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_HEADER_PARAMS:
          serviceImpl.headerParams((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_PARAMS_LIST:
          serviceImpl.paramsList((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_PARAMS_SET:
          serviceImpl.paramsSet((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_PARAMS_SORTED_SET:
          serviceImpl.paramsSortedSet((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_SUSPEND:
          serviceImpl.suspend((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Any>) responseObserver);
          break;
        case METHODID_CONTEXT:
          serviceImpl.context((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_INHERITANCE:
          serviceImpl.inheritance((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC2>) responseObserver);
          break;
        case METHODID_REFERENCE_FIELD:
          serviceImpl.referenceField((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC4>) responseObserver);
          break;
        case METHODID_M3:
          serviceImpl.m3((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_M4:
          serviceImpl.m4((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gBoolean>) responseObserver);
          break;
        case METHODID_M5:
          serviceImpl.m5((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_M7:
          serviceImpl.m7((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.org_jboss_resteasy_example___CC6>) responseObserver);
          break;
        case METHODID_TEST_SERVLET_INFO:
          serviceImpl.testServletInfo((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        case METHODID_FOUND:
          serviceImpl.found((jaxrs.example.CC1_proto.GeneralEntityMessage) request,
              (io.grpc.stub.StreamObserver<jaxrs.example.CC1_proto.gString>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CC1ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CC1ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return jaxrs.example.CC1_proto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CC1Service");
    }
  }

  private static final class CC1ServiceFileDescriptorSupplier
      extends CC1ServiceBaseDescriptorSupplier {
    CC1ServiceFileDescriptorSupplier() {}
  }

  private static final class CC1ServiceMethodDescriptorSupplier
      extends CC1ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CC1ServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CC1ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CC1ServiceFileDescriptorSupplier())
              .addMethod(getReadyMethod())
              .addMethod(getGetBooleanMethod())
              .addMethod(getGetBooleanWrapperMethod())
              .addMethod(getGetByteMethod())
              .addMethod(getGetByteWrapperMethod())
              .addMethod(getGetShortMethod())
              .addMethod(getGetShortWrapperMethod())
              .addMethod(getGetIntMethod())
              .addMethod(getGetIntegerMethod())
              .addMethod(getGetLongMethod())
              .addMethod(getGetLongWrapperMethod())
              .addMethod(getGetFloatMethod())
              .addMethod(getGetFloatWrapperMethod())
              .addMethod(getGetDoubleMethod())
              .addMethod(getGetDoubleWrapperMethod())
              .addMethod(getGetCharMethod())
              .addMethod(getGetCharacterMethod())
              .addMethod(getGetStringMethod())
              .addMethod(getGetResponseMethod())
              .addMethod(getGetResponseCompletionStageMethod())
              .addMethod(getGetCC7Method())
              .addMethod(getProducesMethod())
              .addMethod(getConsumesMethod())
              .addMethod(getPathParamsMethod())
              .addMethod(getQueryParamsMethod())
              .addMethod(getMatrixParamsMethod())
              .addMethod(getCookieParamsMethod())
              .addMethod(getHeaderParamsMethod())
              .addMethod(getParamsListMethod())
              .addMethod(getParamsSetMethod())
              .addMethod(getParamsSortedSetMethod())
              .addMethod(getSuspendMethod())
              .addMethod(getContextMethod())
              .addMethod(getInheritanceMethod())
              .addMethod(getReferenceFieldMethod())
              .addMethod(getM3Method())
              .addMethod(getM4Method())
              .addMethod(getM5Method())
              .addMethod(getM7Method())
              .addMethod(getTestServletInfoMethod())
              .addMethod(getFoundMethod())
              .build();
        }
      }
    }
    return result;
  }
}
