package am.i.faculty.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.i.faculty.domain.Course;
import am.i.faculty.repository.CourseRepository;
import am.i.faculty.repository.StudentCoursesRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;
	@Autowired 
	private StudentCoursesRepository studentCoursesRepository;

	public Course getCourseById(int id) {
		if (courseRepository.findById(id).isPresent())
			return courseRepository.findById(id).get();
		return null;
	}

	@Override
	public List<Course> getCourseByStudentId(int student_id) { // ask for joinTable
		List<Course> res = new ArrayList<Course>();
		
		if(!studentCoursesRepository.findByStudentId(student_id).isEmpty())
			res = studentCoursesRepository.findByStudentId(student_id)
				.stream().map(sc -> sc.getCourse()).collect(Collectors.toList());
		
		List<Course> l = new ArrayList<Course>();
		l.add(new Course());
		return res; //courseRepository.findByStudentId(student_id);
	}
}
