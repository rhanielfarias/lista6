public abstract class  FiguraGeometrica {
    private double tamanho;
    private double base;
    private double altura;

    public FiguraGeometrica(double tamanho, double base, double altura) {
    this.tamanho = 5;
    this.base = 5;
    this.altura = 5;
    }

    public double getTamanho() {
    return tamanho;
    }
    public void setTamanho (double tamanho) {
    this.tamanho = tamanho;
    }

    public double getBase () {
    return base;
    }

    public void setBase (double base) {
    this.base = base;
    }

    public double getAltura () {
    return altura;
    }

    public void setAltura(double altura) {
    this.altura = altura;
    }


}
