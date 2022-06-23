package herencia;

public class Alumno extends Persona 
{
    private int codigo;
    private double nota;
    public Alumno(String nombre,String apellido,int edad)
    {
       super(nombre,apellido,edad);
    }
    public void setCodigo(int codigo)
    {
        this.codigo=codigo;  
    }
    public int getCodigo()
    {
        return codigo;
    }
    public void setNota(double nota)
    {
        this.nota=nota;  
    }
    public double getNota()
    {
        return nota;
    }

    
    
    
}
