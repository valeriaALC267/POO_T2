
package examen_t2_poo;

import java.time.LocalDate;

public abstract class Docente 
{
    protected String nombre;
    protected String apellido_p;
    protected String apellido_m;
    protected String tipo_doc;
    protected String nro_doc;
    protected String direccion;
    protected int telefono;
    protected LocalDate fecha_ingreso;

    public Docente() {
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        if(nombre == null || nombre.trim().isEmpty())
        {
            throw new IllegalArgumentException("Error: Debe llenar este campo primero. Intente nuevamente:");
        }
        this.nombre = nombre;
    }

    public String getApellido_p() {
        return apellido_p;
    }

    public void setApellido_p(String apellido_p)
    {
         if(apellido_p == null || apellido_p.trim().isEmpty())
        {
            throw new IllegalArgumentException("Error: Debe llenar este campo primero. Intente nuevamente:");
        }
        this.apellido_p = apellido_p;
    }

    public String getApellido_m() {
        return apellido_m;
    }

    public void setApellido_m(String apellido_m) 
    {
         if(apellido_m == null || apellido_m.trim().isEmpty())
        {
            throw new IllegalArgumentException("Error: Debe llenar este campo primero. Intente nuevamente:");
        }
        this.apellido_m = apellido_m;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) 
    {
         if(tipo_doc == null || tipo_doc.trim().isEmpty())
        {
            throw new IllegalArgumentException("Error: Debe llenar este campo primero. Intente nuevamente:");
        }
        if(!tipo_doc.equalsIgnoreCase("dni") && !tipo_doc.equalsIgnoreCase("ce"))
        {
             throw new IllegalArgumentException("Error: No se acepta este tipo de documento. Debe ser DNI o CE. Intente nuevamente:");
        }
        this.tipo_doc = tipo_doc;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) 
    {
         if(nro_doc == null || nro_doc.trim().isEmpty())
        {
            throw new IllegalArgumentException("Error: Debe llenar este campo primero. Intente nuevamente:");
        }
         if(this.tipo_doc == null)
        {
            throw new IllegalStateException("Error: Primero debe asignar el tipo de documento. Intente nuevamente:");
        }
        if(this.tipo_doc.equalsIgnoreCase("dni") && nro_doc.length()!= 8)
        {
            throw new IllegalArgumentException("Error: El DNI debe tener obligatoriamente 8 digitos. Intente nuevamente:");
        }
        if(this.tipo_doc.equalsIgnoreCase("ce") && nro_doc.length()!= 9)
        {
            throw new IllegalArgumentException("Error: El CE debe tener obligatoriamente 9 digitos. Intente nuevamente:");
        }
        this.nro_doc = nro_doc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
         if(direccion == null || direccion.trim().isEmpty())
        {
            throw new IllegalArgumentException("Error: Debe llenar este campo primero. Intente nuevamente:");
        }
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono)
    {
         if(telefono == 0)
        {
            throw new IllegalArgumentException("Error: Debe llenar este campo primero. Intente nuevamente:");
        }
        if(String.valueOf(telefono).length()!=9)
        {
            throw new IllegalArgumentException("Error: El numero de telefono debe tener obligatoriamente 9 digitos. Intente nuevamente:");
        }
        this.telefono = telefono;
    }

    public LocalDate getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(LocalDate fecha_ingreso) 
    {
         if(fecha_ingreso == null)
        {
            throw new IllegalArgumentException("Error: Debe llenar este campo primero. Intente nuevamente:");
        }
        this.fecha_ingreso = fecha_ingreso;
    }
    public abstract String MostrarDatosDocente();
    public abstract String MostrarSuedoNeto();
}