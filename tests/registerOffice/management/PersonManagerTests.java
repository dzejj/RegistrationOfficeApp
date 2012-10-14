package registerOffice.management;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import registerOffice.businessObjects.persons.Person;

public class PersonManagerTests {

	//save_method_should_correctly_add_person_to_database
	@Test
	public void save() {
		
		Person p = new Person("Adam");
		
		List<Person> persons= DatabaseContext.getPersons();
		
		PersonManager mgr=new PersonManager();
		mgr.save(p);
		assertTrue("Size is still zero",persons.size()>0);
		
		assertEquals("Names do not match",p.getName(), persons.get(0).getName());
		//assertNotSame("It shouldn't be the same place in memory",p, persons.get(0));
		
		persons.clear();
	}
	@Test 
	public void delete_method_should_correctly_remove_person(){
		
		Person p = new Person("Adam");
List<Person> persons= DatabaseContext.getPersons();
		
		PersonManager dr  =new PersonManager();
		dr.save(p);
		dr.delete(p);
		
		assertTrue("Person not nremoved", persons.size()==0);
		persons.clear();
		
	
	}
	
	@Test
	
	public void contain_in_list(){
		
		Person p = new Person("Adam");
		List<Person> persons= DatabaseContext.getPersons();
		PersonManager os = new PersonManager();
		os.save(p);
		
		assertTrue("person not contains in list", os.getAll().contains(p));				
				persons.clear();
	}


}
