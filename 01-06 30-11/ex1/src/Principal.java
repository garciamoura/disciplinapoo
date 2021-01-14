public class Principal {
    public static void main(String[] args){
        ContaBancariaSimplificada conta1 = new ContaBancariaSimplificada();
        conta1.contaEspecial = true;
        conta1.nomeCorrentista = "Gabriela";
        conta1.saldo = 150.00;
        
        ContaBancariaSimplificada conta2 = new ContaBancariaSimplificada();
        conta2.contaEspecial = false;
        conta2.nomeCorrentista = "Felippe";
        conta2.saldo = 150.00;
        
        conta1.retiraValor(200.00);
        //conta1.mostraSaldo();
        conta1.mostraDados();
        
        conta2.retiraValor(200.00);
        //conta2.depositaValor(50.00);
        //conta2.mostraSaldo();
        conta2.mostraDados();
        
        
    }
}
