package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de discos na Torre: ");
		int n = sc.nextInt();

		movimentoTorre.movimento(n, 'A', 'B', 'C');

		sc.close();

	}

}
