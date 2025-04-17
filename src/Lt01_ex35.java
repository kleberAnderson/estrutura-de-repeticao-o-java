import javax.swing.JOptionPane;
public class Lt01_ex35 {
    public static void main (String args[])
    {
     int N1, N2, R, I, N;
     N1 = Integer.parseInt(JOptionPane.showInputDialog
             ("DIGITE O VALOR DE X"));
     N2 = Integer.parseInt(JOptionPane.showInputDialog
     ("DIGITE O VALOR DE Y"));
     R = 0;
     
      while (N1 > N2){
      N = N1;
      N1 = N2;
      N2 = N;
     }
      if(N1 % 2 == 0){
         N1 = (N1 + 1);
         for (I = N1; I < N2; I += 2){
             R = (R + I);  
         }
         JOptionPane.showMessageDialog(null,
                 "SOMATÓRIA DOS NÚMERO IMPARES ENTRE "+ N1 +" E "+ N2 +" = "+ R);
     }
     else{
         for (I = N1; I <= N2; I += 2){
             R = (R + I);             
         }
         JOptionPane.showMessageDialog(null,
                     "SOMATÓRIA DOS NÚMEROS IMPARES ENTRE "+ N1 +" E "+ N2 +" = "+ R);
     }
    }
}
