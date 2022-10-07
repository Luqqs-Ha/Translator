package org.hbrs.s1.ws22.uebung1.control;

/**
 * Das Translator Interface. Die Anzahl der Methoden ist fix
 * und darf NICHT erweitert werden. Sichtbarkeiten der Methoden können
 * unter Umstanden angepasst werden.
 *
 * @author saschaalda
 *
 */

public interface Translator {
	
	double version = 1.0; // Version des Interface
	
	/*
	 * Übersetzt eine numerische Zahl in eine String-basierte
	 * Representation gemäss der Spezifikation in der Aufgabe 1-2
	 */
	public String translateNumber(int number);

} 








