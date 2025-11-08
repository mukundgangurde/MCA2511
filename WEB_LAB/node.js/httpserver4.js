var h = require('http');
var f = require('fs');
h.createServer(
    function (req, res) {
    res.writeHead(200,{'Content-Type' : 'text/html'});
    var rfs = f.createReadStream('fake_news_demo.csv');
    rfs.pipe(res);
}).listen(8080);