angular.module('ms',[])
.service('myServe',function($scope,myFilter){
	this.res = function(x){
		return myFilter.res(x);
	}
});