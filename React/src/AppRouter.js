import React from "react";
import "./index.css";
import App from "./App";
import MovieSearchContainer from "./Container/MovieSearchContainer";
import NoResult from './NoResult';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";

class AppRouter extends React.Component {
  render() {
    return (
      <div>
        <Router>
          <div>
            <Switch>
              <Route path="/">
                <App/>
              </Route>
              <Route path="/NoResult">
                <NoResult/>
              </Route>
              <Route path="/search">
                <MovieSearchContainer/>
              </Route>
            </Switch>
          </div>
          {/* <Box mt={5}>
            <Copyright />
          </Box> */}
        </Router>
      </div>
    );
  }
}

export default AppRouter;
