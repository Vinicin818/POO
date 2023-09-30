
public class Mamiferos{
    private String nome;
    private int idade; 

    public Mamiferos(String nomee, int idadee){
        this.nome = nomee;
        this.idade = idadee;
    }

    public void setNome(String nomee){
        this.nome = nomee;
    }

    public void setIdade(int idadee){
        this.idade = idadee;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public void emitirSom(){
        System.out.println("Som de mamífero");
    }

    public void mover(){
        System.out.println("Mamífero se movendo");
    }
}