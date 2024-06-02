package com.example.oop_lr9;

public class User {
    private String id;
    private String user_firstname;
    private String user_lastname;
    private String group;
    private String age;
    private String subject;

    // Конструктор без параметров
    public User() {
    }

    // Конструктор со всеми параметрами
    public User(String id, String user_firstname, String user_lastname, String group, String age, String subject) {
        this.id = id;
        this.user_firstname = user_firstname;
        this.user_lastname = user_lastname;
        this.group = group;
        this.age = age;
        this.subject = subject;
    }

    // Геттеры и сеттеры
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return user_firstname;
    }

    public void setUserName(String user_firstname) {
        this.user_firstname = user_firstname;
    }

    public String user_lastname() {
        return user_lastname;
    }

    public void setuser_lastname(String user_lastname) {
        this.user_lastname = user_lastname;
    }

    public String getgroup() {
        return group;
    }

    public void setgroup(String group) {
        this.group = group;
    }

    public String getage() {
        return age;
    }

    public void setage(String age) {
        this.age = age;
    }

    public String getsubject() {
        return subject;
    }

    public void setsubject(String subjectk) {
        this.subject = subject;
    }

    // Переопределение метода toString()
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", user_firstname='" + user_firstname + '\'' +
                ", user_lastname='" + user_lastname + '\'' +
                ", group='" + group + '\'' +
                ", age='" + age + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
