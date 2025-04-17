import javax.swing.JOptionPane;
public class Lt01_ex37 {
    public static void main (String args[])
    {
     int A, B, R, Num;
     A = 0;
     B = 0;
     R = 0;
     Num = Integer.parseInt(JOptionPane.showInputDialog
     ("DIGITE UM VALOR"));
     while (R < Num){
         if (B >= 1){
             R = (A + B);
             A = B;
             B = R;
             JOptionPane.showMessageDialog(null,
                     "SERIE FIBONACCI "+ R);
         }
         else{
             B = (B + 1);
             JOptionPane.showMessageDialog(null,
                     "SERIE FIBONACCI "+ B);
         }
     }       
    }    
}
