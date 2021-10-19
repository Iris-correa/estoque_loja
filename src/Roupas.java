/**
 *
 * @author Iris Correa
 */
public class Roupas {
    //Atributos
    String descricao;
    private String sexo;
    private String tamanho;
    double valor;
    
    //Métodos
    
    //Get e Set SEXO
   public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String fm){
        this.sexo = fm;
    }
    
    //Get e Set TAMANHO
    
    public String getTamanho(){
        return this.tamanho;
    }
    
    public void setTamanho(String pmg){
        this.tamanho = pmg;
    }
    
    //Método de calculo
    
    public double CalcularValor(double valorR){
        double NovoValor = this.valor + (this.valor * 0.10);
        return NovoValor;
    }
    
}
