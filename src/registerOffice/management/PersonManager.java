package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.persons.Person;

public class PersonManager implements ManagerInterface<Person>{

private List<Person> persons=DatabaseContext.getPersons();

@Override
public Person get() {

int index = (int)(Math.random()*(persons.size() + 1));
return persons.get(index);
}

@Override
public List<Person> getAll() {


return persons;
}

 
public boolean contain(Person person){

if(persons.contains(person))
return true;
else
return false;
}

@Override
public void save(Person person) {

persons.add(person);

}

@Override
public void delete(Person person) {
persons.remove(person);

}

}