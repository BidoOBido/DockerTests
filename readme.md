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

Next goal is use a container to run Apache Kafka, and change the java api to publish/read data from/on on Kafka topics.
