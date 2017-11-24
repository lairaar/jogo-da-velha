var contX = 0;
var contO = 0;
vez = 1;
  function apaga() {
			var top1 = document.getElementById("1");
			var top2 = document.getElementById("2");
			var top3 = document.getElementById("3");
			var top4 = document.getElementById("4");
			var top5 = document.getElementById("5");
			var top6 = document.getElementById("6");
			var top7 = document.getElementById("7");
			var top8 = document.getElementById("8");
			var top9 = document.getElementById("9");
			top1.value = "";
			top2.value = "";
			top3.value = "";
			top4.value = "";
			top5.value = "";
			top6.value = "";
			top7.value = "";
			top8.value = "";
			top9.value = "";
		}
		
  function bloco(bloco) {
    var selbloco = document.getElementById(bloco);
    var top1 = document.getElementById("1");
		var top2 = document.getElementById("2");
		var top3 = document.getElementById("3");
    var top4 = document.getElementById("4");
    var top5 = document.getElementById("5");
    var top6 = document.getElementById("6");
    var top7 = document.getElementById("7");
    var top8 = document.getElementById("8");
    var top9 = document.getElementById("9");	
    
      
     if ((selbloco.value != "O") && (selbloco.value !="X")) {
				if (vez == 1) {
					selbloco.value = "X";
					document.getElementById("O").disabled = false;
					document.getElementById("X").disabled = true;
					vez = 2;
				}
				else {
					selbloco.value = "O"
					document.getElementById("X").disabled = false;
					document.getElementById("O").disabled = true;
					vez = 1;
				  }
			 }
  }
     
  function confirma() {
    var jog1 = document.getElementById("jog1");
    var jog2 = document.getElementById("jog2");
    var top1 = document.getElementById("1");
		var top2 = document.getElementById("2");
		var top3 = document.getElementById("3");
    var top4 = document.getElementById("4");
    var top5 = document.getElementById("5");
    var top6 = document.getElementById("6");
    var top7 = document.getElementById("7");
    var top8 = document.getElementById("8");
    var top9 = document.getElementById("9");	
    var X = document.getElementById("X");
    var O = document.getElementById("O");
    
    //////////////////////////////// x /////////////////////////////////// 
      //horizontal//  
  if  (((top1.value == "X") && (top2.value == "X") && (top3.value == "X"))  || 
       ((top7.value == "X") && (top7.value == "X") && (top9.value == "X"))  ||
       ((top4.value == "X") && (top5.value == "X") && (top6.value == "X"))  ||
      //diagonal//
        ((top3.value == "X") && (top5.value == "X") && (top7.value == "X")) ||
        ((top1.value == "X") && (top5.value == "X") && (top9.value == "X")) ||
        
      //vertical//
        ((top1.value == "X") && (top4.value == "X") && (top7.value == "X")) || 
        ((top2.value == "X") && (top5.value == "X") && (top8.value == "X")) ||
        ((top3.value == "X") && (top6.value == "X") && (top9.value == "X")))
      {
        if (X.value !== "") {
				alert(X.value + " " + "ganhou!")
          }
				else {
				alert("jog1 ganhou!")
          } 
      }
  //////////////////////////////// bolinha ///////////////////////////////////
      //horizontal//  
  if  (((top1.value == "O") && (top2.value == "O") && (top3.value == "O"))  ||
       ((top7.value == "O") && (top7.value == "O") && (top9.value == "O"))  ||
       ((top4.value == "O") && (top5.value == "O") && (top6.value == "O"))  ||
      //diagonal//
        ((top3.value == "O") && (top5.value == "O") && (top6.value == "O")) ||
        ((top1.value == "O") && (top5.value == "O") && (top7.value == "O")) ||
      //vertical//
        ((top1.value == "O") && (top4.value == "O") && (top7.value == "O")) ||
        ((top2.value == "O") && (top5.value == "O") && (top8.value == "O")) ||
        ((top3.value == "O") && (top6.value == "O") && (top9.value == "O")))
        {
          if (O.value !== "") {
				alert(O.value + " " + "ganhou!")
          }
				else {
				alert("jog2 ganhou!")
         }
        }
      if (((top1.value == "X")) && ((top2.value == "O")||
      (top2.vatopue == "X")) && ((top3.value == "O")||
      (top3.value == "X")) && ((top4.value == "O")||
      (top4.value == "X")) && ((top5.value == "O")||
      (top5.value == "X")) && ((top6.value == "O")||
      (top6.value == "X")) && ((top7.value == "O")||
      (top7.value == "X")) && ((top8.value == "O")||
      (top8.value == "X")) && ((top9.value == "O")||
      (top9.value == "X"))) {
				alert("Deu velha!");
      }
  }
  
