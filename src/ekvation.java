
// 2019-10-24 Alexander Jonsson Näslund TE18
import javax.swing.*;

public class ekvation {
    public static void main(String[]args) {

        double exponent = Double.parseDouble (JOptionPane.showInputDialog(null, "Ange funktionens grad/Högsta exponenten" ));
                if (exponent == 1 ) {
                    double a1= Double.parseDouble (JOptionPane.showInputDialog(null, "Ange a i funktionen ax + b= 0" ));
                    double b1= Double.parseDouble (JOptionPane.showInputDialog(null, "Ange b i funktionen ax + b= 0" ));
                    double x1 = (-b1/a1);
                    JOptionPane.showMessageDialog(null, "x för ekvation =" +x1);
                if (exponent == 2) {
                        double a2= Double.parseDouble (JOptionPane.showInputDialog(null, "Ange a i funktionen ax + b= 0" ));
                        double b2= Double.parseDouble (JOptionPane.showInputDialog(null, "Ange a i funktionen ax + b= 0" ));
                        double c1= Double.parseDouble (JOptionPane.showInputDialog(null, "Ange a i funktionen ax + b= 0" ));
                        double x2  = (-(b2/2a2) + (((b2/2a2^2-c1/a2))^0.5));
                    JOptionPane.showMessageDialog(null, +x2);
                    }
                }

    }

}
