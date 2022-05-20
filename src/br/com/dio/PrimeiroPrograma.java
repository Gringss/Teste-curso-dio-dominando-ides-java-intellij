package br.com.dio;

import jdk.swing.interop.SwingInterOpUtils;
import model.Cachorro;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        System.out.println(cachorro);

        Livro livro1 = new Livro("Seja foda", 200);
        System.out.println(livro1);

       /*int a = 5;
       int b = 3;

        System.out.println("Hello World " + (a + b));*/
    }

}

class Livro {
    private String name;
    private Integer numPaginas;

    public Livro(String name, Integer numPaginas) {
        this.name = name;
        this.numPaginas = numPaginas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "name='" + name + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}