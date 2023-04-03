import model.Person;
import service.PersonService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService(List.of(
                Person.builder()
                        .firstName("Mihai")
                        .lastName("Eminescu")
                        .age(44)
                        .city("Oradea")
                        .build(),
                Person.builder()
                        .firstName("Liviu")
                        .lastName("Rebreanu")
                        .age(33)
                        .city("Cluj")
                        .build(),
                Person.builder()
                        .firstName("Copil")
                        .lastName("mic")
                        .age(12)
                        .city("Cluj")
                        .build(),
                Person.builder()
                        .firstName("Ion")
                        .lastName("Creanga")
                        .age(58)
                        .city("Iasi")
                        .build()
        ));


        System.out.println(personService.getShortNames());
        System.out.println(personService.checkIfStartsWithSomeLeader());
        System.out.println(personService.getAdults());
    }
}
