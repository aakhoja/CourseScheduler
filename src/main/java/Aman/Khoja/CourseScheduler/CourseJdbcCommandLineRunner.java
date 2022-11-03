package Aman.Khoja.CourseScheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"SpringBoot","Aman Khoja"));
        repository.insert(new Course(2,"ReactJS","Aman Khoja"));
        repository.insert(new Course(3,"SwiftUI","Aman Khoja"));

        repository.delete(1);
        System.out.println(repository.findByID(3));
        System.out.println(repository.findByID(2));


    }

}
