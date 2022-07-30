# Тестовое задание по курсу Microservices

## Hello, world сервер

Написать простейший веб-сервер, который на _любой запрос_ возвращает строку `Hello, $GREETING_NAME`, где `GREETING_NAME`
– переменная среды (env).

### Требования

1. Сервер запускается на порту `8080`.
2. Нужно описать [Dockerfile](Dockerfile) для упаковки сервера в контейнер.
3. При старте контейнера через переменную среды `GREETING_NAME` передается имя.

Пример реализации [Microservices Test Task](https://github.com/Romanow/microservices-test-task-completed).

### Пояснения

```shell
# проверяем

$ node app.js

$ curl http://localhost:8080
Hello, dude

# собираем в docker
$ docker build -t ms-test-app .

# запускаем собранный образ
$ docker run -dp 8080:8080 -e GREETING_NAME=Max ms-test-app
    
# проверяем
$ curl http://localhost:8080
Hello, Max
```