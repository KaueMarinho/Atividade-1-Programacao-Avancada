package atividade1;
import javax.swing.JOptionPane;

public class AtividadeMain {

    public static void main(String[] args) {
        String totalConta = JOptionPane.showInputDialog("Digite o total da conta de agua em reais");
        double totalContaDouble = Double.parseDouble(totalConta);
        String totalMetrosCubicos = JOptionPane.showInputDialog("Digite o total da metros cubicos");
        double totalMetrosCubicosDouble = Double.parseDouble(totalMetrosCubicos);
        String qtdApt = JOptionPane.showInputDialog("Digite a quantidade de apartamentos");
        int qtdAptInt = Integer.parseInt(qtdApt);
        
        // Inicialize o acumulador fora do loop
        double acumulador = 0;
        
        // Fazer leitura individual
        
        for (int i = 0; i < qtdAptInt; i++) {
            String consumoApt = JOptionPane.showInputDialog("Consumo m³ Ap." + (i+1));
            double consumoAptDouble = Double.parseDouble(consumoApt);
            double valorParcial = consumoAptDouble * totalContaDouble / totalMetrosCubicosDouble;
            
            // Adicione o valor parcial ao acumulador
            acumulador += valorParcial;
            
            // Verifique se o acumulador ultrapassa o total
            if (acumulador > totalContaDouble) {
                JOptionPane.showMessageDialog(null, "O consumo parcial excedeu o total!!!!");
                break; // Saia do loop se o limite for ultrapassado
            }
            
            JOptionPane.showMessageDialog(null, "O apartamento " + (i+1) + " deverá pagar " + valorParcial);
        }
    }
}
