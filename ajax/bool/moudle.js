var fs = require('fs') ;
var url = require('url') ;
var util = require('util') ;
module.exports = {
    index(req,resp){
        fs.filename('./index.html',function(err,data) {
            if ( !err ){
                console.log(data) ;
                resp.write(data)
            }
        }) ;
    }
}