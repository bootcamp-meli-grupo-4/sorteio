package com.sorteio.sorteio.database;

import com.sorteio.sorteio.entity.Student;
import com.sorteio.sorteio.repository.StudentRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LoaderStudent implements ApplicationRunner {
    private StudentRepository studentRepository;

    public LoaderStudent(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    private void createStudents(){
        for (int i = 1; i < 31; i++){
            Student student = new Student();
            student.setName("Student " + i);
            studentRepository.save(student);
        }

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        this.createStudents();
    }
}
