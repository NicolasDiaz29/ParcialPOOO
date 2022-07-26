package modelo;

public class Cilindro extends Figura
{

    public Cilindro(double altura,double radio)
    {
        super(0, altura, radio);
    }
    //Metodos
    public void HallarVolumenCilindro()
    {
        resultado = Math.PI*radio*radio*altura;
    }
}
