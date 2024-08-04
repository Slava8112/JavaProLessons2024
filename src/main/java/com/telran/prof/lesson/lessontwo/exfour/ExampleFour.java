package com.telran.prof.lesson.lessontwo.exfour;

public class ExampleFour {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setName("Ericsson");

        Phone phoneOne = new Phone();
        phoneOne.setName("Samsung");

        RadioPhone radioPhone = new RadioPhone();
        radioPhone.setName("Panasonic");

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.setName("Nokia");
        smartPhone.setMemorySize(128);
        smartPhone.setLcd("lcd");
        smartPhone.showInfo();

//        phone.call();
//        radioPhone.call();
//        smartPhone.call();

        Phone[] phones = {phone, phoneOne, smartPhone, radioPhone};
        for (Phone element : phones) {
            element.call();
        }

        makeCall(phone);
        makeCall(phoneOne);
        makeCall(smartPhone);
        makeCall(radioPhone);
    }

    private static void makeCall(Phone phone) {
        phone.call();
    }
}
