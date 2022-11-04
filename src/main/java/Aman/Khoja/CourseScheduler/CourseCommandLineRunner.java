package Aman.Khoja.CourseScheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class CourseCommandLineRunner implements CommandLineRunner {

//    private CourseJpaRepository repository;
//
    @Autowired
    private CourseSpringDataJpa repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1,"SpringBoot","Aman Khoja"));
        repository.save(new Course(2,"ReactJS","Aman Khoja"));
        repository.save(new Course(3,"SwiftUI","Aman Khoja"));

        repository.deleteById(1L);
        System.out.println(repository.findById(3L));
        System.out.println(repository.findById(2L));

    }
}
