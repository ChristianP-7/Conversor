import javax.swing.*;

public class Operaciones{

    public void converterMoney(double Minput) {

    	String options = (JOptionPane.showInputDialog(null, "Elija la conversión: ", "Conversor de Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] 
                            {"Soles a Dólares", "Soles a Euros", "Soles a Libras", "Soles a Yenes", "Soles a Wones surcoreanos", "Dólares a Soles", "Euros a Soles", "Libras a Soles", "Yenes a Soles", "Wones Surcoreanos a Soles"}, "Escribir")).toString();
        
        if(options == "Soles a Dólares") {
        	double monedaDolar = Minput / 3.73;
    		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
            JOptionPane.showMessageDialog(null, "Usted tiene: $" + monedaDolar + " Dólares");
        } else if (options == "Soles a Euros") {
            double monedaEuro = Minput / 3.97;
            monedaEuro = (double) Math.round(monedaEuro *100d)/100;
            JOptionPane.showMessageDialog(null, "Usted tiene: €" + monedaEuro + " Euros");
        } else if (options == "Soles a Libras"){
            double monedaLibra = Minput / 4.64;
            monedaLibra = (double) Math.round(monedaLibra *100d)/100;
            JOptionPane.showMessageDialog(null, "Usted tiene: £" + monedaLibra + " Libras Esterlinas");
        }  else if (options == "Soles a Yenes"){
            double monedaYen = Minput / 0.025;
            monedaYen = (double) Math.round(monedaYen *100d)/100;
            JOptionPane.showMessageDialog(null, "Usted tiene: ¥" + monedaYen + " Yenes");
        } else if (options == "Soles a Wones surcoreanos"){
            double monedaWon = Minput / 0.0028;
            monedaWon = (double) Math.round(monedaWon *100d)/100;
            JOptionPane.showMessageDialog(null, "Usted tiene: ₩" + monedaWon + " Wones Surcoreanos");
        } 
        else if(options == "Dólares a Soles") {
        	double monedaDolar = Minput * 3.73;
    		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
            JOptionPane.showMessageDialog(null, "Usted tiene: S/" + monedaDolar + " Soles");
        } else if (options == "Euros a Soles") {
            double monedaEuro = Minput * 3.97;
            monedaEuro = (double) Math.round(monedaEuro *100d)/100;
            JOptionPane.showMessageDialog(null, "Usted tiene: S/" + monedaEuro + " Soles");
        } else if (options == "Libras a Soles"){
            double monedaLibra = Minput * 4.64;
            monedaLibra = (double) Math.round(monedaLibra *100d)/100;
            JOptionPane.showMessageDialog(null, "Usted tiene: S/" + monedaLibra + " Soles");
        }  else if (options == "Yenes a Soles"){
            double monedaYen = Minput * 0.025;
            monedaYen = (double) Math.round(monedaYen *100d)/100;
            JOptionPane.showMessageDialog(null, "Usted tiene: S/" + monedaYen + " Soles");
        } else if (options == "Wones Surcoreanos a Soles"){
            double monedaWon = Minput * 0.0028;
            monedaWon = (double) Math.round(monedaWon *100d)/100;
            JOptionPane.showMessageDialog(null, "Usted tiene: S/" + monedaWon + " Soles");
        }      
    }

    public void converterTemperature(double Minput) {
    	String options = (JOptionPane.showInputDialog(null, "Elija la conversión", "Conversor de Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius", "Grados Farenheit a Kelvin", "Kelvin a Grados Celcius", "Kelvin a Grados Farenheit"}, "Escribir")).toString();
        if(options == "Grados Celcius a Grados Farenheit") {
        	double farenheit = Minput * 1.8 + 32;
        	farenheit = (double) Math.round(farenheit *100d)/100;
            JOptionPane.showMessageDialog(null,"°" + Minput + " Grados Celcius son: °" + farenheit + " Grados Farenheit");
        } else if (options == "Grados Celcius a Kelvin") {
            double Kelvin = Minput + 273.15;
            Kelvin = (double) Math.round(Kelvin *100d)/100;
            JOptionPane.showMessageDialog(null,"°" + Minput + " Grados Celcius son:" + Kelvin + " Kelvin");
        } else if (options == "Grados Farenheit a Grados Celcius"){
            double celcius = ((Minput - 32) * 5) / 9;
            celcius = (double) Math.round(celcius *100d)/100;
            JOptionPane.showMessageDialog(null,"°" + Minput + " Grados Farenheit son: °" + celcius + " Grados Celcius");
        } else if (options == "Grados Farenheit a Kelvin"){
            double Kelvin = ((Minput + 459.67) * 5) / 9;
            Kelvin = (double) Math.round(Kelvin *100d)/100;
            JOptionPane.showMessageDialog(null,"°" + Minput + " Grados Farenheit son:" + Kelvin + " Kelvin");
        }  else if (options == "Kelvin a Grados Celcius"){
            double celcius = Minput - 273.15;
            celcius = (double) Math.round(celcius *100d)/100;
            JOptionPane.showMessageDialog(null,Minput + " Kelvin son: °" + celcius + " Grados Celcius");
        } else if (options == "Kelvin a Grados Farenheit"){
            double farenheit = (Minput - 273.15) * 1.8 + 32;
            farenheit = (double) Math.round(farenheit *100d)/100;
            JOptionPane.showMessageDialog(null,Minput + " Kelvin son: °" + farenheit + " Grados Farenheit");
        }      
    }

    public boolean check(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
    
}






