public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(); //a primeiraConta é uma flecha para uma conta, uma referencia para objeto Conta
        primeiraConta.saldo = 300;

        Conta segundaConta = primeiraConta; //duas referencias pro mesmo objeto

        segundaConta.saldo += 100;

        System.out.println("Saldo da segunda conta: " + segundaConta.saldo + "\n Saldo da primeira conta: " + primeiraConta.saldo);
    }
}
