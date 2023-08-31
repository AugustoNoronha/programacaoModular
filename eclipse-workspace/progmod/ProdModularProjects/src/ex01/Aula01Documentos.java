package ex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Aula01Documentos {
	
	FileReaderFunc leitura = new FileReaderFunc();
	
	
	public void parVizinhos(int[] entrada) {
		int[] vetorVizinhos = new int[entrada.length];
		int count = 0;
			for(int i = 1; i < entrada.length; i++) {
				vetorVizinhos[count] = entrada[i-1] + entrada[i];
				i++;
				count++;
			}
		
		for(int i = 0; i < entrada.length; i++) {
			System.out.println(vetorVizinhos[i]);
		}
	}
	
	public static String validateDate(String inputDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false); 

		try {
			Date date = dateFormat.parse(inputDate);
			return "Data válida: " + dateFormat.format(date);
		} catch (ParseException e) {
			return "Data inválida. O erro está em: " + getErrorPosition(e.getErrorOffset());
		}
	}
	
	public static String validateDateForDesafio(String inputDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false); 

		try {
			Date date = dateFormat.parse(inputDate);
			return dateFormat.format(date);
		} catch (ParseException e) {
			return "Data inválida. O erro está em: " + getErrorPosition(e.getErrorOffset());
		}
	}
	
	public static String getErrorPosition(int errorOffset) {
		switch (errorOffset) {
		case 0:
			return "Dia";
		case 3:
			return "Mês";
		case 6:
			return "Ano";
		default:
			return "Formato inválido";
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
	
	
	public void ex010() {
		String[] entrada = leitura.readLinesFromFile("tmp/ex10.in");
		if(entrada.length > 0) {
			for(int i = 0; i < entrada.length; i++) {
				String[] splitText = entrada[i].split(";");
				int[] intArray = new int[splitText.length];
				for(int j = 0; j < splitText.length; j++) {
					intArray[j] = Integer.parseInt(splitText[j]);
				}
				parVizinhos(intArray);
			}
			
		}
		
		
	}
	
	public void ex011() {
		String[] entrada = leitura.readLinesFromFile("tmp/ex11.in");
		for(int i = 1; i < Integer.parseInt(entrada[0]); i++) {
			String validationResult = validateDate(entrada[i]);
			System.out.println(validationResult);
		}
	}
	
	public void ex012() {
		String[] entrada = leitura.readLinesFromFile("tmp/ex12.in");
		int count = 0;
		while(!(entrada[count].equals("fim"))) {
			String invertida = inverterFrase(entrada[count]);
			System.out.println(invertida);
			count++;
			
		}
		
	}
	
	public void desafio3() {
		Scanner scDesafio3 = new Scanner(System.in);
		Scanner scDesafio3Qtd = new Scanner(System.in);
		Scanner scDesafio3Data = new Scanner(System.in);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String menor = "01/01/1990", maior = "01/01/1990";

		String[] entrada = leitura.readLinesFromFile("tmp/ex11.in");
		for(int i = 1; i < Integer.parseInt(entrada[0]); i++) {
			String validationResult = validateDateForDesafio(entrada[i]);
			System.out.println(validationResult);
			
			if(validationResult.contains("Data")) {
				System.out.println("Essa data é invalida");
			}else {
				if(LocalDate.parse(maior, df).isBefore(LocalDate.parse(validationResult, df))) {
					maior = validationResult;
				}
				if(LocalDate.parse(menor, df).isAfter(LocalDate.parse(validationResult, df))) {
					menor = validationResult;
				}
			}
		}
		
		System.out.println("Deseja inserir mais datas ? (S/N)");
		String menu = scDesafio3.nextLine();
		
		if(menu != "S") {
			
		}else {
			System.out.println("Quantas datas você vai inserir ?");
			int qtd = scDesafio3Qtd.nextInt();
			
		 for(int i = 0; i < qtd; i++) {
			 System.out.println("Insira sua data");
			 String data = scDesafio3Data.nextLine();
			 String validationResult = validateDate(data);
			 
				if(validationResult.contains("Data")) {
					System.out.println("Essa data é invalida");
				}else {
					if(LocalDate.parse(maior).isBefore(LocalDate.parse(validationResult))) {
						maior = validationResult;
					}
					if(LocalDate.parse(menor).isAfter(LocalDate.parse(validationResult))) {
						menor = validationResult;
					}
				}
		 }
		 
		}
		
		System.out.println("A maior data foi :" + maior);
		System.out.println("A menor data foi :" + menor);
		
		
	}
	
}
