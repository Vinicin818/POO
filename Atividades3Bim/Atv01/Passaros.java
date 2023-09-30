class Passaros extends Aves {
    String cor;

    public Passaros(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

    public String getCor(){
        return cor;
    }

    public void construirNinho() {
        System.out.println("O pássaro está a construir seu ninho.");
    }
}
