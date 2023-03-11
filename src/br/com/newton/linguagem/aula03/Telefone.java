package br.com.newton.linguagem.aula03;

public class Telefone {

    public String marca;

    public String cor;

    Contato c1;

    public void Tocar(String estiloMusica){
        if (estiloMusica == "Pagode")
            System.out.println("Só tocamos pagode");
        else
            System.out.println("Estilo de música indisponível");
    }

    //public void Ligar(Telefone cor){
        //if (cor.cor == "Preto")
            //System.out.println("Ligando para o telefone preto de João" );
        //else
            //System.out.println("Telefone indisponível(O telefone não é preto)");
    //}
    public void Ligar(Contato cont){
        if (cont.nome == "Juliana"){
            System.out.println("Ligando para " + cont.nome);
        }
        else
            System.out.println("Telefone Indisponível(O nome do contato não é juliana)");
    }





    }
