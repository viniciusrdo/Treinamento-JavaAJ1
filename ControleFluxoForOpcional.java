package lab4AJ1;

class ControleFluxoForOpcional {
 
  public static void main(String[] args) {
	  
	  int i = 0;
	  
	  
	  for (i=100; i <= 200; i++) {
		  if(i % 2 == 0 && i % 3 ==0 ) {
			  System.out.println("O numero " + i + " eh divisivel por 2 e 3, portanto também é divisivel por 6!!");
		  }
		  else if(i % 2 == 0) {
			  System.out.println("O numero " + i + " eh divisivel por 2!!");
			  
		  }
		  else if(i % 3 == 0) {
			  System.out.println("O numero " + i + " eh divisivel por 3!!");
		  }	  
	
	  
	  }

  }
}
