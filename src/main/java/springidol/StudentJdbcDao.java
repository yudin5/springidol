package springidol;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentJdbcDao implements StudentDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void saveStudent(Student student) {
        jdbcTemplate.update(
                "INSERT INTO persons (name) VALUES (?)", new Object[] {student.getName()});
    }
}
