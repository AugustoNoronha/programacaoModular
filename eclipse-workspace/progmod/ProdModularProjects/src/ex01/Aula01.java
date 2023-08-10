package ex01;

import java.util.Scanner;

public class Aula01 {
	Scanner sc = new Scanner(System.in);

	public Aula01() {}

	public int[] recebeEntrada() {
		int[] vetorEntrada = new int[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite um numero:");
			int entrada = sc.nextInt();
			vetorEntrada[i] = entrada;
		}
		return vetorEntrada;
	}

	public void inverteEntrada(int[] entrada) {
		int[] vetorInvertido = new int[6];
		int count = 0;
			for(int i = 5; i >= 0; i--) {
				vetorInvertido[count] = entrada[i];
				count++;
			}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(vetorInvertido[i]);
		}
		
	}
	
	public void parVizinhos(int[] entrada) {
		int[] vetorVizinhos = new int[3];
		int count = 0;
			for(int i = 1; i < 6; i++) {
				vetorVizinhos[count] = entrada[i-1] + entrada[i];
				i++;
				count++;
			}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(vetorVizinhos[i]);
		}
	}
	
	public void montaRetangulo() {
		for(int i = 0; i < 5; i++) {
			System.out.print("X");
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println("");
			System.out.print("X");
			System.out.print(" ");
			System.out.print(" ");
			System.out.print(" ");
			System.out.print("X");
			
		}
		System.out.println("");
		
		for(int i = 0; i < 5; i++) {
			System.out.print("X");
		}
	}
	
	public void entradaex04() {
		String frase = sc.nextLine();
		while(!(frase.equals("fim"))) {
			
			String invertida =inverterFrase(frase);
			System.out.println(invertida);
			frase = sc.nextLine();
		}
	}
	
	 public static String inverterFrase(String frase) {
		 //usei stringbuilder para não ter que fazer um for
		 //apenas para prencher um array invertendo a palavra 
		 //e outro para recontruir a frase
	        StringBuilder invertida = new StringBuilder();
	        
	        for (int i = frase.length() - 1; i >= 0; i--) {
	            invertida.append(frase.charAt(i));
	        }
	        
	        return invertida.toString();
	    }

	public void ex01() {
		int[] entrada = recebeEntrada();
		inverteEntrada(entrada);
	}
	
	public void ex02() {
		int[] entrada = recebeEntrada();
		parVizinhos(entrada);
	}
	
	public void ex03() {
		montaRetangulo();
	}
	
	public void ex04() {
		entradaex04();
	}

}
