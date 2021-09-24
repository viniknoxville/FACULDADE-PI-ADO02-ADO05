import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String resposta;
		System.out.println("Questão de Conceitos da Computação" + "\n");
		System.out.println("1. Qual o valor de 410 decimal convertido para Hexadecimal?");
		System.out.println("a) 18A");
		System.out.println("b) 14B");
		System.out.println("c) 19A");
		System.out.println("d) 1B4");
		System.out.println("e) A14" + "\n");
		System.out.println("Digite a alternativa correta: ");
		resposta = entrada.next();

		switch (resposta) {
		case "a":
		case "A":
			System.out.println("Resposta incorreta!");
			break;
		case "b":
		case "B":
			System.out.println("Resposta incorreta!");
			break;
		case "c":
		case "C":
			System.out.println("Resposta incorreta!");
			break;
		case "d":
		case "D":
			System.out.println("Resposta correta!");
			break;
		case "e":
		case "E":
			System.out.println("Resposta incorreta!");
			break;

		default:
			System.out.println("Alternativa invalida");

		} entrada.close();

	}

}
