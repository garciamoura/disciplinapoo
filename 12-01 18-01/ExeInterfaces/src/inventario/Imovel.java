
package inventario;

public class Imovel implements Bens{
   private int codigo;
   private int num_quartos;
   private double metragem;
   private double valor;
   
   
   public Imovel(){};
   public Imovel(int arg_codigo, int arg_numquartos, double arg_metragem, double arg_valor){
   codigo = arg_codigo;
   num_quartos = arg_numquartos;
   metragem = arg_metragem;
   valor = arg_valor;
   }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNum_quartos() {
        return num_quartos;
    }

    public void setNum_quartos(int num_quartos) {
        this.num_quartos = num_quartos;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }
    
   @Override
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
   
   
}
