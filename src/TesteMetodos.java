public class TesteMetodos {
    public static void main(String[] args) {
        Conta contaDaMaria = new Conta();//é comum dar o nome da variavel com letra minuscula da classe
        contaDaMaria.saldo = 200;
        contaDaMaria.depositoConta(50);
        System.out.println(contaDaMaria.saldo);


        boolean saqueEfetivado = contaDaMaria.saqueConta(20);
        System.out.println(contaDaMaria.saldo);
        System.out.println(saqueEfetivado);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.depositoConta(1000); //na invocação de métodos, o primeiro item que aparece é a referencia a variavel

        contaDaMarcela.transfConta(300 , contaDaMaria);

        System.out.println(contaDaMaria.saldo);
        System.out.println(contaDaMarcela.saldo);

    }
}
