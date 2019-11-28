package com.sda.kolejka;

public class Element {
    int value;
    Element poprzedni;
    Element następny;


    public Element(int liczba) {
        value = liczba;
        poprzedni = null;
        następny = null;
    }
    public void ustawPoprzedniElement(Element element){
    poprzedni = element;
    }
}
