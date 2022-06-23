package herencia;

public class Main
{
    public static void main(String[] args) 
    {
      Alumno alumno = new Alumno("alejandro", "Perez", 20);
      
        System.out.println("PersonaAlumno:" +alumno.getNombre()+" "+alumno.getApellido());
        System.out.println("Edad:"+alumno.getEdad());
        alumno.setCodigo(202011548);
        System.out.println("Codigo:" +alumno.getCodigo());
        alumno.setNota(13.5);
        System.out.println("Nota:" +alumno.getNota());

      
        
    }
    
}
