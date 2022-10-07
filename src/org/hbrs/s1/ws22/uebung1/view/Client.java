package org.hbrs.s1.ws22.uebung1.view;

import org.hbrs.s1.ws22.uebung1.control.*;
import org.hbrs.s1.ws22.uebung1.control.TranslatorFactory;

public class Client {

		/*
		 * Methode zur Ausgabe einer Zahl auf der Console (auch bezeichnet als CLI, Terminal)
		 */
		void display( int aNumber ){
			// In dieser Methode soll die Methode translateNumber
			// mit dem über gegebenen Wert der Variable aNumber
			// aufgerufen werden.
			//
			// Strenge Implementierung gegen das Interface Translator gewünscht!
				// GermanTranslator translator = new GermanTranslator(); // funktioniert ist aber nicht das ziel wegen new

			Translator translator = TranslatorFactory.createGermanTranslator();
			String result = translator.translateNumber(aNumber);

			System.out.println("Das Ergebnis der Berechnung: " +
					"[das Ergebnis an dieser Stelle]" + result);

		}
}





