import React, { Component, useState } from 'react'
import logo from './logo.svg';

function go(k, h){
    if(k.key === "Enter"){
        console.log("call api")
        h(true)
    }
}

function Login(props){
    return (
        <div >
            <input 
                type='text' placeholder="Student ID..."  
                style={{margin: 10}} onKeyDown={k => go(k, props.setLogged)} />
            <img src={logo} className="App-logo" alt="logo" />
        </div>
    )
}

export default Login
