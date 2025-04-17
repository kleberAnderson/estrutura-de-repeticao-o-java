import javax.swing.JOptionPane;
public class Lt01_ex42 {
    public static void main(String args[]){
        
        int Numdor, Dendor, I;
        double Div, Soma;
        
        Soma = 0;
        Dendor = 1;
        
        for(Numdor = 1; Numdor <= 5; Numdor++)
        {
            Div = (double)(Numdor / Dendor);
            JOptionPane.showMessageDialog(null,
                    "SÉRIE... "+ Div);
            Dendor = (Dendor + 2);
            Soma = (double)(Soma + Div);
        }
        JOptionPane.showMessageDialog(null,
                "CÁLCULO DA SOMATÓRIA DA SÉRIE: "+ Soma);
    }  
}
