<?php 
    // header('content-type:text/html;charset:utf-8') ;
    $array = Array(array('name'=>'张三'),array('name'=>'李四'),array('name'=>'王五')) ;

    if( $_GET ) {
        echo '您好，',$_GET['username'],'，欢迎使用PHP!!! ---> GET发送';
    }
    if ( $_POST ){
        if ( $_POST['index'] ) {
            $size = count($array);
            $json_array = json_encode($array,true) ;
            // print_r($json_array) ;
            for($i=0;$i<$size;$i++){
                if ( $_POST['index'] == $i+1 ) {
                    echo json_encode($array[$i],true) ;
                    break;
                }
            }
        } else {
            echo '您好，',$_POST['username'],'，欢迎使用PHP!!! ---> POST发送';
        }
    }
 ?>