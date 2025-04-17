import javax.swing.JOptionPane;
public class Lt01_ex41 {
    public static void main (String args[]) {
        int Dado1, Dado2,Lado1, Lado2, Soma;
        Dado1 = 6;
        Dado2 = 6;
        
        for (Lado1 = 1; Lado1 <= Dado1; Lado1++)
        {
            for (Lado2 = 1; Lado2 <= Dado2; Lado2++)
            {
                Soma = (Lado1 + Lado2);
                if (Soma == 7)
                {
                    JOptionPane.showMessageDialog(null,
                            "A SOMA DO LADO "+ Lado1 +" E LADO "+ Lado2 +" É IGUAL À 7");
                }
            }
        }
    }    
}
