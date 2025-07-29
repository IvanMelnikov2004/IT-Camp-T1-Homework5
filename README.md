# IT-Camp-T1-Homework5


## Требования
- Docker & Docker Compose
- IntelliJ IDEA с плагином Docker
- Java 17+, Maven

## Запуск

1. Скопируйте `.env.example` в `.env` и скорректируйте параметры.
2. Из IDE: создайте конфигурацию **Docker Compose**, выберите `docker-compose.yml` — нажмите **Run**.
3. Подождите, пока поднимутся Keycloak и приложение (Keycloak на порту 8080, приложение на 8081).

Или из терминала:
```bash
docker-compose up -d --build
