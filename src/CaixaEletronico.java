public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 15.0;

        if(valorSolicitado < saldo){

            saldo = saldo - valorSolicitado;
            System.out.println("Saldo é: " + saldo);
        }else
        System.out.println("Saldo Insuficiente");

    }
}
