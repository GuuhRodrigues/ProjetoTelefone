package br.com.newton.linguagem.aula03;

public class Telefone {

    public String marca;

    public String cor;


    Contato c1;

    public void Tocar(String estiloMusica){
        System.out.println("Tocando " + estiloMusica);
    }

    public void Ligar(Contato cont){
        if (this.cor.equals("Preto"))
            System.out.println("Ligando para " + cont.nome);
        else
            System.out.println("Telefone indisponível");
    }






    }
