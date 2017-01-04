var myApp=angular.module("myApp",[]);
myApp.controller("InscriptionController",function($scope,$http){
	 $scope.etudiant={};
	 $scope.erros=null;
	 $scope.mode={value:"form"};
	 $scope.saveEtudiant=function(){
		 $http.post("etudiants",$scope.etudiant)
		 	.success(function(data) {
		 		if(!data.errors){
		 			$scope.etudiant=data;
		 			$scope.errors=null;
		 			$scope.mode.value="confirm";
		 		}
		 		else {
		 			$scope.errors=data;
		 			
		 		
		 		}
		 	});
	 }; 
	

});