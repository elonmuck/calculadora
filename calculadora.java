package br.com.dio.calculadora;

import java.util.Scanner;

public class calculadora {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
        int soma = soma(a,b);
        int subtração = subtração(a,b);
         int divisão = divisão(a,b);
        int multiplicação = multiplicação(a,b);
        
        System.out.println(soma);
        System.out.println(subtração);
         System.out.println(divisão);
        System.out.println(multiplicação);
        
        
		

	}
	
	public static int soma (int a, int b) {
		return a + b;
	}
	
	public static int subtração (int a, int b) {
		return a - b;
	}
	
	public static int divisão (int a, int b) {
		return a / b;
	}
	
	public static int multiplicação (int a, int b) {
		return a * b;
	}

}
