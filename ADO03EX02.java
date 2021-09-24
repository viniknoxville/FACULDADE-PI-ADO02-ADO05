import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Tentando construir um triangulo"+ '\n');
	
		System.out.println("Digite um valor para A: ");
		a = entrada.nextInt();

		System.out.println("Digite um valor para B: ");
		b = entrada.nextInt();

		System.out.println("Digite um valor para C: ");
		c = entrada.nextInt();

		if ((a + b > c) && (a + c > b) && (c + b > a) && (a == b && b == c)) {
			System.out.println("Você formou um triangulo equilatero!");

		} else if ((a + b > c) && (a + c > b) && (c + b > a) && (a == b || b == c || c == a)) {
			System.out.println("Você formou um triangulo isosceles!");

		} else if ((a + b > c) && (a + c > b) && (c + b > a) && (a != b) && (b != c)) {
			System.out.println("Você formou um riangulo escaleno!");

		} else {
			System.out.println("Tente de novo, você não formou um triangulo!!!");

		} entrada.close();

	}

}
