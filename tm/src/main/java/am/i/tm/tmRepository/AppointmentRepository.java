package am.i.tm.tmRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import am.i.tm.tmdomain.TMAppointment;

@Repository
public interface AppointmentRepository extends JpaRepository<TMAppointment, Integer> {
	//public TMAppointment findBystudid(int stud_id);

	public TMAppointment findByApptDate(String apptDate);

	@Query("SELECT a FROM TMAppointment a where a.stud_id = :stud_id and a.apptDate=:apptDate")
	TMAppointment findAppointmentByStudIdAndApptDate(@Param("stud_id") int stud_id, @Param("apptDate") String apptDate);

}
