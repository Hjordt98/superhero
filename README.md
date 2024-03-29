# Software Development Portfolio

Welcome to my Github Software Development Portfolio! This Github account serves as a collection of my solo projects, each designed to showcase my expertise and knowledge in various areas of software development. Whether you're a fellow developer looking to explore new technologies or a headhunter seeking to assess my skills, these projects is a comprehensive showcase of my capabilities.

## Project Overview

Each project within my account represents a specific area of my expertise. These projects are not just about the end product; they're about the journey, the challenges faced, and the solutions implemented. They're a testament to my ability to learn, adapt, and deliver high-quality software solutions.

## Why I made this project

I've alwais been, and still is, a huge fan of superhero stuff (Mainly DC Comics) which gave me the inspiration for this project. This project is made to showcase my knowledge about Spring, Restfull API, MySQL (JPA) for backend. The frontend is not made yet, but will be built in vanilla HTML, CSS, and JS.

## Getting Started

Feel free to clone or fork this repository to explore the projects on your own. If you're interested in contributing or have any questions, don't hesitate to reach out. Your feedback is always welcome!

## Dependencies

The projects in this portfolio utilize a variety of technologies and frameworks, including but not limited to:

- **Spring Boot**: For creating stand-alone, production-grade Spring-based applications.
- **Spring Data JPA**: For simplifying the development of data access layers.
- **Spring Web**: For building web applications.
- **H2 Database**: An in-memory database for development and testing.
- **MySQL Connector/J**: For connecting to MySQL databases.
- **Lombok**: To reduce boilerplate code in Java.
- **Spring Boot Starter Test**: For testing Spring Boot applications.
- **Validation API**: For validating input data.
- **Spring Boot Starter Validation**: For integrating validation into Spring Boot applications.

## Building and Running the Projects

To build and run any of the projects, ensure you have Java 17 and Maven installed on your machine. Use the following Maven command to build the project:

# Project Features

This section provides an overview of the RESTful API endpoints available in the Superhero Portfolio Project. These endpoints allow for the creation, retrieval, update, and deletion of superhero data.

## GET Endpoints

- `GET /` - Retrieves a list of all superheroes. Returns an HTTP status of `200 OK` with the list of superheroes if available, or `204 No Content` if the list is empty.

## POST Endpoints

- `POST /` - Creates a new superhero. Requires a valid `Superhero` object in the request body. Returns an HTTP status of `202 Accepted` if the superhero is successfully saved, or `400 Bad Request` if there are validation errors.

## DELETE Endpoints

- `DELETE /{id}` - Deletes a superhero by its ID. Returns an HTTP status of `200 OK` with a success message if the superhero is successfully deleted, or `404 Not Found` if no superhero with the given ID exists.

## PUT Endpoints

- `PUT /{id}` - Updates a superhero by its ID. Requires a valid `Superhero` object in the request body. Returns an HTTP status of `202 Accepted` if the superhero is successfully updated, or `400 Bad Request` if there are validation errors. Also returns `404 Not Found` if no superhero with the given ID exists.

## Additional Notes

- All endpoints are protected by CORS (Cross-Origin Resource Sharing) policies, allowing them to be accessed from different origins.
- The `Superhero` object in the request body for POST and PUT requests must be validated to ensure all required fields are filled.
- The project utilizes Spring Boot for its RESTful API implementation, leveraging annotations such as `@RestController`, `@GetMapping`, `@PostMapping`, `@DeleteMapping`, and `@PutMapping` to define the API endpoints.



