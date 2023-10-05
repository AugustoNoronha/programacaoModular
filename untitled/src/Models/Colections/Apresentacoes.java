package Models.Colections;

import Models.Classes.Apresentacao;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Apresentacoes {
    private static Apresentacoes instancia;
    private List<Apresentacao> listaApresentacoes;

    private Apresentacoes() {
        listaApresentacoes = new ArrayList<>();
    }

    public static Apresentacoes getInstance() {
        if (instancia == null) {
            instancia = new Apresentacoes();
        }
        return instancia;
    }

    public void addApresentacao(Apresentacao apresentacao) {
        listaApresentacoes.add(apresentacao);
    }

    public void delApresentacao(Apresentacao apresentacao) {
        listaApresentacoes.remove(apresentacao);
    }

    public void atualizarApresentacao(Apresentacao apresentacaoAntiga, Apresentacao apresentacaoNova) {
        int index = listaApresentacoes.indexOf(apresentacaoAntiga);
        if (index != -1) {
            listaApresentacoes.set(index, apresentacaoNova);
        }
    }

    public List<Apresentacao> listarTodasApresentacoes() {
        return listaApresentacoes;
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("### Menu ###");
            System.out.println("1. Adicionar Apresentacao");
            System.out.println("2. Listar Todas as Apresentacoes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Adicionar Apresentacao
                    System.out.print("Digite a hora da apresentacao (hh:mm:ss): ");
                    String hora = scanner.next();
                    Time horaApresentacao = Time.valueOf(hora);
                    Apresentacao novaApresentacao = new Apresentacao(horaApresentacao);
                    Apresentacoes.getInstance().addApresentacao(novaApresentacao);
                    System.out.println("Apresentacao adicionada com sucesso!");
                    break;


                case 2:
                    // Listar Todas as Apresentacoes
                    List<Apresentacao> apresentacoes = Apresentacoes.getInstance().listarTodasApresentacoes();
                    System.out.println("### Lista de Apresentacoes ###");
                    for (Apresentacao apresentacao : apresentacoes) {
                        System.out.println(apresentacao);
                    }
                    break;

                case 0:
                    System.out.println("Saindo do menu...");
                    return;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}
