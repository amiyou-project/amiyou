package am.i.faculty.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import am.i.faculty.domain.Attendance;

public interface AttendaceRepository extends JpaRepository <Attendance,Integer> {

}
