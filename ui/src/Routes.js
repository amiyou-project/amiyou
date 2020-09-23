import { Route } from "react-router";

let routes = (
  <div>
    <Route path="/about">
      <App />
    </Route>
    <Route path="/:user">
      <Login />
    </Route>
    <Route>
      <Login />
    </Route>
  </div>
);