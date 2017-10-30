package com.kodilla;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class EvenTester {

    public void split(ArrayDeque<String> theArray) {


        String temp;
        int countValue = 0;

        ArrayList<String> even = new ArrayList<String>();
        ArrayList<String> odd = new ArrayList<String>();

        while (!theArray.isEmpty()) {
            temp = theArray.poll();
            countValue = temp.length();
            System.out.println("The line size is: " + countValue);
            if (countValue % 2 == 0) {
                even.add(temp);
            } else {
                odd.add(temp);
            }
        }

        for (int n = 0; n < even.size(); n++) {
            System.out.println("Element " + n + " of the Even list is: " + even.get(n));
        }

        for (int n = 0; n < odd.size(); n++) {
            System.out.println("Element " + n + " of the Odd list is: " + odd.get(n));
        }
    }
}
