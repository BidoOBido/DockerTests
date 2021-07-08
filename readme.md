# Docker tests

This repository contains some docker experiments to better understand it.

At the moment the structure is:

- Docker: contains the yml file to create the services:

    ``` bash
    To run:
        cd docker/
        sudo docker-compose -d
    ```

- Postgres (localhost:54321): contains the script which will be first executed after ```database-postgres``` service start running.
- Java-producer (localhost:18080): contains the base code of a simple api that manipulate data from database on db container:
  
    ``` text
    The "app" container (java-api service on yml file) is a image of openjdk-11 thus I'm using Visual Studio Cod attached to this container to run the api, all network configuration is set to work in this way
    ```

----

Kafka runs in ```kafka:29092```, infos about containers, brookers and messsages can be seen using Kafdrop which is running on ```localhost:19000```

On containers startup, the database will be populated with some mock values, after that you can:

- Debbug producer api with: ```cd /home && mvn spring-boot:run```

or

- Build jar with: ```cd /home && mvn clean install```
- Run jar with: ```java -jar target/kafkaproducer-0.0.1-SNAPSHOT.jar```

----

Next goal is build some visual app in flutter to consume the messages existing on kafka in ```inconsitence``` topic.
