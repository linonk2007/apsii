package Exercicio4;

public class ProgramaDasFiguras {

    public static void main(String[] args) {

        GerenteDeFiguras gerente = new GerenteDeFiguras();

        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        Losango l1 = new Losango(4.0, 6.0);
        gerente.adicionaFigura(l1);

        Losango l2 = new Losango(8.0, 5.0);
        gerente.adicionaFigura(l2);

        System.out.println("Figuras cadastradas:");
        gerente.imprimeFiguras();

        System.out.println("Área total: " + gerente.getAreaTotal());

        System.out.println("Maior área: " + gerente.getMaiorAreaDeFigura());
    }
}