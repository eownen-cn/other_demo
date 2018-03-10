angular.module('mc',[])
.controller('myControl',($scope,myServe)=>{
	$scope.fn = function(x){
		return myServe.res(x) + ' | 我Controller了一下';
	}
});