import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		int n1;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Dia da semana" + "\n");
		System.out.println("Digite um valor de 1 - 7: ");
		n1 = entrada.nextInt();

		switch (n1) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("S�bado");
			break;

		default:
			System.out.println("Valor inv�lido");

		}
		entrada.close();
	}

}
