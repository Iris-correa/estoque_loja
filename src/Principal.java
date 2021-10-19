
import javax.swing.JOptionPane;

/**
 *
 * @author Iris Correa
 */

public class Principal {
    public static void main(String[] args) {

        //Objeto ELETRO
        Eletrodomesticos eletro = new Eletrodomesticos();
        // Entrada de valores ELETRO PUBLICOS
        eletro.descricao = JOptionPane.showInputDialog("Descrição do eletrodoméstico: ");
         // Entrada de valores ELETRO PRIVATE
        int pot = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da potencia em WATTS: "));
        eletro.setPotencia(pot);
        int ten = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da tensão em volts: "));
        eletro.setTensao(ten);
        eletro.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto: "));
        //Cálculo de DESCONTO COM 10%
        eletro.CalcularValor(eletro.valor);
        
        //Saídas 
        JOptionPane.showMessageDialog(null, "Descrição: " + eletro.descricao +
                "\nPotencia: " + eletro.getPotencia() + "W " + 
                "\nTensão: " + eletro.getTensao() + "V" + 
                "\nValor: R$ " + eletro.valor +
                "\nValor total a pagar: R$ " + eletro.CalcularValor(eletro.valor)
        );
        
        //Objeto Roupas
        Roupas roup = new Roupas();
        //Entrada de valores ROUP PUBLICOS
        roup.descricao = JOptionPane.showInputDialog("Descrição da roupa: ");
        //Entrada de valores PRIVADOS 
        String sexo = JOptionPane.showInputDialog("Digite a categoria(fem/masc): ");
        roup.setSexo(sexo);
        String tam = JOptionPane.showInputDialog("Digite o tamanho da roupa: ");
        roup.setTamanho(tam);
        roup.valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da roupa: "));
        //Cálculo somando 10%
        roup.CalcularValor(roup.valor);
        
        //Saídas
        JOptionPane.showMessageDialog(null, "Descrição: " + roup.descricao +
                "\nSexo: " + roup.getSexo() + 
                "\nTamanho: " + roup.getTamanho() + 
                "\nValor: R$ " + roup.valor +
                "\nValor total a pagar: R$ " + roup.CalcularValor(roup.valor)
        );
        
    }
    
}
