# maven-demo

openjdk version "1.8"
Maven archetype quickstart:
```
$ mvn archetype:generate -DgroupId=com.parkus -DartifactId=userservices -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Run mavendemo:
```
$ mvn install
$ java -cp target/userservices-1.0-SNAPSHOT.jar com.parkus.App
```

Maven command to skip test:
```
$ mvn install -DskipTests
```

Maven archetype webapp:
```
$ mvn archetype:generate -DgroupId=com.parkus -DartifactId=userweb -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```

