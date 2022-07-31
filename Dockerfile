# syntax=docker/dockerfile:1
FROM node:18-alpine
RUN apk add --no-cache --virtual .gyp python3 make g++
WORKDIR /app
COPY . .
RUN npm install --production
CMD ["node", "app.js"]
EXPOSE 8080