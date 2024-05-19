package com.telran.prof.lesson.lessonten.selfWork;

public class Contact {
    private String street;

    private int home;

    public Contact(String street, int home) {
        this.street = street;
        this.home = home;
    }
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Contact)) return false;
        Contact contact = (Contact) obj;

        return this.street.equals(contact.street) && this.home == contact.home;
    }
}
