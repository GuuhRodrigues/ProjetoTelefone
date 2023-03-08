package br.com.newton.linguagem.aula03;

public class Agenda {

    public static void main(String[] args) {

        Telefone tel = new Telefone();
        Contato cont = new Contato();
        Telefone tel2 = new Telefone();
        Contato cont2 = new Contato();
        Telefone tel3 = new Telefone();
        Contato cont3 = new Contato();

        cont.nome = "Rafaela";
        cont.numero = "123456";

        cont2.nome = "João";
        cont2.numero = "318989952";

        cont3.nome = "Carmen";
        cont3.numero = "3189871147";

        tel.marca = "iPhone";
        tel2.marca = "S20";
        tel3.marca = "iPhone";

        tel.cor = "Azul";
        tel2.cor = "Preto";
        tel3.cor = "Branco";

        tel.c1 = cont;
        tel2.c1 = cont2;
        tel3.c1 = cont3;

        tel.Tocar("Pagode");
        tel2.Ligar(cont3);

        System.out.println(tel.c1.nome + " " + tel.c1.numero + " " + tel.cor + " " + tel.marca);
        System.out.println(tel2.c1.nome + " "+ tel2.c1.numero + " " + tel2.cor + " " + tel2.marca);
        System.out.println(tel3.c1.nome + " "+ tel3.c1.numero + " " + tel3.cor + " " + tel3.marca);
    }
}
