package main;

import java.util.Locale;
import java.util.Scanner;

import entidade.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		/* O programa lê nome, altura e idade e armazena em um vetor de classes Pessoa. */
		/* Por fim, o programa exibe a média das alturas. */
		/* Exercício em Java para treinamento de for e Vetores de Classes. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		int nPessoas = sc.nextInt();
		
		Pessoa[] vetorPessoas = new Pessoa[nPessoas];
		
		for(int i=0;i<nPessoas;i++) {
			System.out.println("Dados da pessoa "+i);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
	
			vetorPessoas[i] = new Pessoa(nome, altura, idade);
		}
		
		double soma=0;
		
		for(int i=0;i<vetorPessoas.length;i++) {
			soma += vetorPessoas[i].getAltura();
		}
		
		System.out.printf("Média das alturas: %.4f", soma/vetorPessoas.length);
		
	}

}
