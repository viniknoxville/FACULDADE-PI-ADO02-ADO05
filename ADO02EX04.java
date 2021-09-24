import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome: ");

		String nome = entrada.next();

		System.out.println("A Quantidade de caracteres do seu nome é: " + nome.length());
		entrada.close();
	}

}
