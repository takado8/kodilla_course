package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String txt, PoemDecorator decorator){
        System.out.println("Decorated txt: " + decorator.decorate(txt));
    }
}
