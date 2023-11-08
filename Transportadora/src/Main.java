public class Main {
    public static void main(String[] args) {
        Transportadora transportadoraNautica = new TransporteNautico();
        Transportadora transportadoraTerrestre = new TransporteTerrestre();

        int altura = 10;
        int largura = 5;

        double freteNautico = transportadoraNautica.calculaFrete(altura, largura);
        double freteTerrestre = transportadoraTerrestre.calculaFrete(altura, largura);

        System.out.println("Frete Náutico: " + freteNautico);
        System.out.println("Frete Terrestre: " + freteTerrestre);
    }
}