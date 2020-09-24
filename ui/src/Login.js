import React from 'react'
import logo from './logo.svg';
import courses from './courses.json'

function go(k, exists, st){
    if(k.key === "Enter"){
        console.log("call api")
        fetch('http://localhost:8085/courses', {mode:'cors'}).then(data => {
            console.log(data)
        })
        exists(true)
        st(courses)
    }
}

function Login(props){
    return (
        <div >
            <input 
                type='text' placeholder="Student ID..."  
                style={{margin: 10}} onKeyDown={k => go(k, props.setLogged, props.setStudent)} />
            <img src={logo} className="App-logo" alt="logo" />
        </div>
    )
}

export default Login
