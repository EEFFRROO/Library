MAKEPATH := $(abspath $(lastword $(MAKEFILE_LIST)))
PWD := $(dir $(MAKEPATH))
DOCKER_FOLDER := $(PWD)/docker


java-up:
	cd $(PWD)
	sh mvnw clean package -DskipTests
	cd $(DOCKER_FOLDER); \
	docker-compose up -d --build

java-stop:
	cd $(DOCKER_FOLDER); \
	docker-compose stop

