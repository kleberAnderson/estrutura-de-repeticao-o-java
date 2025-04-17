import javax.swing.JOptionPane;
public class Lt01_ex36 {
    public static void main (String args[])
    {
        double Num, R, I, M, D;
        Num = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE UM NÚMERO"));
        R = 1;
        D = 1;
        for (I = 1; I < Num; I++){
            R = (R * I);
            M = (double) (D / R);
            JOptionPane.showMessageDialog(null,
                    "SERIE: "+ M);
            D = (D + (1/R));
        }
        JOptionPane.showMessageDialog(null,
                "RESULTADO DA SOMATÓRIA DA SÉRIE: "+ D);
    }   
}
