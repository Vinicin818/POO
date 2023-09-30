public class Aves {
    String nome;
    int idade;

    public Aves(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
            return idade;
        }

    public void voar() {
        System.out.println("Ave voando");
    }
}
