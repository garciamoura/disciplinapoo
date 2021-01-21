
package inventario;

public class Carro implements Bens {
    private int codigo;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;
    
    public Carro(){};
    public Carro(int arg_codigo, String arg_marca, String arg_modelo, int arg_ano,
            double arg_valor){
        codigo = arg_codigo;
        marca=arg_marca;
        modelo = arg_modelo;
        ano = arg_ano;
        valor = arg_valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
