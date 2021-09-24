import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número de 01 - 10: ");
		int n = entrada.nextInt();

		int n1 = n * 1;
		int n2 = n * 2;
		int n3 = n * 3;
		int n4 = n * 4;
		int n5 = n * 5;
		int n6 = n * 6;
		int n7 = n * 7;
		int n8 = n * 8;
		int n9 = n * 9;
		int n10 = n * 10;

		System.out.println("A tabuada do número digitado é: " + "\n" + "\n" +

				n + " x 01 = " + n1 + "\n" + n + " x 02 = " + n2 + "\n" + n + " x 03 = " + n3 + "\n" + n + " x 04 = "
				+ n4 + "\n" + n + " x 05 = " + n5 + "\n" + n + " x 06 = " + n6 + "\n" + n + " x 07 = " + n7 + "\n" + n
				+ " x 08 = " + n8 + "\n" + n + " x 09 = " + n9 + "\n" + n + " x 10 = " + n10);
		
		entrada.close();

	}

}
