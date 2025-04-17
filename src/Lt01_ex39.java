import javax.swing.JOptionPane;
public class Lt01_ex39 {
    public static void main (String args[]) {
        int Total, Casa, Qtde;
        Total = 0;
        Qtde = 1;
        for (Casa = 1; Casa <= 4; Casa++)
        {
         Total = (Total + Qtde);
         JOptionPane.showMessageDialog(null,
                "CASA "+ Casa +", Quantidade: "+ Qtde);
         Qtde = (Qtde * 2);
        }
        JOptionPane.showMessageDialog(null,
                "QUANTIDADE DE GRÃOS CONTIDOS EM UM TABULEIRO: "+ Total);  
    }   
}
