package se.lexicon.model;

import java.util.UUID;

public class Student {

    private int id;
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public Student(int id, String name) {
        this.id = Integer.parseInt(UUID.randomUUID().toString());
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
