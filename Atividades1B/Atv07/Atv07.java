/* Atividade 07;
 * Desenvolvida em Java;
 * Aluno: Vinícius Mendes Paloschi;
 * Aula: Programação Orientada a Objetos;
 */

//importando a biblioteca Scanner
import java.util.Scanner;

public class Atv07 // Declaração da classe atv07
{

    final static Scanner LER = new Scanner(System.in); // Defini LER como a variável stática do Scanner
	public static void main(String[] args) { // Declaracao do método main que inicia a execução do programa 

        System.out.println("Entre com a nota das provas");//Printa a mensagem para informar o usuário 

		String insert; // str axuliar para o Scanner
        double vetor[] = new double[5]; //declaração e alocação do vetor

        
        for (int i = 0; i < 5; i++){ //For para repete o insert de nota 5 vezses

            insert = LER.next();//entrada dos dados com Scanner
            vetor[i] = Float.parseFloat(insert); //conversao dos dados para float e armazenando o dado no vetor

        } //fim do For

        boolean repete; //variavel boleana para se repete o while
        do {
            repete = false; //atribuindo false para a variavel repete
             
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i - 1] > vetor[i]) { //se vetor[anterior] for maior que vetor[na posição i]
                    double x = vetor[i - 1]; //se verdadeiro troca a ordem dos dois valores com ajuda da variavel x
                    vetor[i - 1] = vetor[i];
                    vetor[i] = x;
                    repete = true; //repete recebe true pois deve se comparar novamente 
                }
            }
        } while (repete);

        double media; //alocando a variavel para ser a media das notas
        double notas = 0; // antes de criar a media vamos somar todas as notas do vetor
        String ordemNotas = ""; // string para ir adicionando as notas ja ordenadas

        for (int i = 0; i < vetor.length; i++){ //for para somar todas as notas do vetor e colocar na variavel em String as notas ja ordenadas 

            ordemNotas +=  vetor[i] + ", "; // adicionando a nota na variavel ordemNotas
            notas += vetor[i]; // adicionando a nota da posinçao i do vetor

        }

        media = notas / vetor.length; //fazendo a divisao pelo numero de notas (tamanho do vetor)

        System.out.println("Notas organizadas = " + ordemNotas + " \n" + "Media das notas = " + media); //Imprimindo a saída
	
    } //Encerrando o Main
} //Encerrando a classe
