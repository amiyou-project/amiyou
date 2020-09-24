import React from "react";
import api from "./api.js";

function StudentDashboard(props) {
  const { courses, students, myCourses, student } = props;
  return (
    <div>
      <h1>AMIYOU</h1>
      <div>
        <h1>ALL COURSES</h1>
        <ul>
          {courses.map((c) => (
            <li key={"c" + c.id} onClick={() => api.register(c.id, student.id)}>
              {c.title}
            </li>
          ))}
        </ul>
      </div>
      <div>
        <h1>STUDENTS</h1>
        <ul>
          {students.map((s) => (
            <li key={"s" + s.id}>{s.name}</li>
          ))}
        </ul>
      </div>
      <div>
        <h1>MY COURSES</h1>
        <ul>
          {/*myCourses.map(mc => (
                <li key={"mc"+mc.id} onClick={() => api.unregister(mc.id, student.id)}>
                    {mc.title}
            </li>))*/}
        </ul>
      </div>
    </div>
  );
}

export default StudentDashboard;
