package lab3AJ3;

public class Operadores {

	public static void main(String[] args) {
	String nome = "Vinicius Rosa";
	int idade = 19;
	String rg = "052896321";
	char sexo = 'M';
	double salario = 14500.00;
	int anoAtual = 2020;
	double aliquota = 0.03;
	int anoNascimento = 0;
	String sexoPorExtenso = null;
	double impostoDevido = salario * aliquota;
	System.out.print("O(a) Senhor(a) " + nome + ", nascido(a) no ano de ");
	System.out.println(anoNascimento + ", portador(a) do RG de n�mero " + rg);
	System.out.print(", do sexo " + sexoPorExtenso);
	System.out.print(", est� registrado(a) com o sal�rio de R$ " + salario);
	System.out.println(" e pagara R$ " + impostoDevido + " de imposto.");
  }
}
