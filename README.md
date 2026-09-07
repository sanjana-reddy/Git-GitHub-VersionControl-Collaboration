# Student ToDo Manager

A small Java Maven application created to demonstrate Git and GitHub version control and collaboration.

## Project Purpose

This project provides a simple task manager where users can add tasks and view the number of tasks.

## Technologies

- Java 17
- Maven
- JUnit 5
- Git
- GitHub

## Project Structure

- src/main/java - application source code
- src/test/java - unit tests
- pom.xml - Maven project configuration
- .gitignore - files excluded from Git

## How to Test

Run:

    mvn test

## Git Branching Strategy

The main branch contains stable code.

Feature work is completed on branches using the naming convention:

    feature/<short-description>

Changes are reviewed through Pull Requests before being merged into main.

## Collaboration

Issues are used to track tasks and bugs. Pull Requests are used for code review and integration.

## Security

Credentials, environment files, certificates, and other sensitive files are excluded through .gitignore.
