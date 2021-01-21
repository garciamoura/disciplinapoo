
package inventario;

public class Main {
    public static void main(String[] args) {
        Bens[] bens = new Bens[4];
        double somabens=0;
        
        bens[0] = new Imovel(1,4,160,200000);
        bens[1] = new Imovel(2,3,120,160000);
        bens[2] = new Carro(1,"Fiat","Fiat Dobló",2021,110000);
        bens[3] = new Carro(2,"Fiat","Fiat Uno", 2021,50000);
        
       
        for(int i=0; i<=3;i++){
            somabens += bens[i].getValor();
        }
        
        System.out.println("Soma dos bens: " + somabens);
    }
 
}
