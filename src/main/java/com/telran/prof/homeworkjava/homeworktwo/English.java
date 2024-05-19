package com.telran.prof.homeworkjava.homeworktwo;

import java.util.Arrays;

public class English extends Alphabet{
    String[] englishAlphabet = new String []{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    @Override
    public void printAlphabet(){
        super.printAlphabet();
        System.out.println(Arrays.toString(englishAlphabet));
    }
}
