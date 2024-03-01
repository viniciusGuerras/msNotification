Notification microservice
============

This microservice receives and stores via RabbitMq logs from the User microservice

## Features
- Log saving
- RabbitMq support

It was part of `Challenge - 3` from my internship at [compassuol](https://compass.uol/pt/home/)

| Technologies Used  |            |
|--------------------|------------|
| Spring Boot        |            |
| Java               |            |

| Additional Tools |            |
|------------------|------------|
| MongoDb          |            |

Contributors: Vinicius Guerra


## How to Use

1. **Setup Environment:**
    - Ensure you have Java and Maven installed on your system.

2. **Clone the Repository:**
   ```bash
   git clone <repository_url>

3. **Setup Database:**
    - You might want to look into `applications.yml` to make changes to the port and set up your database.
    - This microservice uses MongoDb Atlas, make sure the connection is correct.

