FROM eclipse-temurin:17.0.6_10-jre-focal

COPY build/libs/*.jar /app.jar

HEALTHCHECK --start-period=30s --interval=20s --timeout=10s --retries=6 CMD wget --quiet --spider --tries=1 http://localhost:8080/health || exit 1

CMD ["java", "-jar", "app.jar"]
