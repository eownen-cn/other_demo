<?php
    $host = "http://rltz.market.alicloudapi.com";
    $path = "/face/detect";
    $method = "POST";
    $appcode = "0102d92f9808431aa23146b3a905ccc3";
    $headers = array();
    array_push($headers, "Authorization:APPCODE " . $appcode);
    //根据API的要求，定义相对应的Content-Type
    array_push($headers, "Content-Type".":"."application/json; charset=UTF-8");
    $querys = "";
    $bodys = "{  
   \"type\":0, # 0: 通过url识别，参数image_url不为空；1: 通过图片content识别，参数content不为空
   \"image_url\":\"http://a.com/a.jgp\",  #输入图像URL
   \"content\":\"\" #图像内容，base64编码
}";
    $url = $host . $path;

    $curl = curl_init();
    curl_setopt($curl, CURLOPT_CUSTOMREQUEST, $method);
    curl_setopt($curl, CURLOPT_URL, $url);
    curl_setopt($curl, CURLOPT_HTTPHEADER, $headers);
    curl_setopt($curl, CURLOPT_FAILONERROR, false);
    curl_setopt($curl, CURLOPT_RETURNTRANSFER, true);
    curl_setopt($curl, CURLOPT_HEADER, true);
    if (1 == strpos("$".$host, "https://"))
    {
        curl_setopt($curl, CURLOPT_SSL_VERIFYPEER, false);
        curl_setopt($curl, CURLOPT_SSL_VERIFYHOST, false);
    }
    curl_setopt($curl, CURLOPT_POSTFIELDS, $bodys);
    var_dump(curl_exec($curl));


    
?>