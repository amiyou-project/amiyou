import React from 'react';
import ReactDOM from 'react-dom';
import {Router,Route} from 'react-router';
import './index.css';
import * as serviceWorker from './serviceWorker';
import Login from './Login'
import App from './App'
import {createBrowserHistory} from 'history';

const history = createBrowserHistory();
//<Login history={history} /> 

ReactDOM.render(
  //<Router history={history} routes={routes}/>
  //<React.StrictMode> <App /> </React.StrictMode>,
  <Router history={history}> 
    <Route exact path="/test" component={App} />
    <Route exact path="/" component={App} />
  </Router>,
  document.getElementById('root')
);

serviceWorker.unregister();
