package com.mycompany.vetor1;
import java.util.Scanner;

public class Vetor1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[10];
        
        System.out.println("Digite um número: ");
        for(int i = 0; i < 10; i++) {
            numeros[i]= Integer.parseInt(sc.nextLine());
        }
        
        int soma= 0;
        for(int i = 0; i < 10; i++){
            soma += numeros[i];
        }
        
        System.out.println("A soma dos números é: " + soma);
    }
}
