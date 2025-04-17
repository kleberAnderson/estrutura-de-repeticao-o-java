import javax.swing.JOptionPane;
public class Lt01_ex38 {
    public static void main(String args[])
    {
        int I, N, NG, NP;
        I = 1;
        NG = 0;
        NP = 0;
        while (I <= 5){
            N = Integer.parseInt(JOptionPane.showInputDialog
            ("DIGITE O "+ I +"º VALOR"));
            if (I == 1){
                NG = N;
                NP = N;
                I = (I + 1);
            }
            else if (N > NG){
                NG = N;
                I = (I +1);    
            }
            else if (N < NP){
                NP = N;
                I = (I + 1);
            }
            else{
                I = (I +1);
            }
        }
        JOptionPane.showMessageDialog(null,
                "MAIOR NÚMERO: "+ NG +", MENOR NÚMERO: "+ NP);
    }   
}
