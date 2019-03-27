# Workshop
```
$git clone https://github.com/up1/workshop-20190325.git
$cd workshop-20190325/
$docker container run --rm -w /src -v $(pwd):/src maven:3.6.0-jdk-8-alpine mvn package
$docker container run -d -w /src -v $(pwd)/target/demo.jar:/src/demo.jar -p 9999:8080 openjdk:8u191-jre-alpine3.9 java -jar demo.jar

# Remove container 
$docker container stop $(docker container ps -q)
$docker container prune

#Create Docker Image
$docker image build -t somkiat/demoapp:1.0 .
```
