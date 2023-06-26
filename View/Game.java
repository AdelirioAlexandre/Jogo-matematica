package Gamegeek.View;
import java.util.Scanner;
import Gamegeek.Model.Calcular;

public class Game {

    //Iniciando as importações
    static Scanner ler = new Scanner(System.in);
    static int pontos = 0;
    static Calcular cal;
    public static void main(String[] args) {
        Game.jogar();
    }
    
    //Iniciando os metodos
    public static void jogar(){
        //Perguntas
        System.out.println();
        System.out.println("======= JOGO MATEMATICO =======");
        System.out.println("Informe o nivel de dificldade !");
        System.out.println("BOA SORTE COSPLAY DISGRAÇA");
        System.out.println("1: Facil");
        System.out.println("2: Medio");
        System.out.println("3: Dificil");
        System.out.println("4: Insano");
        System.out.println("5: Nem tente");
        int dificuldade = Game.ler.nextInt();

        Game.cal = new Calcular(dificuldade);

        System.out.println("Voce é capaz de me dizer o resultado dessa operacao");

        //Iniciando o Jogo
        //Adição
        if(cal.getOperacao() == 0){
            System.out.println(cal.getValor1() + " + " + cal.getValor2());
            int resposta = Game.ler.nextInt();

            if(cal.adicao(resposta)){
                Game.pontos += 1;
                System.out.println("Voce tem " +Game.pontos+ " pontos");
            }
            //Subtração
        }else if(cal.getOperacao() == 1){
            System.out.println(cal.getValor1() + " - " + cal.getValor2());
            int resposta = Game.ler.nextInt();

            if(cal.subtracao(resposta)){
                Game.pontos += 1;
                System.out.println("Voce tem " +Game.pontos+ " pontos");
            }
            //Multiplicação
        }else if(cal.getOperacao() == 2){
            System.out.println(cal.getValor1() + " x " + cal.getValor2());
            int resposta = Game.ler.nextInt();

            if(cal.Multiplicacao(resposta)){
                Game.pontos += 1;
                System.out.println("Voce tem " +Game.pontos+ " pontos");
            }
        }else{
            System.out.println("A operacao " +cal.getOperacao()+ "nao é reconhecida! ");
        }
        System.out.println("Voce deseja continuar...");
        System.out.println("1 - Sim");
        System.out.println("0 - Nao");
        int continuar = Game.ler.nextInt();

        if(continuar == 1){
            Game.jogar();
        }else if(continuar == 0){
            System.out.println("Voce fez " +Game.pontos+ " pontos");
            System.out.println("Obrigador por jogar");
            System.exit(0);
        }
    }
}