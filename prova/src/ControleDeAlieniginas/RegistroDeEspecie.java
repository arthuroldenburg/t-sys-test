package ControleDeAlieniginas;


import java.util.ArrayList;

public class RegistroDeEspecie {
    private String nomeDaEspecie;
    private String planeta;
    private String nivelDePericulosidade;
    public static ArrayList<RegistroDeEspecie> registroDeEspecie = new ArrayList<>();


    public RegistroDeEspecie() {}

    public  RegistroDeEspecie(String nomeDaEspecie,String planeta, String nivelDePericulosidade) {
        this.nomeDaEspecie = nomeDaEspecie;
        this.planeta = planeta;
        this.nivelDePericulosidade = nivelDePericulosidade;
        registroDeEspecie.add(this);
    }

    public static ArrayList<RegistroDeEspecie> getRegistroDeEspecie() {
        return registroDeEspecie;
    }

    public static boolean verificarSeExisteEspecie(String e) {
        boolean existe = false;
        for (RegistroDeEspecie registro : registroDeEspecie) {
            if (registro.getNomeDaEspecie().equals(e)) existe = true;
        }
        if (!existe) throw new Error();
        return existe;
    }

    public String getNomeDaEspecie() {
        return nomeDaEspecie;
    }

    public void setNomeDaEspecie(String nomeDaEspecie) {
        this.nomeDaEspecie = nomeDaEspecie;
    }

    public void setNivelDePericulosidade(String nivelDePericulosidade) {
        this.nivelDePericulosidade = nivelDePericulosidade;
    }

    public String getNivelDePericulosidade() {
        return nivelDePericulosidade;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
}
