class TransporteNautico extends Transportadora {
    @Override
    public double calculaFrete(int altura, int largura) {
        return 0.1 * (altura + largura);
    }
}