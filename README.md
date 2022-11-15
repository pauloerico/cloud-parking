#Cloud Parking API
##Description
Spring Boot API for managing vehicles at a parking business. It register vehicles entrance, exit and calculates parking fees. 

API is deployed on Heroku, persists on a PostgreSQL database, is documented via Swagger and has access control with Spring Security.

##Run database
docker run --name parking-db -p 5432:5432 -e POSTGRES_DB=parking -e POSTGRES_USER=admin -e POSTGRES_PASSWORD=123 -d postgres:10-alpine

##Stop database
docker stop parking-db

##Start database
docker start parking-db