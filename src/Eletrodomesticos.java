/**
 *
 * @author Iris Correa
 */
public class Eletrodomesticos {
    //Atributos
    String descricao;
    private int tensao;
    private int potencia;
    double valor;
    double totalValor;
    
    //Métodos GET E SET TENSÃO
    
    public int getTensao(){
        return this.tensao;
    }
    
    public void setTensao(int volt){
         this.tensao = volt;
    }
    public int getPotencia(){
        return potencia;
    }
    
    public void setPotencia(int watts){
        this.potencia = watts;
    }
    
    public double CalcularValor(double valor){
        double NovoValor = this.valor - (this.valor * 0.10);
        return NovoValor;
    }
    
  
}
