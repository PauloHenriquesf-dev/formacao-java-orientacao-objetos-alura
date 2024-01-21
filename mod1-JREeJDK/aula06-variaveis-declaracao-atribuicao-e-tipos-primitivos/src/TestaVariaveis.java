
public class TestaVariaveis {
	public static void main(String[] args) {
		
		// declarando a variavel idade com tipo inteiro (int):
		int idade;
		
		// atribuindo (guardando) o valor 25 para a variavel idade
		idade = 25;
		
		// OBS: podemos declarar a variavel e atribuir um valor a ela na mesm linha:
		int nodaIdade = 26;
		
		// fazendo com que o valor de idade seja impresso na tela
		System.out.println(idade);
		
		// ########## TRABALHANDO COM OPERADORES ARITMETICOS ###########
		
		// somar +1 a variável idade:
		idade = idade +1;
		
		// imprimindo o valor da idade apos ser somado +1 
		System.out.println(idade);
		
		/* Podemos utilizar a variável em uma expressão numérica também.
		 * Onde temos multiplicação (*), Divisão (/), Adição (+) e Subtração (-),
		 * A ordem de prioridade será:
		 * multiplicação (*) ou Divisão (/) depois vem Soma (+) ou Subtração (-)
		 * 
		 * Caso queira priorizar a soma ou a subtração deve colocá-las entre parênteses.
		 * */
		idade = 2 + 3 * 4; // Aqui, a multiplicação ocorre primeiro
		
		// imprimindo valor de idade apos a expressao onde a multiplicacao ocorre primeiro
		System.out.println(idade);
		
		idade = (2 + 3) * 4; // Aqui, a adição ocorre primeiro
		
		// imprimindo valor de idade apos a expressao onde a soma ocorre primeiro
		System.out.println(idade);
		
		
		// ##### No Java o operador + também serve para concatenar(juntar) coisas ######
		
		// Juntando o texto entre aspas + o valor da variavel idade:
		System.out.println("O valor final da variavel idade é: " + idade);
	}
}
