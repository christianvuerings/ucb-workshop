#scala -cp swagger-codegen_2.10.0-2.0.13-assembly.jar -DfileMap=src/main/specs/api-docs src/main/scala/ScalatraServerGenerator.scala http://localhost:8080

scala -cp swagger-codegen_2.10.0-2.0.13-assembly.jar -DfileMap=src/main/specs/api-docs src/main/scala/JavaJaxRSServerGenerator.scala http://localhost:8080
