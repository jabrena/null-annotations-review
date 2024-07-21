# null-annotations-review

## Checklist

- [x] Initial Nullaway configuration
- [x] Initial example
- [x] Initial JSpecify annotations
- [x] Hello World

## How to build in local

```
sdk env
./mvnw clean verify
```

## Spring Boot CLI

```bash
sdk install springboot
spring init -d=web,devtools --build=maven --force ./
```