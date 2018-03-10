
angular.module('Myserve',[]).service('myserve',function(){
	this.myFun = function(x){
		return x * 5
	};
})