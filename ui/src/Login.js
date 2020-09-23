import React, { Component } from 'react'
import logo from './logo.svg';
import {createBrowserHistory} from 'history';


function go(k, h){
    if(k.key === "Enter"){
        console.log("call api")
        console.log(h)
        h.push('/test')
    }
}

function Login(props){
    return (
        <div >
            <input 
                type='text' placeholder="Student ID..."  
                style={{margin: 10}} onKeyDown={k => go(k, props.history)} />
            <img src={logo} className="App-logo" alt="logo" />
        </div>
    )
}

export default Login
