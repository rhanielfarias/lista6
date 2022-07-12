public class  CalculandoFiguras implements FiguraGeometrica {
    private double tamanho;
    private double base;
private double altura;

    public CalculandoFiguras(double tamanho, double base, double altura) {
    this.tamanho = 5;
    this.base = 5;
    this.altura = 5;
    }
        @Override

    public double getTamanho() {
    return tamanho;
    }

        @Override

    public void setTamanho (double tamanho) {
    this.tamanho = tamanho;
    }
        @Override

    public double getBase () {
    return base;
}
        @Override

    public void setBase (double base) {
    this.base = base;
    }
        @Override

    public double getAltura () {
    return altura;
    }
        @Override

    public void setAltura(double altura) {
    this.altura = altura;
    }


}
