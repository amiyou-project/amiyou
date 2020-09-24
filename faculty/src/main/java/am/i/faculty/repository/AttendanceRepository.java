package am.i.faculty.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import am.i.faculty.domain.Attendance;


@Repository
public interface AttendanceRepository extends JpaRepository <Attendance,Integer> {


	public Optional<Attendance> findByStudentId(int student_id);

}
