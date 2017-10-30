package com.kodilla;

import java.util.Collections;
import java.util.Random;

public class Text {

    String a;
    String text;


    public Text (String a)
    {
        this.a = a;
    }

    public String getA()
    {
        Random randomGenerator = new Random();
        int n = randomGenerator.nextInt(51);

        text = String.join("", Collections.nCopies(n, a));
        System.out.println(text);

        return text;
    }
}
