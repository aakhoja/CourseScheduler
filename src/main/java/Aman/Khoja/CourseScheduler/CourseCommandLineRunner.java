package Aman.Khoja.CourseScheduler;

import org.springframework.boot.CommandLineRunner;

public class CourseCommandLineRunner implements CommandLineRunner {

    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"SpringBoot","Aman Khoja"));
        repository.insert(new Course(2,"ReactJS","Aman Khoja"));
        repository.insert(new Course(3,"SwiftUI","Aman Khoja"));

        repository.deleteById(1);
        System.out.println(repository.findById(3));
        System.out.println(repository.findById(2));
    }
}
