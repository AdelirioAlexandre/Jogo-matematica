package Gamegeek.Model;
import java.util.Random;

public class Calcular {

    //Atributos
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;

    //Construtor
    public Calcular(int dificuldade){
        Random rand = new Random();
        this.operacao = rand.nextInt(3);
        this.dificuldade = dificuldade;

        if(dificuldade == 1){
            //Facil
            this.valor1 = rand.nextInt(10);
            this.valor2 = rand.nextInt(10);
        }else if(dificuldade == 2){
            //Medio
            this.valor1 = rand.nextInt(100);
            this.valor2 = rand.nextInt(100);
        }else if(dificuldade == 3){
            //Dificil
            this.valor1 = rand.nextInt(1000);
            this.valor2 = rand.nextInt(1000);
        }else if(dificuldade == 4){
            //Insano
            this.valor1 = rand.nextInt(10000);
            this.valor2 = rand.nextInt(10000);
        }else if(dificuldade == 5){
            //Nem tente
            this.valor1 = rand.nextInt(100000);
            this.valor2 = rand.nextInt(100000);
        }else{
            //Caso não escolha a dificuldade
            //Inicia em Medio
            this.valor1 = rand.nextInt(100);
            this.valor2 = rand.nextInt(100);
        }
    }

    //Getters
    //O Setters foram removido pois o valores são randomicos
    public int getDificuldade() {
        return dificuldade;
    }
    public int getValor1() {
        return valor1;
    }
    public int getValor2() {
        return valor2;
    }
    public int getOperacao() {
        return operacao;
    }
    public int getResultado() {
        return resultado;
    }

    //Retorno
    public String toString(){
        String op;
        if(getOperacao() == 0){
            op = "Adicao";
        }else if(getOperacao() == 1){
            op = "subtracao";
        }else if(getOperacao() == 2){
            op = "Multiplicacao";
        }else{
            op = "Operacao nao existe";
        }
        return "Valor 1: " + this.getValor1() +
                "\nValor 2: " + this.getValor2() +
                "\nDificuldade: " + this.getDificuldade() +
                "\nOperacao: " + op;
    }

    //Criando as funçoes das operações
    //Adição
    public boolean adicao(int resposta){
        this.resultado = this.getValor1() + this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Parabens voce acertou");
            certo = true;
        }else{
            System.out.println("Voce errou");
            System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
        }
        return certo;
    }

    //subtração
    public boolean subtracao(int resposta){
        this.resultado = this.getValor1() - this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Parabens voce acertou");
            certo = true;
        }else{
            System.out.println("Voce errou");
            System.out.println(this.getValor1() + " - " + this.getValor2() + " = " +this.getResultado());
        }
        return certo;
    }

    //Multiplicação
    public boolean Multiplicacao(int resposta){
        this.resultado = this.getValor1() * this.getValor2();
        boolean certo = false;

        if(resposta == this.getResultado()){
            System.out.println("Parabens voce acertou");
            certo = true;
        }else{
            System.out.println("Voce errou");
            System.out.println(this.getValor1() + " x " + this.getValor2() + " = " +this.getResultado());
        }
        return certo;
    }
}
