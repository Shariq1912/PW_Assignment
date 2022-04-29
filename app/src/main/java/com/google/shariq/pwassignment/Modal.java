package com.google.shariq.pwassignment;

public class Modal {
    private String Name;
    private String subject;
    private String qualifi;
    private String image;

    // creating constructor for our variables.
    public Modal(String Name, String subject, String qualifi, String image) {
        this.Name = Name;
        this.subject = subject;
        this.qualifi = qualifi;
        this.image = image;
    }

    // creating getter and setter methods.
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSubject() {
        return subject;
    }

    public void setsubject(String subject) {
        this.subject = subject;
    }

    public String getqualifi() {
        return qualifi;
    }

    public void setqualifi(String qualifi) {
        this.qualifi = qualifi;
    }

    public String getimage() {
        return image;
    }

    public void setimage(String image) {
        this.image = image;
    }
}



