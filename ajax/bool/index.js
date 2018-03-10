var http = require('http'); //使用http模块
http.createServer(function(req, res) {
    var _url = req.url ;
    if ( _url !== '' ){
        console.log( _url ) ;
    }
}).listen(8888);
console.log("HTTP server is listening at port 8888");