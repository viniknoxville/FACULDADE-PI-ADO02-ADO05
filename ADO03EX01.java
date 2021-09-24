import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float valorcompra;

		System.out.println("Informe o valor da compra: ");
		valorcompra = entrada.nextFloat();

		if (valorcompra >= 300) {

			float desconto = ((valorcompra * 20) / 100);
			float total = (valorcompra - desconto);

			System.out.println("Total da compra com 20% de desconto: " + total + "\n" + "Valor do desconto: "
					+ desconto + " reais.");
		}

		if (valorcompra < 300) {

			float desconto = ((valorcompra * 15) / 100);
			float total = (valorcompra - desconto);

			System.out.println("Total da compra com 15% de desconto: " + total + "\n" + "Valor do desconto: "
					+ desconto + " reais.");

			entrada.close();
		}

	}

}
