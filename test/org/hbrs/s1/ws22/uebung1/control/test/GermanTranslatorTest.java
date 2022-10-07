package org.hbrs.s1.ws22.uebung1.control.test;

import org.hbrs.s1.ws22.uebung1.control.GermanTranslator;
import org.hbrs.s1.ws22.uebung1.control.Translator;
import org.hbrs.s1.ws22.uebung1.control.TranslatorFactory;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @org.junit.jupiter.api.Test
    void translateNumberWithALegitNumber() {
        GermanTranslator translator = TranslatorFactory.createGermanTranslator();
        assertEquals("fuenf",translator.translateNumber(5));
    }

    @org.junit.jupiter.api.Test
    void translateNumberWithANumberToBig() {
        GermanTranslator translator = TranslatorFactory.createGermanTranslator();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {translator.translateNumber(12);});
    }

    @org.junit.jupiter.api.Test
    void translateNumberWithZero() {
        GermanTranslator translator = TranslatorFactory.createGermanTranslator();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {translator.translateNumber(0);});
    }

    @org.junit.jupiter.api.Test
    void translateNumberWithANumberToSmall() {
        GermanTranslator translator = TranslatorFactory.createGermanTranslator();
        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> {translator.translateNumber(-2);});
    }
}