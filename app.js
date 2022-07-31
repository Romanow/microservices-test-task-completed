const http = require('http');

const port = 8080;

const greeting_name = process.env.GREETING_NAME ?? 'dude'

const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader('Content-Type', 'text/plain');
  res.end('Hello, ' + greeting_name);
});

server.listen(port);