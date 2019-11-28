package com.sda.kolejka;

public class KolejkaElement {
    int value;
    KolejkaElement poprzedni;
    KolejkaElement następny;


    public KolejkaElement(int liczba) {
        value = liczba;
    }
}
