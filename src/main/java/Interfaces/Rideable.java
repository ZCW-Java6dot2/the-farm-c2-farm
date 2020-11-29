package Interfaces;

import Person.Person;

public interface Rideable<T extends Person> {

     <T extends Person> Boolean mount(T p);
     <T extends Person> Boolean dismount();

}
