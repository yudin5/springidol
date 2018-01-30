package springidol;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class PersonJdbcTemplate implements PersonDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void createPerson(Person person) {
        String SQL = "insert into persons (name, surname, age) values (?,?,?)";
        String name = person.getName();
        String surname = person.getSurname();
        int age = person.getAge();

        jdbcTemplateObject.update(SQL, name, surname, age);
        System.out.println(
                "Created Record Name = " + name + "; Surname = " + surname + "; Age = " + age);
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public Person getPerson(Integer id) {
        String SQL = "select * from persons where id = ?";
        Person person = jdbcTemplateObject.queryForObject(
                SQL, new Object[]{id}, new PersonMapper());

        return person;
    }

    public List<Person> getAllPersons() {
        String SQL = "select * from persons";
        List <Person> persons = jdbcTemplateObject.query(SQL, new PersonMapper());
        return persons;
    }

    public void delete(Integer id) {
        String SQL = "delete from persons where id = ?";
        jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id );
        return;
    }

    public void update(Integer id, Integer age){
        String SQL = "update persons set age = ? where id = ?";
        jdbcTemplateObject.update(SQL, age, id);
        System.out.println("Updated Record with ID = " + id );
        return;
    }
}