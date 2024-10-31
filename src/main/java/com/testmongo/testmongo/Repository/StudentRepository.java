package com.testmongo.testmongo.Repository;
import com.testmongo.testmongo.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
