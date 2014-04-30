scala -cp swagger-codegen_2.10.0-2.0.13-assembly.jar -DfileMap=src/main/specs/api-docs src/main/scala/JavaClientCodegen.scala http://localhost:8080
scala -cp swagger-codegen_2.10.0-2.0.13-assembly.jar -DfileMap=src/main/specs/api-docs src/main/scala/ObjcClientCodegen.scala http://localhost:8080
scala -cp swagger-codegen_2.10.0-2.0.13-assembly.jar -DfileMap=src/main/specs/api-docs src/main/scala/PythonClientCodegen.scala http://localhost:8080
scala -cp swagger-codegen_2.10.0-2.0.13-assembly.jar -DfileMap=src/main/specs/api-docs src/main/scala/AndroidClientCodegen.scala http://localhost:8080
