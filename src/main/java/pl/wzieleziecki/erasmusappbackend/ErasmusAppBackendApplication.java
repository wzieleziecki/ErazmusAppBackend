package pl.wzieleziecki.erasmusappbackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.wzieleziecki.erasmusappbackend.domain.StudentForm;
import pl.wzieleziecki.erasmusappbackend.repository.StudentsFormRepository;

@EnableAutoConfiguration
@SpringBootApplication
public class ErasmusAppBackendApplication implements CommandLineRunner{

	@Autowired
	private StudentsFormRepository studentsFormRepository;

	public static void main(String[] args) {
		SpringApplication.run(ErasmusAppBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		StudentForm studentForm = new StudentForm();
		studentForm.setPayload("testttkok");

		studentsFormRepository.save(studentForm);

	}
}
