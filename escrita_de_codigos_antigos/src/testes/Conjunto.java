package testes;

import java.util.ArrayList;

public class Conjunto {
	public static void main(String[] args) {
		ArrayList<Integer> conjunto = new ArrayList<>();

		// Conjunto Vazio
		boolean conjuntoVazio = conjunto.isEmpty();
		System.out.println("O conjunto está vazia: " + conjuntoVazio);

		// Conjunto Vazio -1
		if (!conjunto.isEmpty()) {
		}
		System.out.println("O conjunto está negativo: " + conjuntoVazio);

		// conjunto Cheio

		conjunto.add(1);
		conjunto.add(2);
		conjunto.add(3);

		boolean conjuntoCheio = conjunto.size() == 3;

		System.out.println("O conjunto está cheio: " + conjuntoCheio);
		
		
		//Conjunto Cheio + 1 
		
		conjunto.add(4);
		conjuntoCheio = conjunto.size() ==3;
		System.out.println("O conjunto possui 3 elementos: " + conjuntoCheio);
		
		
	}

}
