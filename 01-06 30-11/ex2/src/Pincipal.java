
public class Pincipal {
    public static void main(String[] args){
        Lampada lampada1 = new Lampada();
        lampada1.estadoLampada = true;        
        Fabricante fabricante1 = new Fabricante();
        fabricante1.cpf = "54398";
        fabricante1.nome = "DATALUZ";
        
        Lampada lampada2 = new Lampada();
        lampada2.estadoLampada = false;        
        Fabricante fabricante2 = new Fabricante();
        fabricante2.cpf = "123344";
        fabricante2.nome ="WATZZ";
        
        lampada1.mostraLampada();
        fabricante1.mostraDetalhes();
        lampada1.desligar();
        lampada1.mostraLampada();
        
        System.out.println("-----------"); 
        
        lampada2.mostraLampada();
        fabricante2.mostraDetalhes();
        lampada2.ligar();
        lampada2.mostraLampada();
        
        
        
  }
}
