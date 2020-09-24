import courses from './courses.json'
import students from './students.json'
import student from './currentStudent.json'
const url="http://localhost:8085" // http://localhost:8085


const api = {
    register: async (st_id, co_id) => {
        const data =await fetch(`${url}/courses/${st_id}/register/${co_id}`);
        console.log(data)
        return true //await data.json();
    },
    unregister: async (cid, sid) =>{
        const data = await fetch(`${url}/courses/${cid}/unregister/${sid}`, {method:"DELETE"});
        return await data.json()
    },
    getStudent: async id => {
        //const data =await fetch(`${url}/students/${id}`);
        return student
    },
    getAllStudents: async ()=>{
        //const data =await fetch(`${url}/students`);
        return students
    },
    getAllCourses: async ()=>{
        const data =await fetch(`${url}/courses`);
        return await data.json() //courses
    },
    getAllStudentCourses: async (st_id)=>{
        const data =await fetch(`${url}/courses/student/${st_id}`);
        return await data.json() // courses
    }
}

export default api
