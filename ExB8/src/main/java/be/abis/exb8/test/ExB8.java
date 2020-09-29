package be.abis.exb8.test;

import be.abis.exb8.model.Address;
import be.abis.exb8.model.Company;
import be.abis.exb8.model.Person;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

public class ExB8 {

    public static void main(String[] args) {

        Address a1 = new Address("rue du marais", "10", "1000", "Brussels", "Belgium","BE");
        Address a2 = new Address("rue de Thirimont","4","6500","Beaumont","Belgium","BE");
        Company c1 = new Company("BNPPF", a1);
        Person p1 = new Person(1, "Cecile", "Navez", LocalDate.of(1974, 1, 3), c1);
        Company c2 = new Company("Sobelpac",a2);
        Person p2 = new Person(2, "Phil", "Dupont", LocalDate.of(1970, 2, 16),c2 );
        Person p3 = new Person(3,"Nathan","Dupont",LocalDate.of(2000,5,16));
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        try (BufferedWriter bw = Files.newBufferedWriter(Paths.get("personinfo.txt"))) {
            bw.write(p1.toString() + "\n");
            bw.write(p2.toString() + "\n");
            bw.write(p3.toString() + "\n");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}

