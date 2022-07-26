package modelo;

public class Figura 
{
    //Atriibutos
    protected double lado;
    protected double altura;
    protected double radio;
    protected double resultado;
    protected String nombre;

    //Constructor
    public Figura(double lado, double altura, double radio)
    {
        this.lado = lado;
        this.altura = altura;
        this.radio = radio;
        this.resultado = 0;
    }

    public void NombreFigura(String n)
    {
        nombre = n;
    }

    //Metodos
    public double mostrarResultado()
    {
        return this.resultado;
    }

}
