# Yet Another Web API - Spring Boot Edition

Base project for a REST API based on spring-boot

## Requirements

1. Docker
2. MariaDB
3. Spring Boot 2.7.0 (springs-security, spring-web, spring-data)
4. Java 11
5. Postman

## Clone from GitHub

Clone project using:

```
git clone https://github.com/maurizio-mollicone/yawapi-rs.git
```

## Setup MariaDB Container


```
docker run --detach --name mariadb --env MARIADB_USER=yar --env MARIADB_PASSWORD=12345678 --env MARIADB_ROOT_PASSWORD=12345678 mariadb:latest
```
## Run

```
gg
```