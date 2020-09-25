import React from 'react'
import logo from './logo.svg';
import api from './api.js'

function Login(props){

    let val = ""

    function go(k, setSt, st, co, mc){
        if(k.key === "Enter"){
            console.log("call api")
            api.getStudent(val).then(setSt)
            api.getAllStudents().then(st)
            api.getAllCourses().then(co)
            api.getAllStudentCourses(val).then(mc)
        }
    }

    const {setMyCourses, setStudent, setStudents, setCourses} = props
    
    return (
        <div >
            <input 
                type='text' placeholder="Student ID..." onChange={v =>val=v.target.value} 
                style={{margin: 10}} onKeyDown={k => go(k, setStudent, setStudents, setCourses, setMyCourses)} />
            <img src={logo} className="App-logo" alt="logo" />
        </div>
    )
}

export default Login
