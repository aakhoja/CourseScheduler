package Aman.Khoja.CourseScheduler;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CourseSpringDataJpa extends JpaRepository<Course, Long> {

}
