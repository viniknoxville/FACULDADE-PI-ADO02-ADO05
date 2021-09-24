import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int ano;

		System.out.println("Digite um ano aleatório e descubra se ele é bissexto: ");
		ano = entrada.nextInt();

		if (ano % 400 == 0) {
			System.out.println(ano + " é um ano bissexto!!!");
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é um ano bissexto!!!");
		} else {
			System.out.println(ano + " não é um ano bissexto.");
		}
		entrada.close();

	}

}
