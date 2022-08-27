package modelo;

import javax.swing.JOptionPane;;

public class gastoAgua
{
    public static void main(String[] args) 
    {
        int gasto;
        int cuotaFija;
        int cuotaAPagar;
    
        cuotaFija = (10000);
    
        gasto = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el gasto mensual de su vivienda: "));

    
            if (gasto <= 50)
        {
            JOptionPane.showMessageDialog(null, "Su cuota a pagar es " + cuotaFija);
        }

        if (50 < gasto && gasto <= 200)
        {
            cuotaAPagar = (gasto - 50) * 2000;
            JOptionPane.showMessageDialog(null, "su cuota a pagar es " + (cuotaAPagar + cuotaFija));
        }

        if (200 < gasto)
        {
            cuotaAPagar = ((gasto - 50) * 2000) + ((gasto - 200) * 3000);
            JOptionPane.showMessageDialog(null, "su cuota a pagar es " + (cuotaAPagar + cuotaFija));
        }

        System.exit(0);
    }
}

 