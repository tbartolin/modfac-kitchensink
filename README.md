# kitchensink-spring

Migration of JBoss EAP kitchensink quickstart app to Spring Boot 3.3.3  

Uses exising Jersey REST service (spring-boot-starter-jersey) and JSF views ([JoinFaces](https://github.com/joinfaces/joinfaces)).

Also refactored to use MongoDB (spring-boot-starter-data-mongodb) instead of the H2 in-memory database.  

# Requirements
Java SDK 21  
Maven

# Deployment

Clone repository locally.  
  
Modify `application.properties` file in the `src/main/resources` directory and configure your MongoDB URI (example Atlas URI):  
`MONGODB_URI=mongodb+srv://<USER>:<PWD>@clusterX.XXXX.mongodb.net/?retryWrites=true&w=majority&appName=kitchensink-spring`


Run the project from command line in the main directory:
`mvn spring-boot:run`