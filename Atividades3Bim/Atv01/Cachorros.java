public class Cachorros extends Mamiferos{
    private String raca;

    public Cachorros(String racaDoCachorro, String nome, int idade){
        super(nome, idade);
        this.raca = racaDoCachorro;
    }

    public String getRaca(){
        return this.raca;
    }

    public void setRaca(String racaDoCachorro){
        this.raca = racaDoCachorro;
    }

    public void abanarRabo(){
        System.out.println("O cachorro está abanando o rabo.");
    }
}