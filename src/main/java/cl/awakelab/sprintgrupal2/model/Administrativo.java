package cl.awakelab.sprintgrupal2.model;

import java.time.DateTimeException;

public class Administrativo {

    private String area;
    private String experiencia;

    Administrativo() {
    }

    public Administrativo( String area, String experiencia) {
        this.area = area;
        this.experiencia = experiencia;
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