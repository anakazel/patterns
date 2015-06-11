package com.patterns.iocdi;

/**
 * Created by alexg on 11.06.2015.
 */
public class SimpleTextEditor {

    private SpellChecker checker;

    public SimpleTextEditor() {
        checker = new SpellChecker();
    }
}
