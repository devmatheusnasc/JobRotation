package Atividade;

public class Questao4 {
    public static void main(String[] args) {
        int distancia = 100;
        int velocidadeCarro = 110;
        int velocidadeCaminhao = 80;

        double distanciaCaminhaoAtePedagio1 = (double) distancia / 2;
        double distanciaCaminhaoAtePedagio2 = distancia - distanciaCaminhaoAtePedagio1;
        double tempoCaminhaoAtePedagio1 = (distanciaCaminhaoAtePedagio1 / velocidadeCaminhao) + 5 / 60.0;
        double tempoCaminhaoAtePedagio2 = (distanciaCaminhaoAtePedagio2 / velocidadeCaminhao) + 5 / 60.0;
        double tempoTotalCaminhao = (distancia / velocidadeCaminhao) + tempoCaminhaoAtePedagio1
        		+ tempoCaminhaoAtePedagio2;
        double distanciaCarro = velocidadeCarro * tempoTotalCaminhao;

        if (distanciaCarro < distanciaCaminhaoAtePedagio1) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else if (distanciaCarro > distanciaCaminhaoAtePedagio2) {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O carro e o caminhão estão equidistantes de Ribeirão Preto.");
        }
    }
}
