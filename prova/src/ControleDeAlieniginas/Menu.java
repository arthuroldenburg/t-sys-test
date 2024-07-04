package ControleDeAlieniginas;

import java.util.Scanner;

public class Menu {
    private boolean isRunning = false;

    Scanner s = new Scanner(System.in);

    public Menu() {
        isRunning = true;
        start();
    }

    private void start() {
        while (getIsRunning()) {
            boasVindas();
            int op = s.nextInt();
            if (op == 1) {
                try{
                    System.out.println("Nome do Alien:");
                    String nome = s.nextLine();
                    String nome2 = s.nextLine();
                    String especie = pegarEspecie();
                    RegistroDeEspecie.verificarSeExisteEspecie(especie);
                    new RegistroDeAlienigenas(nome2, especie);
                    System.out.println("Alien Registrado com sucesso!");
                } catch (Error e){
                    System.out.println("Especie nao encontrada!");
                }
            };
            if (op == 2) {
                System.out.println("Nome da especie:");
                String nome = s.nextLine();
                String nome2 = s.nextLine();
                System.out.println("Nome do planeta:");
                String planeta = s.nextLine();
                System.out.println("A periculosidade da especie e Baixa, Media ou Alta?");
                String periculosidade = s.nextLine();
                new RegistroDeEspecie(nome2, planeta, periculosidade);

            };
            if (op == 3) RegistroDeAlienigenas.relatorioDeEntrada();
            if (op == 4) setRunning();

            }
    }


    private String pegarEspecie() {
        System.out.println("Nome da Especie:");
        return s.nextLine();
    }

    private String pegarPlaneta() {
        System.out.println("Nome do Planeta:");
        return s.nextLine();
    }

    private void selecionarPericulosidade() {
        System.out.println("Selecione qual a periculosidade do alien:");
        System.out.println("1 - Baixo");
        System.out.println("2 - Medio");
        System.out.println("3 - Alto");
    }

    private void boasVindas() {
        System.out.println("Selecione a opcao abaixo:");
        System.out.println("1 - Cadastrar Alien");
        System.out.println("2 - Cadastrar Especie");
        System.out.println("3 - Listar Aliens");
        System.out.println("4 - Sair");
    }

    public boolean getIsRunning() {
        return isRunning;
    }

    public void setRunning() {
        isRunning = !isRunning;
    }

    private void track() {
        System.out.println("--------");
    }
}
