package cl.awakelab.sprintgrupal2.model;

import java.time.DateTimeException;

public class Profesional {

    private String titulo;
    private String fechaIngreso;

    Profesional(){

    }

    public Profesional( String titulo, String fechaIngreso) {

        this.titulo = titulo;
        this.fechaIngreso = fechaIngreso;

    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Profesional{" +
                "titulo='" + titulo + '\'' +
                ", fechaIngreso='" + fechaIngreso + '\'' +
                '}';
    }

}
