package cl.awakelab.sprintgrupal2.model;

import java.time.DateTimeException;

public class Administrativo {

    private int id;
    private String area;
    private String experiencia;

    Administrativo() {
    }


    public Administrativo(String area, String experiencia) {
        this.area = area;
        this.experiencia = experiencia;
    }
    public Administrativo(int id, String area, String experiencia) {
        this.id = id;
        this.area = area;
        this.experiencia = experiencia;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                ", area='" + area + '\'' +
                ", experiencia=" + experiencia +
                '}';
    }
}