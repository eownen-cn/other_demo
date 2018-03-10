<?php 
    // header('Content-Type:text/html;charset="utf-8"') ;

    // $up = '/data/files/'; // 上传文件的存放目录

    // // 判断提交的姿势
    // if ( strtolower($_SERVER['REQUEST_METHOD']) != 'post' ){ 
    //     exit_status(array('code'=>1,'msg'=>'Methos error！'));
    // }

    // if ( array_key_exists('file',$_FILES) ) 
    //     if ( $_FILES['file']['error'] == 0 ) {
    //         $pic = $_FILES['file'];
    //         if ( move_uploaded_file($up_file['tmp_name'],$up.$pic['name']) ){
    //             exit_status(array('code'=>0,'msg'=>'upload successfully !!!','url'=>$up.$pic['name']));
    //         }
    //     }
    // }
    // echo $_FILES['file']['error'];
    // exit_status(array('code'=>1,'msg'=>'unknow error~'));
        
    // function exit_status($str) {
    //     echo json_encode($str,true);
    //     exit ;
    // }

    if ( $_FILES ){
       echo 1;
    }
    
?>
