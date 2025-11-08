var h = require('http');
var f = require('fs');
h.createServer(
    function (req, res) {
    res.writeHead(200,{'Content-Type' : 'text/html'});
    var rfs = f.createReadStream('Lab1.js');
    rfs.pipe(res);
}).listen(8080);