package org.example;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Generic<Boolean> boolGeneric = new Generic<>();
        boolGeneric.setContent(false);
        boolGeneric.yazGeneric();

        Generic<Integer> intGeneric = new Generic<>();
        intGeneric.setContent(67);
        intGeneric.yazGeneric();

        Generic<String> strGeneric = new Generic<>();
        strGeneric.setContent("Murat Bilim");
        strGeneric.yazGeneric();

        Generic<Double> doubGeneric = new Generic<>();
        doubGeneric.setContent(67.5);
        doubGeneric.yazGeneric();

        Generic<String> strGeneric1 = new Generic<>();
        strGeneric1.setContent("Test Otomasyon 10.Ödev");
        strGeneric1.yazGeneric();

        strGeneric1.ayrac();

        Koleksiyon koleksiyon = new Koleksiyon();

        List<String> stringList = List.of("Java", "Python", "C++", "JavaScript","HTML","PHP","ASP");

        String bulunan = "Murat";
        String result = koleksiyon.koleksiyonOge(stringList, bulunan);

        if (result != null) {
            System.out.println("Öğe bulundu: " + result);
        } else {
            System.out.println("Öğe bulunamadı: -1");
        }

    }
}