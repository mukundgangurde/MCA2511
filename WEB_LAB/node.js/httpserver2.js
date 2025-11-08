var h = require('http');
var u = require('util');
h.createServer(
    function (req, res) {
    res.writeHead(200,{'Content-Type' : 'text/html'});
    res.write(u.inspect(req.headers));
    res.end();
}).listen(8080);