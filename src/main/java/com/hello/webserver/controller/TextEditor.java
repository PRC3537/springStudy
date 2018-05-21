package com.hello.webserver.controller;

import com.hello.webserver.controller.SpellChecker;

public class TextEditor {
    private SpellChecker spellChecker;
//    public TextEditor(SpellChecker spellChecker){
//        System.out.println("Inside TextEditor constructor.");
//        this.spellChecker = spellChecker;
//    }

    //a setter method to inject the dependecy
    public void setSpellChecker(SpellChecker spellChecker) {
        System.out.println("Inside setSpellChecker!");
        this.spellChecker = spellChecker;
    }

    //a getter method to return spellChecker
    public SpellChecker getSpellChecker(){
        return spellChecker;
    }

    public void spellCheck(){
        spellChecker.checkSpelling();
    }


}
