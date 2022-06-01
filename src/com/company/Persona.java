package com.company;
import java.util.Date;

public class Persona {
    private String name;
    private String lastName;
    private Date nacimiento;
    private Date consulta;

    public Persona(String name, String lastName, Date nacimiento, Date consulta) {
        this.name = name;
        this.lastName = lastName;
        this.nacimiento = nacimiento;
        this.consulta = consulta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Date getConsulta() {
        return consulta;
    }

    public void setConsulta(Date consulta) {
        this.consulta = consulta;
    }
}
