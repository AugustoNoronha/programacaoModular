package ex01;

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
	
	public void ex05(){
		entrada05();
		separaHoras();
	}
	
	
	


}
