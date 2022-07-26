package modelo;

public class Cubo extends Figura
{

    public Cubo(double lado)
    {
        super(lado, 0, 0);
    }

    //Metodos
    public void HallarVolumenCubo()
    {
        resultado = lado*lado*lado;
    }
}

