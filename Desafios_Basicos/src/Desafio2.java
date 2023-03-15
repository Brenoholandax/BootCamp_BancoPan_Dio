// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  


import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {
	
  public static void main(String[] args) throws IOException {
     Scanner leitor1 = new Scanner(System.in);
  
        int count = 0; // contador para valores positivos
        double sum = 0.0; // soma dos valores positivos

        for (int i = 0; i < 6; i++) {
            double x = leitor1.nextDouble();
            if (x > 0) {
                count++;
                sum += x;
            }
        }

        System.out.println(count + " valores positivos");

        if (count > 0) {
            double avg = sum / count;
            System.out.printf("%.1f%n", avg);
        }

     
        leitor1.close();
    }
}

