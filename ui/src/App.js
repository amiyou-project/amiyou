import React, { useState } from "react";
import "./App.css";
import Login from "./Login";
import StudentDashboard from "./StudentDashboard";

function App(props) {
  const [student, setStudent] = useState(null);
  const [courses, setCourses] = useState([]);
  const [myCourses, setMyCourses] = useState([]);
  const [students, setStudents] = useState([]);

  const page = () => {
    if (!student)
      return (
        <Login
          setStudent={setStudent}
          setStudents={setStudents}
          setCourses={setCourses}
          setMyCourses={setMyCourses}
        />
      );
    else
      return (
        <StudentDashboard
          courses={courses}
          students={students}
          myCourses={myCourses}
          student={student}
        />
      );
  };
  return <div>{page()}</div>;
}

export default App;
