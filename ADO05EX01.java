import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int menu;
		
		do {
			System.out.println("Menu principal" + "\n");
			System.out.println("1 - Intruções");
			System.out.println("2 - Jogar ");
			System.out.println("3 - Créditos");
			System.out.println("4 - Sair" + "\n");
			
			System.out.println("Digite uma opção: ");
			menu = entrada.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("Intruções do Jogo");
				break;
			case 2:
				System.out.println("Iniciar jogo");
				break;
			case 3:
				System.out.println("Créditos do jogo");
				break;
			case 4:
				System.out.println("sair");
					}
			
		} while (menu !=4);
			System.out.println("Fim");
		
		entrada.close();

	}

}
