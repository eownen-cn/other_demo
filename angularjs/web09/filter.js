angular.module('mf',[])
.filter('myFilter',function(){
	return {
		res(x){
			return x + '我Filter了一下' ;
		}
	}
});