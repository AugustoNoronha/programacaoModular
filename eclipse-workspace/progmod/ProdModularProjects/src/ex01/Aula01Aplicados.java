package ex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Aula01Aplicados {

	Scanner sc = new Scanner(System.in);
	int qtdMaterias = 0;
	int horasSemana = 0;
	int minutosDia = 0;
	public Aula01Aplicados() {

	}

	public void entrada05() {
		System.out.println("Quantas materias");
		qtdMaterias = sc.nextInt();
		System.out.println("Quantas horas por semana que você tem");
		horasSemana = sc.nextInt();
		while(horasSemana > 24 * 7) {
			System.out.println("Lembrese que a semana so tem 168 horas em...");
			System.out.println("Digite novamente as horas por dia que você tem");
			horasSemana = sc.nextInt();
		}
		System.out.println("Qunatos minutos você tem ?");
		minutosDia = sc.nextInt();
		while(minutosDia > 60) {
			System.out.println("Lembrese que " + minutosDia +  " minutos não existe em...");
			System.out.println("Digite novamente as horas por dia que você tem");
			minutosDia = sc.nextInt();
		}
	}

	public void separaHoras() {
		int horasPorMateria = horasSemana/qtdMaterias;
		int minutosPorMateria = minutosDia/qtdMaterias;

		System.out.println("Você deve estudar " + horasPorMateria/7 +" horas e " +  minutosPorMateria/5 +  " minutos "+ "por dia, todos os dias da semana" );
	}

	public int[] entrada06() {
		System.out.println("Digite a quantidade de numeros da loteria federal");
		int qtd = sc.nextInt();
		int[] loteria = new int[qtd];
		for(int i = 0; i < qtd; i++) {
			System.out.println("Digite os números da loteria federal no formato #######");
			loteria[i] = sc.nextInt();
		}
		return loteria;
	}

	public void montaNumero(int[] loteria) {

		String palavra = Integer.toString(loteria[0]);
		int tam = palavra.length();
		StringBuilder palavra1 = new StringBuilder();
		palavra1.append(palavra.charAt(tam-3));
		palavra1.append(palavra.charAt(tam-2));
		palavra1.append(palavra.charAt(tam-1));

		System.out.println(Integer.parseInt(palavra1.toString()));

		String palavra2 = Integer.toString(loteria[1]);
		int tam2 = palavra2.length();
		StringBuilder palavra2Builder = new StringBuilder();
		palavra2Builder.append(palavra.charAt(0));
		palavra2Builder.append(palavra.charAt(1));
		palavra2Builder.append(palavra.charAt(2));

		StringBuilder bilheteCampeao = new StringBuilder();

		bilheteCampeao.append(palavra2Builder.toString());
		bilheteCampeao.append(".");
		bilheteCampeao.append(palavra1.toString());


		System.out.println("O bilhete campeão é: " + bilheteCampeao.toString());


	}

	public static int multiplica11(int num) {
		int desena = num / 10;
		int unidade = num % 10;
		int sum = desena + unidade;
		int populate = sum / 10;
		int res = populate * 100 + sum % 10 * 10 + unidade;

		return res;
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

	public static String calculaDiaSemana(String inputDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date = dateFormat.parse(inputDate);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(date);

			int dia = calendar.get(Calendar.DAY_OF_MONTH);
			int mes = calendar.get(Calendar.MONTH) + 1;
			int ano = calendar.get(Calendar.YEAR);

			int h = (dia + (13 * (mes + 1)) / 5 + ano + (ano / 4) - (ano / 100) + (ano / 400)) % 7;

			String[] diasSemana = {"Sábado", "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira"};
			return diasSemana[h];
		} catch (ParseException e) {
			return "Data inválida.";
		}
	}

	public void ex05(){
		entrada05();
		separaHoras();
	}

	public void ex06(){
		int[]entrada = entrada06();
		montaNumero(entrada);
	}

	public void ex07(){
		int num1 = 81;
		int result = multiplica11(num1);
		System.out.println(num1 + " x 11 = " + result);

		int num2 = 56;
		result = multiplica11(num2);
		System.out.println(num2 + " x 11 = " + result);
	}

	public void ex08() {
		System.out.println("A data esta hard coded na linha ");
		System.out.println(" ");
		String inputDate = "31/02/2023"; 
		String validationResult = validateDate(inputDate);
		System.out.println(validationResult);
	}

	public void ex09() {
		System.out.println("Esse exercicio foi feito com o auxilio do GPT, por "
				+ "motivos de eu não ter ideia de por onde começar, ele m explicou"
				+ " que posso usar o conceito de Zeller!");
		System.out.println(" ");
		System.out.println("A data esta hard Coded");
		System.out.println(" ");
		String inputDate = "15/08/2024"; 
		String dayOfWeek = calculaDiaSemana(inputDate);
		System.out.println("A data " + inputDate + " será uma " + dayOfWeek + " em 2024.");
	}
}
