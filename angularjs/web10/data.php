<?php 
	$arr = array(
		'Jeeny'=> array(
			'job'=>'Java',
			'age'=>25,
			'area'=>'北京',
		),
		'Deeny'=> array(
			'job'=>'Python',
			'age'=>30,
			'area'=>'天津'
		),
		'Keeny'=> array(
			'job'=>'PHP',
			'age'=>35,
			'area'=>'上海'
		),
	) ;
	echo json_encode($arr) ;
 ?>