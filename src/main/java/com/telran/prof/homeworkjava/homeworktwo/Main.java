package com.telran.prof.homeworkjava.homeworktwo;

public class Main {
    public static void main(String[] args) {
        English english = new English();
        english.setName("English alphabet");
        english.printAlphabet();

        Russian russian =new Russian();
        russian.setName("Russian alphabet");
        russian.printAlphabet();

        German german = new German();
        german.setName("German alphabet");
        german.printAlphabet();


//        c)в классе основной программы добавить метод printAllInfo(), который в качестве параметра должен принимать массив алфавитов и выводить их в консоль
    }
}
