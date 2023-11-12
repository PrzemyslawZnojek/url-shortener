#!/bin/bash

cd url-shortener-backend
./gradlew clean bootJar
cd ..
docker compose build url-shortener-backend
docker compose up
