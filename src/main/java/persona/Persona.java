package persona;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Persona {
    private String name;
    private String lastName;
    public static final String PATTERN = "MM/dd/yyyy";

    DateTimeFormatter sdf = DateTimeFormatter.ofPattern(PATTERN, Locale.ENGLISH);
    LocalDate consulta;
    LocalDate nacimiento;

    public Persona(String name, String lastName, LocalDate consulta, LocalDate nacimiento) {
        this.name = name;
        this.lastName = lastName;
        this.consulta = consulta;
        this.nacimiento = nacimiento;
    }

    public boolean esMayorDeEdad() {
        Period interval = Period.between(consulta,nacimiento);
        return (interval.getYears() >= 18);
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

    public LocalDate getConsulta() {
        return consulta;
    }

    public void setConsulta(LocalDate consulta) {
        this.consulta = consulta;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
}
