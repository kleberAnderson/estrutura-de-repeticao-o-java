import javax.swing.JOptionPane;
public class Lt01_ex33 {
    public static void main(String args[]){
        double Num, X, R, N, M;
        Num = Double.parseDouble(JOptionPane.showInputDialog
        ("DIGITE UM NÚMERO"));
        X = 1;
        R = 0;
        for (N = 1; N <= Num; N++){
            M = (X / N);
            JOptionPane.showMessageDialog(null,
                    "SERIE: " + M);
            R = (R + (X / N));
        }
        JOptionPane.showMessageDialog(null,
                "RESULTADO DA SERIE: "+ R);
    }    
}
