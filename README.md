## retailer

See https://jira.westfieldlabs.com/browse/PRS-18

This service provides a persistent store of retailer information.

This service provides **both** HTTP/JSON and GRPC/Protobuf interfaces, and supports functionally identical **CRUD** services via each interface.

### This service requires the following to build and run:

* Access to the `github.com/westfield/protobuf` repo **or** the artifact (`protobuf-0.0.1-SNAPSHOT.jar`) built from it.
* Access to the `wrs.jfrog.io` Artifactory/JFrog repos.
* A machine set up with the software described on this [WRS-Wiki page](https://wiki.westfieldlabs.com/display/WL/Dev+Environment) 

### To build the service:
To build and run any unit-tests:
```
mvn clean install
```

To build and skip any unit-tests:
```
mvn clean install -DskipTests
```

### To start the service:

1. Start the PostGres database server.
```
brew services start postgresql
```

2. Create the **retailer** database, if needed.
```
createdb retailer
```

3. Start the **retailer** service.
```
mvn spring-boot:run
```

### To stop the service:

1. Stop the **retailer** service.
```
Control+C in the shell that you started the service in.
```

2. Stop the PostGres database server, if desired.
```
brew services stop postgresql
```

### Implementation details

* See the GRPC/protobuf definitions for this service in [github.com/westfield/protobuf/retailer](https://github.com/westfield/protobuf/tree/master/retailer)
* See the HTTP/JSON definitions for this service in [github.com/westfield/protobuf/generated/swagger/src/retailer/service](https://github.com/westfield/protobuf/blob/master/generated/swagger/src/retailer/service/retailer_service.swagger.json)
