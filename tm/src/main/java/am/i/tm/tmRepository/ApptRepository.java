package am.i.tm.tmRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import am.i.tm.tmdomain.TMAttendance;

public interface ApptRepository extends JpaRepository<TMAttendance,Integer>{

}
