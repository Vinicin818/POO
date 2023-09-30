/*
Classe impressão de texto: "Veiculo.java"
IFPR - Campus Cascavel
Aluno: Vinícius Mendes Paloschi
Disciplina: Programação orientada a Objetos
Professor: Nelson Bellincanta
*/

public class Main {
    public static void main(String[] args) {

        Cachorros cachorro = new Cachorros("Conquistador de Mundos", "Pug", 2);
        cachorro.emitirSom();
        cachorro.mover();
        System.out.println(cachorro.getNome());
        System.out.println(cachorro.getIdade());
        cachorro.abanarRabo();

        System.out.println();

        Passaros passaro = new Passaros("Larry", 1, "Cinza");
        passaro.emitirSom();
        System.out.println(passaro.getIdade());
        System.out.println(passaro.getNome());
        passaro.voar();
        System.out.println(passaro.getCor());
        passaro.construirNinho();
    }
}