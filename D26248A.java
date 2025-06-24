package prova3;

import java.util.Scanner;
public class D26248A {public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double[] nota = new double[50];
    double maior = 0;
    int contabsoluta = 0;
    double freqRelativa;

    for (int i = 0; i < nota.length; i++ ) {
        System.out.println("Digite a nota do aluno: ");
        nota[i] = teclado.nextDouble();
        teclado.nextLine();
        if (nota[i] > maior || maior == 0) {
            maior = nota[i];
            contabsoluta++;
        }


    }
    freqRelativa = contabsoluta / 50;

    System.out.println("Frequência absoluta da maior nota: " + contabsoluta);
    System.out.println("Frequência relativa da maior nota: " + freqRelativa);





}
}
