package se.lexicon.data_access.Impl;

import se.lexicon.data_access.dao.StudentDao;
import se.lexicon.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoListImpl implements StudentDao {

    private List<Student> students;

    public StudentDaoListImpl() {
        this.students = new ArrayList<>();

    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student Find(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Void delete(int id) {
        return null;
    }
}
