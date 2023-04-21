package view;

import java.util.Scanner;

import controller.fat;

public class main {
	public static void main(String[] args) throws Exception {
		fat f=new fat();
		Scanner leia= new Scanner(System.in);
		int num;
		System.out.println("Digite um número");
		num=leia.nextInt();
		while(num>=11) {
			System.out.println("Valor inválido digite novamente");
			num=leia.nextInt();
			
		}
		
		f.Fatorial( num);
	}
}
