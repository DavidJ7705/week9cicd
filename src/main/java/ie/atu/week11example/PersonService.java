package ie.atu.week11example;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public PersonService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    private ProductRepository productRepository;
    // Placeholder method to save a person (add to Db in the next two weeks)
    public void savePerson(Person person) {
        productRepository.save(person);
        System.out.println("Person saved: " + person);
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        return new Person();
    }
}
