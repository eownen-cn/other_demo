var fs = require('fs') ;
var qs = require('querystring') ;
var util = require('util');
module.exports = {
    index( req , resp ){
        fs.readFile('./index.html',function ( error , respText ) {
            if ( !error ){
                resp.write( respText ) ;
                console.log( respText ) ;
                resp.end('') ;
            }
        }) ;
    },
    post( req , resp ){
        var post = '' ;
        req.on('data',function( chunk ){
            post += chunk ;
        });
        req.on('end',function(){
            console.log( '已接收到的POST数据：' + post ) ;
            fs.readFile('./msg.json',function( error,data ){
                if ( !error ) {
                    console.log(`看看msg.json有无数据:${data}`) ;
                    var msg = JSON.parse(data) ; // 格式化json字符串为json对象，得到一个json格式的对象数组
                    post = qs.parse(post) ; // 格式化json字符串为json对象，得到单个对象
                    msg.push(post) ; // 增加新的留言
                    console.log('最后一次操作后的msg内容:') ;
                    console.log(msg) ;
                    fs.writeFile('msg.json',JSON.stringify(msg)) // 重新写入文件，覆盖之前的所有内容
                    console.log('msg已按最后一次内容存储') ;
                }
            })
            resp.end(`${decodeURI(util.inspect(post))}<br><a href="http://localhost:8888/msg">更多>>></a>`) ;
        })
    },
    msg( req , resp ){
        let tab,tr,msgs ;
        fs.readFile('./msg.json',function ( error , data ){
            msgs = JSON.parse(data) || [];
            if ( !error ) {
                for ( let i = 0 , len = msgs.length ; i < len ; i ++ ) {
                    tr += `<tr><td>${msgs[i].nickname}</td><td>${msgs[i].content}</td></tr>`
                }
                tab = `<table border=1 style='text-align:center;'><tr><td>歌名</td><td>歌手</td></tr>${tr}</table>` ;
                resp.write(tab) ;
                resp.end(`<br><a href="http://localhost:8888/index"><<<返回</a>`) ;
            }
        }) ;
    }
}