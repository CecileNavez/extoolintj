package be.abis.exb9.test;

import static org.junit.Assert.*;
import java.time.LocalDate;
import org.junit.Test;

import be.abis.exb9.model.Person;

public class TestPerson {

    @Test
    public void testPerson() {

        Person p1 = new Person(1, "Cecile", "Navez", LocalDate.of(2000, 5, 16));

        int personAge = p1.calculateAge();

        assertEquals(20, personAge);

    }

}
