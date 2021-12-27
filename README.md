# sb-docker-1

@Controllers:
* "/" - home page
* "/test" - env vars page

Bare-bone spring boot app with Dockerfile for primitive Cloud deploy.
For localhost run 
```
mvn spring-boot:run -Drun.arguments=--Dspring.profiles.active=default
```
For cloud runtime run: 
```
mvn spring-boot:run -Drun.arguments=--Dspring.profiles.active=cloud
```

ENV:
* DB_URL
* DB_NAME;
