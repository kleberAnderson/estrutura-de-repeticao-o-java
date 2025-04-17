import javax.swing.JOptionPane;
public class Lt01_ex34 {
    public static void main (String args[])
    {
        int Num, R, I;
        Num = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE UM NÚMERO"));
        for (I = 0; I <= 10; I++){
            R = (I * Num);
            JOptionPane.showMessageDialog(null,
                    "TABUADA DO ("+ Num +") : "+ Num +" * "+ I +" = "+ R);
        }
    }   
}
