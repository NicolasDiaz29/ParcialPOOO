package modelo;

public class Cono extends Figura
{

    public Cono(double altura,double radio)
    {
        super(0, altura, radio);
    }

    //Metodos
    public void HallarVolumenCono()
    {
        resultado = Math.PI*radio*radio*altura/3;
    }
}
