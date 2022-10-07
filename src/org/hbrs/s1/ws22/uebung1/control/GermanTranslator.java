package org.hbrs.s1.ws22.uebung1.control;

public class GermanTranslator implements Translator {

	public String date = "Okt/2022"; // Default-Wert

	/**
	 * Methode zur Übersetzung einer Zahl in eine String-Representation
	 */
	public String translateNumber( int number ) {
		// [ihr Source Code aus Übung 1-2]
		String[] arr = {"eins","zwei","drei","vier","fuenf","sechs","sieben","acht","neun","zehn"};

		return arr[number - 1];
	}

	/**
	 * Objektmethode der Klasse GermanTranslator zur Ausgabe einer Information.
	 */
	public void printInfo(){
		System.out.println( "GermanTranslator v1.9, erzeugt am " + this.date );
	}

	/**
	 * Setzen des Datums, wann der Übersetzer erzeugt wurde (Format: Monat/Jahr (Beispiel: Okt/2022))
	 * das Datum sollte system-intern durch eine Control-Klasse gesetzt werden und nicht von externen View-Klassen
	 */
	public void setDate( String date ) {
		this.date = date;
	}

}
