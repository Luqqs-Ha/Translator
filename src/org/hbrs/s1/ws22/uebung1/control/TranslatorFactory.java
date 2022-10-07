package org.hbrs.s1.ws22.uebung1.control;

/**
 * Anwendung des Factory Method Design Pattern (Kapitel 6; [GoF])
 * Problem  : Inkonsistente Erzeugung von Objekten und daraus folgend inkonsistente Parametrisierung von Objekten
 * Lösung   : Bereitstellung einer klasse zu konsistenten und zentralen erstellung von Objekten
 */
public class TranslatorFactory {

    public static GermanTranslator createGermanTranslator(){
        //Datum konsistent einsetzten, in GermanTranslator
        return new GermanTranslator();
    }

}
