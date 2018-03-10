let s = require('http') ;
let ts = require('./tools') ;
let util = require('url') ;
let getUrl = function( req ){
    return (req.url === '/favicon.ico' || req.url === '/') ? 'index' : util.parse( req.url ).pathname ;
};
let serv = s.createServer(function( req,resp ){
    resp.writeHead(200,{'Content-type':'text/html;charset=utf-8'});
    if ( _pathname = getUrl(req) )
        if ( ts[_pathname.replace('/','')](req,resp) || _pathname)
            console.log('当前请求的路由：http://localhost:8888/' + _pathname) ;
}).listen(8888) ;
console.log('Server is started by port : 8888') ;