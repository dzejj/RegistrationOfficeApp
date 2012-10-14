package registerOffice.management;

import java.util.List;

import registerOffice.businessObjects.persons.Person;

public interface ManagerInterface<TEntity> {
	
	public TEntity get(/**/);
	public List<TEntity> getAll();
	public void save(TEntity obj);
    public void delete(TEntity obj);
	
	/**
	 * inne metody
	 */

}
