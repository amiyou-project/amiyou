import React from 'react';
import ReactDOM from 'react-dom';
import {Router} from 'react-router';
import './index.css';
import * as serviceWorker from './serviceWorker';
import Login from './Login'
import {createBrowserHistory} from 'history';

const history = createBrowserHistory();

ReactDOM.render(
  //<Router history={history} routes={routes}/>
  //<React.StrictMode> <App /> </React.StrictMode>,
  <Router history={history}> <Login history={history} /> </Router>,
  document.getElementById('root')
);

serviceWorker.unregister();
