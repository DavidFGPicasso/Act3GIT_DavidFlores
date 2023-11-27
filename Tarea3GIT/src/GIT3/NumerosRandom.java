package GIT3;
import java.util.Random;
import java.util.Scanner;

public class NumerosRandom {
	public static void main(String[] args) {
		Scanner sc  = new Scanner (System.in);
		Random rand = new Random();
		System.out.println("30 numeros random entre 1 y 10.");
		for (int  i = 0; i <30; i++ ) {
			int numeroRandom = rand.nextInt(10) +1;
			System.out.println(numeroRandom + " ");
		}

	}

}
