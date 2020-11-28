package Farm;


import Person.Person;

import java.util.ArrayList;
import java.util.List;

public class FarmHouse {
    private List<Person> personList;

    public FarmHouse(Person person1, Person person2) {
        personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
    }

    public boolean addNewFarmer(String name) {
        Person person = new Person(name);
        personList.add(person);
        return true;
    }

    public boolean removeFarmer(String name) {
        for (Person person : personList) {
            if(person.getName().equals(name)) {
                personList.remove(person);
            }
        }
        return true;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
