package cl.awakelab.sprintgrupal2.model;

public class Usuario {

    private int run;
    private String nombre;
    private String fechaNac;
    private String tipo;

    Usuario (){

    }

    public Usuario(int run, String nombre, String fechaNac, String tipo) {
        super();
        this.run = run;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.tipo = tipo;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getTipo() {return tipo; }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Override
    public String toString() {
        return "Usuario [run=" + run + ", nombre=" + nombre + ", fechaNac=" + fechaNac + "]";
    }




}


