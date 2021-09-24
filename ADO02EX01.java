import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float n1, n2, n3, produto;

		System.out.println("Digite o valor de N1: ");
		n1 = entrada.nextFloat();

		System.out.println("Digite o valor de N2: ");
		n2 = entrada.nextFloat();

		System.out.println("Digite o valor de N3: ");
		n3 = entrada.nextFloat();

		produto = (n1 * n2 * n3);

		System.out.println("O resultado do produto entre N1, N2 e N3 é igual a " + produto);

		entrada.close();

	}

}
