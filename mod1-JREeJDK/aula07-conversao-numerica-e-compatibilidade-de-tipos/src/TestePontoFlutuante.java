//OBS: tem um pdf com a explicacao detalhada dessa aula na pasta 'descricao-aula07' 

public class TestePontoFlutuante {
	public static void main(String[] args) {
		
		double salario;   // declarando variavel
		salario = 3500.5; // atribuindo valor quebrado
		
		//imprimindo um texto mais o valor da variavel salario:
		System.out.println("O sálario é: R$ " + salario);
		
		//**************************************************************************
		// Pode guardar valores do tipo INT em variaveis do tipo DOUBLE diretamente
		// Isso pq o double tem uma maior faixa de representação em comparação
		// com o tipo int (inteiro). Ou seja um int cabe em um double
		
		// Exemplo: 30 é do tipo inteiro e vamos guardar em idade que é do tipo double
		double idade = 30;
		System.out.println(idade);
		//**************************************************************************
		
		
		//**************************************************************************
		// NÃO pode guardar um tipo double em um tipo int diretamente
		// devido à possibilidade de perda de precisão.
		// O tipo double é de ponto flutuante e pode representar números com decimais
		// e uma maior faixa de valores do que o tipo int.
		
		// int nota = 9.15; Dara um erro
		
		//***************************************************************************
		
		
		// Brincando com o double e int:
		
		// Divisão:
		double divisao = 3.14 / 2;
		System.out.println(divisao); // vai imprimir 3.57
		
		
		// Divisao entre dois inteiros sempre resultara em inteiro:
		// Ao realizar int divisao = 5 / 2; em Java, o resultado é 2, não 2.5.
		// Isso ocorre pq a divisão de dois números inteiros em Java
		// resulta em um valor inteiro, e a parte decimal é truncada (descartada).
		int novaDivisao = 5 / 2;		
		System.out.println(novaDivisao); // imprime 2
		
		// Mesmo se guardar o resultado em um tipo double não vai ser 2.5
		// DIVISAO ENTRE INTERIOS SEMPRE SERA UM RESULTADO INTEIRO
		double outraDivisao = 5 / 2;
		System.out.println(outraDivisao); // imprime 2.0
		
		// SOLUÇÂO:
		// Para obter um resultado com parte decimal,
		// pelo menos um dos operandos precisa ser do tipo double.
		// Você pode fazer isso explicitamente:
		double divisaoFinal = 5.0 / 2;
		System.out.println(divisaoFinal); // imprime 2.5
		
		// Digitar 5.0 ao invés de 5 tá garantindo que pelo menos um dos operandos
		// seja um tipo de ponto flutuante, e a divisão será tratada como uma
		// operação de ponto flutuante, resultando em 2.5.
	}
}