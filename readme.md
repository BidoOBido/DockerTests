# Docker tests

This repository contains some docker experiments to better understand it.

At the moment the structure is:

- Docker: contains the yml file to create the services:

    ``` bash
    To run:
        cd docker/
        sudo docker-compose -d
    ```

- Postgres: contains the script which will be first executed after ```database-postgres``` service start running.
- Java: contains the base code of a simple api that manipulate data from database on db container:
  
    ``` text
    The "app" container (java-api service on yml file) is a image of openjdk-11 thus I'm using Visual Studio Cod attached to this container to run the api, all network configuration is set to work in this way
    ```

----

Kafka runs in ```kafka:29092```, infos about containers, brookers and messsages can be seen using Kafdrop which is running on ```localhost:19000```

On containers startup, the database will be populated with some mock values, after that you can:

- Access the endpoint ```localhost:8080/values/```, that returns all values existing on database;
- Access the endpoint ```localhost:8080/values/inconsitences/```, that will return all values which first and second values aren't equal;
- Access the endpoint ```localhost:8080/values/sendAllValuesKafka```, that will publish all data in topic ```inconsistences``` on kafka.

----

Next goal is build some visual app in flutter to consume the messages existing on kafka in ```inconsitence``` topic.
