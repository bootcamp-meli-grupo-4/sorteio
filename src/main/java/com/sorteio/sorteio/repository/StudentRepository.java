package com.sorteio.sorteio.repository;

import com.sorteio.sorteio.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT FROM Student order by RAND() LIMIT 10", nativeQuery = true)
    List<Student> findRand();
}
