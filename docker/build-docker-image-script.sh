#!/bin/bash
../gradlew :docker:assemble  && \
docker build -t hyubuki/docker-app -f docker/Build-Jar-Dockerfile . && \
docker push hyubuki/docker-app