package se.lexicon.Service;

import se.lexicon.model.Student;

import java.util.List;

public interface StudentManagementDao {

    Student create();
    Student save(Student student);
    Student find(int id);
    Student remove(int id);
    List<Student>findAll();
    Student edit(Student student);
}
