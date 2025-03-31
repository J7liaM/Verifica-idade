package JusticaFederal;

import javax.swing.JOptionPane;

public class Eleicao {

    public static void main(String[] args) {
        //Deixar o usuário escolher a quantidade de vezes para repetir
        int limite = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
        for (int i = 1; i <= limite; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
            if (idade >= 18 && idade <= 69) {
                JOptionPane.showMessageDialog(null,"Você é obrigado a votar!");
            } else if (idade >= 16) {
                JOptionPane.showMessageDialog(null,"Você é facultativo para voto!");
            } else {
                JOptionPane.showMessageDialog(null,"Você é proibido para votar!");
            }
        }

    }

}
