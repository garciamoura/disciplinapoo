
public class Lampada {
    boolean estadoLampada;
   

    void ligar(){
        estadoLampada = true;
    }
    
    void desligar(){
        estadoLampada = false;
    }
    
    void mostraLampada(){
        if(this.estadoLampada){
            System.out.println("LAMPADA ACESA");
        }else{
            System.out.println("LAMPADA APAGADA");
        }
    }
}
