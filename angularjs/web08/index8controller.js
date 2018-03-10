angular.module('Myctrl',[]).controller('myCtrl',($scope,myserve) => {
    $scope.fn = function(x){
    	return myserve.myFun((x || 0)) ;
    }
})