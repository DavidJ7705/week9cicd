package ie.atu.week11example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final PersonRepository personRepository;

    @Autowired
    public DataLoader(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        Person testData1 = new Person(1L,"Paul",24, "Paul@atu.ie", "Mr", "12345", "Lecturer","Electronics");
        Person testData2 = new Person(2L,"Paul",54, "Paul@atu.ie", "Mr", "12345", "Lecturer","Electronics");
        Person testData3 = new Person(3L, "Paul",24, "Paul@atu.ie", "Mr", "12345", "Lecturer","Electronics");

        personRepository.save(testData1);
        personRepository.save(testData2);
        personRepository.save(testData3);

    }

}
