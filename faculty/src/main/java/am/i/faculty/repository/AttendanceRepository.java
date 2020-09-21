package am.i.faculty.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import am.i.faculty.domain.Attendance;


@Repository
public interface AttendanceRepository extends JpaRepository <Attendance,Integer> {

}
