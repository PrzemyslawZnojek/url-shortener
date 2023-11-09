#!/bin/bash

./gradlew clean bootJar
docker compose build url-shortener
docker compose up
