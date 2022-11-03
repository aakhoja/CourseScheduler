package Aman.Khoja.CourseScheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;
    private static String INSERT_QUERY =
            """
                    insert into course (id,name,author)
                    values (?,?,?)
                    
                    """;

    private static String DELETE_QUERY =
            """
                    Delete from course where id=?
                    """;

    public void insert(Course course){
        springJdbcTemplate.update(INSERT_QUERY,course.getId(),course.getName(),course.getAuthor());
    }

    public void delete(long id){
        springJdbcTemplate.update(DELETE_QUERY,id);
    }
}
