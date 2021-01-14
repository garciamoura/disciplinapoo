
public class ContaBancariaSimplificada {
    String nomeCorrentista;
    double saldo;
    boolean contaEspecial;
    
    
     void retiraValor(double valor){
         if(this.contaEspecial){
             this.saldo = saldo - valor;
         }
         else{
             if(this.saldo < valor){
                 System.out.println("Saldo insuficiente para retirada: " + saldo);
             }else{this.saldo = this.saldo - valor;
             }
         }
     }
        
    
    void depositaValor(double valor){
             this.saldo = saldo + valor;
         }
    
    void mostraDados(){
             System.out.println("Nome: " + nomeCorrentista + "\nSaldo: $ " + saldo);
         }
    void mostraSaldo(){
             System.out.println("Saldo atual: $ " + saldo);
         }
               
}