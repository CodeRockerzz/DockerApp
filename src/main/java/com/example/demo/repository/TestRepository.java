/**
 * 
 */
package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.Student;

/**
 * @author barathkumar.karthike
 *
 */
@Repository
public interface TestRepository extends JpaRepository<Student, Integer> {
}
