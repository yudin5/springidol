package springidol;

import javax.sql.DataSource;
import java.util.List;

public interface PersonDao {

    void createPerson(Person person);

    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to list down
     * a record from the persons table corresponding
     * to a passed person id.
     */
    public Person getPerson(Integer id);

    /**
     * This is the method to be used to list down
     * all the records from the persons table.
     */
    public List<Person> getAllPersons();

    /**
     * This is the method to be used to delete
     * a record from the persons table corresponding
     * to a passed person id.
     */
    public void delete(Integer id);

    /**
     * This is the method to be used to update
     * a record into the persons table.
     */
    public void update(Integer id, Integer age);
}
