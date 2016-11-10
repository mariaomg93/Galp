

$(document).ready(function(){
	
		$("#btn_tarjeta").on( "click", function() {
			$("#oculto1").css("display", "block");
			$("#oculto2").css("display", "none");
		 });
		
		
		$("#btn_efectivo").on( "click", function() {
			$("#oculto2").css("display", "block"); 
			$("#oculto1").css("display", "none");
		 });
		
		$("#cancelar1").on( "click", function() {
			$("#oculto1").css("display", "none"); 			
		 });
		
		
		$("#cancelar2").on( "click", function() {
			$("#oculto2").css("display", "none"); 			
		 });
		
		
		
		
		
		
		
		
		
	});


