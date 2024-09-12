package se.lexicon.data_access.dao;

import se.lexicon.model.Student;

import java.util.List;

public interface StudentDao {

    Student save (Student student);
    static Student Find(int id);
    List<Student>findAll();
    Void delete(int id);
}
