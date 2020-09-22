package am.i.tm.tmRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import am.i.tm.tmdomain.TMAppointment;

@Repository
public interface AppointmentRepository extends JpaRepository<TMAppointment, Integer> {

}
