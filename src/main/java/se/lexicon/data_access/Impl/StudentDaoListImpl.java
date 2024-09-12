package se.lexicon.data_access.Impl;

import se.lexicon.data_access.dao.StudentDao;
import se.lexicon.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class StudentDaoListImpl implements StudentDao {

    List<Student> studentsStorage;

    public StudentDaoListImpl() {
        System.out.println("Student list initiated...");
        this.studentsStorage = new ArrayList<>();

    }

    @Override
    public Student save(Student student) {
        studentsStorage.add(student);
        return student;

    }

    @Override
    public Student Find(int id) {
        Optional<Student> studentOptional = studentsStorage.stream()
                .filter(student -> student.getId() == id)
                .findFirst();
        return studentOptional.orElse(null);

    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentsStorage);

    }

    @Override
    public Void delete(int id) {
        Iterator<Student> iterator = studentsStorage.iterator();
        while(iterator.hasNext()) {
            Student removeStudent = iterator.next();
            if(removeStudent.getId() == id) {
                iterator.remove();
                break;
            }
        }

        return null;
    }
}
