package persona;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.zip.DataFormatException;

public class PersonaTest extends TestCase {
    Persona persona;
    LocalDate fechaNacimiento;
    LocalDate fechaConsulta;
    DateTimeFormatter sdf = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.ENGLISH);
    @BeforeEach
    public void setUp() throws ParseException {
        fechaNacimiento = LocalDate.parse("06/24/2000", sdf);
        fechaConsulta = LocalDate.parse("06/23/2018", sdf);
        persona = new Persona("Alexander","Morales Panitz", fechaNacimiento, fechaConsulta);
    }

    @Test
    @DisplayName("¿Es mayor de edad?")
    public void testMayorDeEdad() throws ParseException {
        assertFalse("Es menor de edad", persona.esMayorDeEdad());
    }
}