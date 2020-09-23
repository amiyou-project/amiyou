package am.i.faculty.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import am.i.faculty.domain.Attendance;


@Repository
public interface AttendanceRepository extends JpaRepository <Attendance,Integer> {
	//public List<Attendance>findByAttendanceId(int id,Pageable pageRequest);
  //  public long countByAttendanceId(int student_id);

}
