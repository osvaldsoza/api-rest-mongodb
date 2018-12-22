# api-rest-mongodb
#Simple Rest API using MongoDB and Spring Boot
Database:

use rest_mongodb;

db.createCollection("pets");

db.pets.insertMany([
  {
    “name” : “Spot”,
    “species” : “dog”,
    “breed” : “pitbull”
  },
  {
    “name” : “Daisy”,
    “species” : “cat”,
    “breed” : “calico”
  },
  {
    “name” : “Bella”,
    “species” : “dog”,
    “breed” : “australian shepard”
  }
]);
