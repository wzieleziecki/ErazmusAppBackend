package pl.wzieleziecki.erasmusappbackend.controller;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.wzieleziecki.erasmusappbackend.domain.StudentForm;
import pl.wzieleziecki.erasmusappbackend.repository.StudentsFormRepository;

import java.util.Map;

@RestController
@RequestMapping("/api/students")
public class FormController {

    @Autowired
    private StudentsFormRepository studentsFormRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> add(@RequestBody Map<String, Object> payload){

        DBObject dbObject = new BasicDBObject(payload);
        mongoTemplate.insert(dbObject, "studentForm");

        return new ResponseEntity<>(null, HttpStatus.CREATED);

    }


}
