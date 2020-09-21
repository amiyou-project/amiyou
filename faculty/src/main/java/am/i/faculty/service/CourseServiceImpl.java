package am.i.faculty.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import am.i.faculty.domain.Course;
import am.i.faculty.repository.CourseRepository;

@Service
@Transactional
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepository;

	public Course getCourseById(int id) {
		if (courseRepository.findById(id).isPresent())
			return courseRepository.findById(id).get();
		return null;
	}

	@Override
	public List<Course> getCourseByStudentId(int student_id) {
		return courseRepository.findByStudentId(student_id);
	}
}
