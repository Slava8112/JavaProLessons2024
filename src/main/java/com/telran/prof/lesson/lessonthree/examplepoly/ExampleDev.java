package com.telran.prof.lesson.lessonthree.examplepoly;

public class ExampleDev {
    public static void main(String[] args) {
        Developer dev = new Developer();
        Developer sDev = new BackEndDeveloper();
        Developer fDev = new FrontendDeveloper();
        Developer dbDev = new DatabaseDeveloper();

//        dev.writeTheCode();
//        sDev.writeTheCode();
//        fDev.writeTheCode();
//        dbDev.writeTheCode();

        askToWriteCode(dev);
        askToWriteCode(sDev);
        askToWriteCode(fDev);
        askToWriteCode(dbDev);
    }
    private static void askToWriteCode(Developer developer){
        developer.writeTheCode();
    }
}
