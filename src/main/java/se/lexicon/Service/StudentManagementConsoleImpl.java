package se.lexicon.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import se.lexicon.data_access.dao.StudentDao;
import se.lexicon.model.Student;
import se.lexicon.util.userInputServiceDao;

import java.util.List;
@Component
public class StudentManagementConsoleImpl implements StudentManagementDao {

    private userInputServiceDao ScannerService;
    private StudentDao studentDao;

   @Autowired
    public StudentManagementConsoleImpl(userInputServiceDao scannerService, StudentDao studentDao) {
        ScannerService = scannerService;
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        return null;
    }

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public Student remove(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public Student edit(Student student) {
        return null;
    }
}
