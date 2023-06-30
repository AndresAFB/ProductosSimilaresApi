FROM adoptopenjdk:8-jdk-hotspot

WORKDIR /app

COPY ./target/products.similar.api-1.0.0-SNAPSHOT.jar /app/products-similar-api.jar

EXPOSE 5000

CMD ["java", "-jar", "products-similar-api.jar"]