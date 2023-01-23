package com.example.MongoDbConnect.Repository;

import com.example.MongoDbConnect.Pojo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,String> {

}
