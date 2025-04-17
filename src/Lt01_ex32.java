import javax.swing.JOptionPane;
public class Lt01_ex32 {
    public static void main (String args[])
    {
     int Num, i, R;
     Num = Integer.parseInt(JOptionPane.showInputDialog
     ("DIGITE UM VALOR"));
     R = 1;
     for (i = Num; i >= 2; i --){
         R = (R * i);   
     }
     JOptionPane.showMessageDialog(null,
             "FATORIAL DE "+ Num +" É "+R);
    }
}
