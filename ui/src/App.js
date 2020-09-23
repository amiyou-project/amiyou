import React, { Component, useState } from 'react';
import './App.css';
import logo from './logo.svg';
import Login from './Login'

function App (props){
  const [logged, setLogged] = useState(false);

  const page = () => {
      if(!logged) return <Login setLogged={setLogged}/>;
      else return (
        <div>
          <h1>AMIYOU</h1>
          <img src={logo} className="App-logo" alt="logo" />
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
