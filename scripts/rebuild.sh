#!/bin/bash

./gradlew clean bootJar
docker compose build url-shortener-backend
docker compose up
