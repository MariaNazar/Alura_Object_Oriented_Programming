public class Conta { //nesse caso, Conta tem quatro atributos
    double saldo;
    int agencia;
    int numero;
    String titular;

    public void depositoConta(double valor){ //void é uma palavra chave que nao vai retornar nada nesse método, só o fará
        this.saldo = this.saldo + valor; //saldo é um atributo da Conta
        //this é uma referencia a este atributo, sendo algo opcional
    }
       //não existe metodo dentro de metodo, fecha chaves de um metodo e abre outras.
    public boolean saqueConta(double valor){
        if (this.saldo >= valor) { //se o saldo da conta for maior que o valor solicitado entao faca/if sempre é boleano
            this.saldo = this.saldo - valor;//o saldo dessa conta ficara como saldo dessa conta menos o valor solicitado para saque
            return true;
        } else {
            return false;
        }
    } 

    public boolean transfConta(double valor , Conta destino){//o que é posto dentro dos parenteses chamamos de parametros
        if (this.saldo >= valor){
            this.saldo -=valor;
            destino.depositoConta(valor);
        }
            return false;

    }

}