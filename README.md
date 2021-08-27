# Github Java Workshop

This repository has a basic SpringBoot service, used for training purpose.

[![CI](https://github.com/GitHubWorkshop2021/GithubTrainingJava/actions/workflows/main.yml/badge.svg)](https://github.com/GitHubWorkshop2021/GithubTrainingJava/actions/workflows/main.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=GitHubWorkshop2021_GithubTrainingJava&metric=alert_status)](https://sonarcloud.io/dashboard?id=GitHubWorkshop2021_GithubTrainingJava)

## Give a Star! :star:

If you like and enjoy the workshop, please give it a star. Thanks!

## What we will cover working with this repository

 - Configure a Repository
 - Working with .gitignore
 - Working Markdown and documentation Files
 - How to work with flows with confidence
 - Acquire Best practices working with git
 - Work with Pull Requests
 - Creating a git Hook
 - Setup a Basic github Action

## Setup the environment

A requirement for this workshop is to have the OpenJDK and maven installed. In ubuntu/debian Linux (:heart: WSL included) you can install typing:

```bash 
# this install all necessary for working with this project 
> sudo apt-get install openjdk-16-jdk maven
```


## Building and executing the solution locally

You can clean and install dependencies doing

```bash
# before launch you should clean and install packages
> ./mvnw clean
> ./mvnw install
```
 You can also execute the application at command line and open a browser at port 8080

```bash 
# with this command you launch the api listening at http://localhost:8080/greeting
> ./mvnw spring-boot:run
```

![browser demo](https://raw.githubusercontent.com/GitHubWorkshop2021/GithubTrainingJava/main/docs/greetings.png "greetings in action")

```bash
# For launching tests you only need to run
> ./mvnw test
```

Also you can execute all the solution in IntelliJ Idea 
![IntelliJ demo](https://raw.githubusercontent.com/GitHubWorkshop2021/GithubTrainingJava/main/docs/testspassing.png "test passingin intelliJ Idea")
https://download.jetbrains.com/idea/ideaIC-2021.1.3.exe

