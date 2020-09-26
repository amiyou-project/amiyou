package am.i.faculty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import am.i.faculty.domain.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {

}
