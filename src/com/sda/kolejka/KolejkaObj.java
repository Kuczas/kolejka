package com.sda.kolejka;

public class KolejkaObj {

    Element pierwszy;
    Element ostatni;

    public KolejkaObj() {
        pierwszy = null;
        ostatni = null;
    }

    public void add(int liczba) {
        Element nowyElement = new Element(liczba);
        Element przedostatni = ostatni;

        if (pierwszy == null)
        pierwszy = ostatni = nowyElement;
        else {
            nowyElement.ustawPoprzedniElement(ostatni);
            ostatni = nowyElement;
        }
    }

    public int pop() {
        return 0;
    }

    public int push() {
        return 0;
    }
    @Override
    public String toString(){
        String opis = null;

        if (pierwszy != null){

            while (){

            }
            return null;
        } else
            return "Kolejka jest pusta";
    }
}
