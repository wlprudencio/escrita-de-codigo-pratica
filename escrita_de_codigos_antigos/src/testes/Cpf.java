package testes;

import java.util.Scanner;

public class Cpf {
	public static void main(String[] args) {
		 int quantidademinimadigitos = 11;
		 int quantidademaximadigitos = 11;
		 
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Digite o numero de CPF:");
		 String cpf = scanner.nextLine();
		 
		 cpf = cpf.replaceAll("[^0-9]", "");
		 
		 int quantidadeDigitos = cpf.length();
		 
		 if(quantidadeDigitos < quantidademinimadigitos || quantidadeDigitos > quantidademaximadigitos) {
			 System.out.println("Numero de cpf invalido!");
		 }else {
			 System.out.println("Numero de cpf válido!");
		 }
;
		 
	}

}
