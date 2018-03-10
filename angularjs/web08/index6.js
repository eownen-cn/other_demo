angular.module('cts',[])
.controller('myCon',function($scope){
	$scope.haveYouEverSmiledToday = function(you){
		return 'happy' == you ? '今天心情不错' : 'terrible' == you ? '今天心情很糟糕' : '心情一般般';
	}
});