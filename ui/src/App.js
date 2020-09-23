import React, { Component } from 'react';
import './App.css';
import logo from './logo.svg';

export class App extends Component {

  render() {
      return (
          <div>
              <h1>AMIYOU</h1>
              <img src={logo} className="App-logo" alt="logo" />
          </div>
      )
  }
}

export default App;
