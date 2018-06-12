package pl.wzieleziecki.erasmusappbackend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import pl.wzieleziecki.erasmusappbackend.domain.StudentForm;

public interface StudentsFormRepository extends MongoRepository<StudentForm, String> {
}
