package pl.wzieleziecki.erasmusappbackend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
@Data
@AllArgsConstructor
public class StudentForm {

    @Id
    private String id;
    private String payload;

    public StudentForm() {}

}
