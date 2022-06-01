package com.company;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DispositivoRICTest extends TestCase {
    String fechaNacimiento;
    String fechaConsulta;
    DispositivoRIC dispositivoRIC;

    @BeforeEach
    public void setUp()  {
        fechaNacimiento = "24/06/2002";
        fechaConsulta = "30/06/2022";
    }

    @Test
    @DisplayName("¿Es mayor de edad?")
    public void testMayorDeEdad() throws DateException, DateFormatException {
        Assertions.assertTrue(dispositivoRIC.ValidarMayoriaDeEdad(fechaNacimiento, fechaConsulta), "Es mayor de edad");
    }
}