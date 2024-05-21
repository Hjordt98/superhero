# Superhero Java Spring Boot Maven Project

## Purpose of This Repository

THe purpose of this repository is to show my knowledge of the following frameworks and coding languages.

- Java
- Spring Boot
- JPA (MySQL Database)
- Restful API
- OOP
- Eviromental Variables
- Lombok Annotation

## Prerequisites

The project uses the following dependencies

- Spring Boot Starter Data JPA
- Spring Boot Starter Web
- H2 Database (runtime)
- MySQL Connector (runtime)
- Lombok (optional)
- Spring Boot Starter Test
- Validation API
- Spring Boot Starter Validation

## API Endpoints

### Get All Superheroes

* **URL:** `GET /`
* **Response:**
    * 200 OK: Returns a list of superheroes.
    * 204 No Content: No superheroes found in the database.

### Get Superhero by ID

* **URL:** `GET /{id}`
* **Response:**
    * 200 OK: Returns the superhero with the specified ID.
    * 404 Not Found: No superhero found with the specified ID.

### Create Superhero

* **URL:** `POST /`
* **Request Body:** JSON representation of a superhero.
* **Response:**
    * 202 Accepted: Successfully saved the superhero.
    * 400 Bad Request: Validation errors, missing or invalid fields.

### Update Superhero

* **URL:** `PUT /{id}`
* **Request Body:** JSON representation of a superhero.
* **Response:**
    * 200 OK: Successfully updated the superhero.
    * 400 Bad Request: Validation errors, missing or invalid fields.
    * 404 Not Found: No superhero found with the specified ID.

### Delete Superhero

* **URL:** `DELETE /{id}`
* **Response:**
    * 200 OK: Successfully deleted the superhero.
    * 404 Not Found: No superhero found with the specified ID.

