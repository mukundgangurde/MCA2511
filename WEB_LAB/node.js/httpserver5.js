var h = require('http');
var f = require('fs');
h.createServer(
    function (req, res) {
    res.writeHead(200,{'Content-Type' : 'application/pdf'});
    var rfs = f.createReadStream('WEB LAB 3.pdf');
    rfs.pipe(res);
}).listen(8080);