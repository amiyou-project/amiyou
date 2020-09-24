import React, { Component, useState } from 'react';
import './App.css';
import logo from './logo.svg';
import Login from './Login'

function App (props){
  const [logged, setLogged] = useState(false);
  const [student, setStudent] = useState([]);

  //

  const page = () => {
      if(!logged) return <Login setLogged={setLogged} setStudent={setStudent}/>;
      else return (
        <div>
          <h1>AMIYOU</h1>
          <ul>{student.map(v => (<li>{v.title}</li>))}</ul>
        </div>
      );
  }
  return (
      <div>
          {page()}
      </div>
  )
}



export default App;
