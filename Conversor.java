import javax.swing.*;

public class Conversor{
	public static void main (String[] args) {

	    Operaciones operation = new Operaciones();

        while(true) {

    	    String menu = (JOptionPane.showInputDialog(null, "Elija el tipo de conversión: ", "Menú Principal", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura"}, "Escribir")).toString();

    	    if (menu == "Conversor de Moneda") {
            String input = JOptionPane.showInputDialog("Ingrese un valor: ");

                if(operation.check(input) == true) {
                    double Minput = Double.parseDouble(input);
                    operation.converterMoney(Minput);

                    int confirmacion = 0;
                    confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                    if((confirmacion == 0) && (operation.check(input) == true)) { 
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado.");
                        break;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "¡Error! Solo valores numéricos.");                
                }
            } else if (menu == "Conversor de Temperatura") {
    	    String input = JOptionPane.showInputDialog("Ingrese la temperatura que desea convertir: ");
                
                if(operation.check(input) == true) {
                    double Minput = Double.parseDouble(input);
                    operation.converterTemperature(Minput);

                    int confirmacion = 0;
                    confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?");
                    if((confirmacion == 0) && (operation.check(input) == true)) { 
                    } else {
                        JOptionPane.showMessageDialog(null, "Programa finalizado.");
                        break;
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "¡Error! Solo valores numéricos.");                
                }
    	    }
        }
    }
}