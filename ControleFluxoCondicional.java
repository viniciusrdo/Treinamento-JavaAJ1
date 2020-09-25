package lab4AJ1;

class ControleFluxoCondicional {

	public static void main(String[] args) {
	String nome = "Vinicius Rosa";
	int idade = 19;
	String rg = "45896523152";
	char sexo = 'M';
	double salario = 14500.0;
	int anoAtual = 2020;
	double aliquota = 0.20;
	int anoNascimento = anoAtual - idade;
	String sexoPorExtenso;
	double impostoDevido = salario * aliquota;
	
	if (sexo == 'M') {
		sexoPorExtenso = "masculino"; 
	}
	else if (sexo == 'F') {
		
		sexoPorExtenso = "feminino";
	}
	else {
		sexoPorExtenso = "Nao Binario";
	}
	
	String textNome;
	String textNasc;
	String textRg;
	String textSexo;
	String textTrabalho;
	String textImposto;
	
	
	switch (sexo) {
	case 'M' :
		 textNome = "O Senhor " + nome;
		textNasc = ", nascido no ano de " + anoNascimento;
		textRg = " portador do rg de numero " + rg + ", \n";
		textSexo = " do sexo " + sexoPorExtenso;
		textTrabalho = ", está registrado com o salário de R$ " + salario;
		textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
		System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho
		    + textImposto);
		break;
	
	case 'F':
		textNome = "A Senhor " + nome;
		textNasc = ", nascida no ano de " + anoNascimento;
		textRg = " portadora do rg de numero " + rg + ", \n";
		textSexo = " do sexo " + sexoPorExtenso;
		textTrabalho = ", está registrada com o salário de R$ " + salario;
		textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
		System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho
		    + textImposto);
		break;
	
	default:		
		textNome = "O(a) Senhor(a) " + nome;
		textNasc = ", nascido(a) no ano de " + anoNascimento;
		textRg = " portador(a) do rg de numero " + rg + ", \n";
		textSexo = " do sexo " + sexoPorExtenso;
		textTrabalho = ", está registrado(a) com o salário de R$ " + salario;
		textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
		System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho
		    + textImposto);
		
	
	}
	
	
	
	
  }
}