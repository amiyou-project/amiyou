package am.i.tm.tmRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import am.i.tm.tmdomain.TMAttendance;


@Repository
public interface TMAttendanceRepository extends JpaRepository<TMAttendance, Integer>{
	
}
