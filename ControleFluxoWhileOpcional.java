package lab4AJ1;

class ControleFluxoWhileOpcional {

	public static void main(String[] args) {
	int limiteInferior = 14;
	int limiteSuperior = 1578;
	int numerosDiv6 = 0;
	int i = 15;
	
	while(i > 14 && i < 1578 ) {
		if(i % 6 == 0) {
			numerosDiv6 ++;
		}
		i++;		
	}
	
	String texto = "Quantidade de numeros divisiveis por 6 entre ";
	System.out.println(texto + limiteInferior + " e " + limiteSuperior
	    + " e : " + numerosDiv6);
  }
}
