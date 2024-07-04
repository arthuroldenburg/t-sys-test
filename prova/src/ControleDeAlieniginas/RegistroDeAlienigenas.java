package ControleDeAlieniginas;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class RegistroDeAlienigenas {
    private int id = 0;
    private String nome;
    private String especie;
    private String nivelDePericulosidade;
    private Date dataDeEntrada;

    private boolean isInQuarentena = false;

    private static ArrayList<RegistroDeAlienigenas> alienigenas = new ArrayList<>();

    public RegistroDeAlienigenas() {}

    public RegistroDeAlienigenas(String nome, RegistroDeEspecie especie) {
        this.id ++;
        this.nome = nome;
        this.especie = especie.getNomeDaEspecie();
        this.nivelDePericulosidade = especie.getNivelDePericulosidade();
        this.dataDeEntrada = new Date();
        if (especie.getNivelDePericulosidade().equalsIgnoreCase("Alto")) isInQuarentena = true;
        alienigenas.add(this);
    }

    public RegistroDeAlienigenas(String nome, String especie) {
        this.id ++;
        this.nome = nome;
        this.especie = especie;
        this.nivelDePericulosidade = avaliarPericulosidade(especie);
        this.dataDeEntrada = new Date();
        if (avaliarPericulosidade(especie).equalsIgnoreCase("Alto")) isInQuarentena = true;
        alienigenas.add(this);
    }

    public static void relatorioDeEntrada() {
        for (RegistroDeAlienigenas r : alienigenas) {
            System.out.println("Nome: " + r.getNome());
            System.out.println("Especie: " + r.getEspecie());
            if (r.isInQuarentena) System.out.println("Esta de quarentena e sendo vigiado!");
            System.out.println("Seu nivel de periculosidade e: " + r.getNivelDePericulosidade());
        }
    }

    public String avaliarPericulosidade(String especie) {
        String p = "baixo";
        for (RegistroDeEspecie a : RegistroDeEspecie.registroDeEspecie) {
            if (a.getNomeDaEspecie().equals(especie)) {
                if (a.getNivelDePericulosidade().equalsIgnoreCase("baixo")) {
                    System.out.println("Baixo");
                    p = "baixo";
                };
                if (a.getNivelDePericulosidade().equalsIgnoreCase("medio")) {
                    System.out.println("Mediano");
                    p = "Mediano";
                };
                if (a.getNivelDePericulosidade().equalsIgnoreCase("alto")) {
                    System.out.println("Alto");
                    p = "Alto";
                };
            }
            if (!a.getNomeDaEspecie().equals(especie)) {
                System.out.println("Especie nao encontrada!");
            }
        }
        return p;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNivelDePericulosidade() {
        return nivelDePericulosidade;
    }

    public void setNivelDePericulosidade(String nivelDePericulosidade) {
        this.nivelDePericulosidade = nivelDePericulosidade;
    }

    public String getDataDeEntrada() {
        return DateFormat.getInstance().format(dataDeEntrada);
    }

    public void setDataDeEntrada(Date dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }
}
