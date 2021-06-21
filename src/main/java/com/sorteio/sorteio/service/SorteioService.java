package com.sorteio.sorteio.service;

import com.sorteio.sorteio.entity.Student;
import com.sorteio.sorteio.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SorteioService {
    private StudentRepository studentRepository;

    public SorteioService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> doSorteio(){
        return this.studentRepository.findRand();
    }
}
