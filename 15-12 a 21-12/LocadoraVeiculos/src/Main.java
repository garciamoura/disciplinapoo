public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro(2014,"amarelo","123456","gasolina",32000);
        Veiculo veiculo2 = new Moto(1998,"vermelho","654321","flex",18000);
        
        veiculo1.CalculaIpva();
        veiculo1.MostraDetalhes();
        
        veiculo2.CalculaIpva();
        veiculo2.MostraDetalhes();
    
    }   
}
