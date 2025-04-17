import javax.swing.JOptionPane;
public class Lt01_ex31 {
    public static void main (String args[])
    {
        int R, X;
        X = 10;
        while (X <= 20){
            R = (int) Math.pow(X, 2);
            JOptionPane.showMessageDialog(null,
                    "QUADRADO DO NÚMERO "+ X +" = "+R);
            X = (X +1 );
        }   
    }   
}
