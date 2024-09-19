# Overview
**kitchensink-spring**

Migrate of JBoss EAP kitchensink quickstart app to Spring Boot 3.3.3

With help of available integrations uses exising Jersey REST service (spring-boot-starter-jersey) and JSF views ([JoinFaces](https://github.com/joinfaces/joinfaces)).

Also refactored to use MongoDB (spring-boot-starter-data-mongodb) instead of the H2 in-memory database.

# Requirements
Java SDK 21
Maven

# Deployment

Clone repository locally.

Create `env.properties` file in the `src/main/resources` directory and configure your MongoDB URI (example Atlas URI):
`MONGODB_URI=mongodb+srv://<USER>:<PWD>@clusterX.XXXX.mongodb.net/?retryWrites=true&w=majority&appName=kitchensink-spring`

Build the project:
`mvn package`

Run the project:
`mvn spring-boot:run`