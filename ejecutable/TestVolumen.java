package ejecutable;

import javax.swing.JOptionPane;

import modelo.Cilindro;
import modelo.Cono;
import modelo.Cubo;
import modelo.Esfera;
import modelo.Figura;

public class TestVolumen
{

    //Metodo principal
    public static void main(String[] args) 
    {
        //Entrada, elegir la figura geometrica para calcular el volumen
        String nombre = (JOptionPane.showInputDialog("Cual Figura geometrica desea calcular el volumen: "));

        //Creación de un objeto Cubo
        if(nombre == "Cubo")
        {
            double lado = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del lado: "));
            Cubo miCubo = new Cubo(lado);
            miCubo.HallarVolumenCubo();
            JOptionPane.showMessageDialog(null, "El volumen del " + nombre + " de lado: " + lado + " es: " + miCubo.mostrarResultado());
        }
        
        //Creación de un objeto Cono
        if(nombre == "Cono")
        {
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura: "));
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));
            Cono miCono = new Cono(altura, radio);
            miCono.HallarVolumenCono();
            JOptionPane.showMessageDialog(null, "El volumen del " + nombre + " de altura: " + altura + " y radio: " + radio + " es: " miCono.mostrarResultado());
        }
                
        //Creación de un objeto Cilindro
        if (nombre == "Cilindro")
        {
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de la altura: "));
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));
            Cilindro miCilindro = new Cilindro(altura, radio);
            miCilindro.HallarVolumenCilindro();
            JOptionPane.showMessageDialog(null, "El volumen del " + nombre + " de altura: " + altura + " y radio: " + radio + " es: " miCilindro.mostrarResultado());
        }
        

        //Creación de un objeto Esfera
        if (nombre == "Esfera")
        {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));
            Esfera miEsfera = new Esfera(radio);
            miEsfera.HallarVolumenEsfera();
            JOptionPane.showMessageDialog(null, "El volumen de la " + nombre + " de radio: " + radio + " es: " + miEsfera.mostrarResultado());
        }

        System.exit(0);
    }
}