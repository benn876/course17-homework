package service;

import model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(List<Person> persons) {
        if (persons != null) {
            this.persons.addAll(persons);
        }
    }

    public List<String> getShortNames() {
        return persons.stream()
                .map(person -> person.firstName() + " " + person.lastName().charAt(0) + ". ")
                .toList();
    }

    public boolean checkIfStartsWithSomeLeader() {
        return persons.stream()
                .map(person -> person.firstName() + " " + person.lastName().charAt(0) + ". ")
                .allMatch(shortName -> shortName.startsWith("M"));
    }

    public List<Person> getAdults() {
        return persons.stream()
                .filter(person -> person.age() > 18)
                .toList();
    }
}
