import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor de N: ");
		int n = entrada.nextInt();

		int primeiro = (n * 1);
		int segundo = (n * 2);
		int terceiro = (n * 3);

		System.out.println("Os multiplos de N são: " + primeiro + ", " + segundo + ", " + terceiro);

		entrada.close();

	}

}
