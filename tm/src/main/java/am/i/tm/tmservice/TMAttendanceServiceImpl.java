package am.i.tm.tmservice;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.i.tm.tmRepository.TMAttendanceRepository;
import am.i.tm.tmdomain.TMAttendance;

@Service
@Transactional
public class TMAttendanceServiceImpl implements TMAttendanceService {

	@Autowired
	private TMAttendanceRepository tmattendancerepository;
	
	@Override
	public TMAttendance getAttendanceById(int id) {
		if(tmattendancerepository.findById(id).isPresent()) {
			return tmattendancerepository.findById(id).get();
		}
		return null;
	}

	@Override
	public List<TMAttendance> getAllAttendances() {
		return tmattendancerepository.findAll();
		//return null;
	}

}
