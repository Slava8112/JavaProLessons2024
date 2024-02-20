package com.telran.prof.homeworkTwo;

import java.util.Arrays;

public class Russian extends Alphabet{
    String[] russianAlphabet = new String[]{"А","Б","В","Н","Г","Д","Е","Ж","З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф","Х","Ц","Ч","Ш","Щ","Ъ","Ы","Э","Ю","Я"};

    @Override
    public void printAlphabet(){
        super.printAlphabet();
        System.out.println(Arrays.toString(russianAlphabet));
    }
}
