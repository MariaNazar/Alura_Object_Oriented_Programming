public class CriarConta {
    public static void main(String[] args) {
       Conta primeiraConta = new Conta(); //ele instancia, cria um objeto tipo Conta.
        //quando damos um new em um objeto, existe uma "flecha" para um objeto e não um objeto dentro de classe
        primeiraConta.saldo = 200; //saldo da primeira conta ( . é usado para navegar pelos objetos) vale 200$.
        primeiraConta.agencia = 321;


        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        segundaConta.agencia = 432;

        System.out.println(segundaConta);
        System.out.println(primeiraConta);

    }
}
