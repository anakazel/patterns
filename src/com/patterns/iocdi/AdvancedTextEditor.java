package com.patterns.iocdi;

/**
 * Created by alexg on 11.06.2015.
 */
public class AdvancedTextEditor {

    private ISpellChecker spellChecker;

    public AdvancedTextEditor (ISpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
}
