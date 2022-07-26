package modelo;

public class Esfera extends Figura
{

    public Esfera(double radio)
    {
        super(0, 0, radio);
    }

    //Metodos
    public void HallarVolumenEsfera()
    {
        resultado = 4/3*Math.PI*radio*radio*radio;
    }
}
