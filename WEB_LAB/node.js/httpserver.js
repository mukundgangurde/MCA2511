var h = require('http');
h.createServer(
    function (req, res) {
    res.writeHead(200,{'Content-Type' : 'text/html'});
    res.write('<html><body><h1>Hello MCA Sem I</body></html>');
    res.end();
}).listen(8080);