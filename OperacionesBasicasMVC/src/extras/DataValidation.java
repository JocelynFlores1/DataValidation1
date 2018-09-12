package extras;

import javax.swing.JOptionPane;

/**
 *
 * @author Jocelyn
 */
public class DataValidation {
    public int string2Int(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value);
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Error al convertir el valor");
            result = 0;
        }
        return result;
    }
    public float string2Float(String value){
        float result = 0;
        try{
            result = Float.parseFloat(value);
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Error al convertir el valor");
            result = 0;
        }
        return result;
    }
    public double string2Double(String value){
        double result = 0;
        try{
            result = Double.parseDouble(value);
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null,"Error al convertir el valor");
            result = 0;
        }
        return result;
    }
}
