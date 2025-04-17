import javax.swing.JOptionPane;
public class Lt01_ex40 {
    public static void main (String args[]) {
         int L1, L2, I, Contdiv, Resto;
         
         //COLETAR DOIS NÚMEROS
         L1 = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE PRIMEIRO NÚMERO"));
         L2 = Integer.parseInt(JOptionPane.showInputDialog
        ("DIGITE SEGUNDO NÚMERO"));
         
         //ORDENAÇÃO PARA MENOR E MAIOR
         while ((L1 != L2) & (L1 > L2))
         {
             int Save;
             Save = L1;
             L1 = L2;
             L2 = Save;
         }
         // O Nº PRIMO É DIVISÍVEL POR 2 FATORES 1 E POR ELE MESMO
         Contdiv = 0; //CONTADOR DE DIVISIBILIDADE
         while (L1 <= L2)// VERIFICAÇÃO DO MENOR ATÉ O MAIOR
         {
             for (I = 1; I <= L1; I++)// VERIFICAR A DIVISIBILIDADE DE I OU I++ ATÉ L1
             {
                 Resto = (L1 % I);// RESTO DA DIVISÃO
                 if (Resto == 0)
                 {
                     Contdiv = (Contdiv + 1); //CONTAR
                 }
             }
             if (Contdiv == 2) //VERIFICAR SE ATENDE SER Nº PRIMO
             {
              JOptionPane.showMessageDialog(null,
                "NÚMEROS PRIMOS DE EXISTENTES: "+ L1);// SAÍDA DE Nº PRIMOS
              Contdiv = 0; // REINICIAR CONTADOR DE DIV
              L1 = (L1 + 1); // INCREMENTO ATÉ O MAIOR NÚMERO
             }
             else
             {
                 L1 = (L1 + 1);
                 Contdiv = 0;
             }
         }     
    }
}
