package generation.exercicio.matriz.vetor;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double pontos[] = new double[5];
		double maiorNumero = 0.0;
		
		System.out.println("Escreva as 5 notas: ");
		for(int contador = 0; contador < pontos.length; contador++) {
			pontos[contador] = scan.nextDouble();
			if(pontos[contador] > maiorNumero) {
				maiorNumero = pontos[contador];
			}
		}
		
		System.out.println("O maior número foi de: " + maiorNumero);
		System.out.println("O vetor criado: [" + pontos[0] + ", " + pontos[1] + ", " + pontos[2] +
				", " + pontos[3] + ", " + pontos [4] + "]");
		}
	}

