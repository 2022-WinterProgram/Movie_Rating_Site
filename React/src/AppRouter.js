import React from "react";
import "./index.css";
import App from "../src/App";
import MovieSearchContainer from "../container/MovieSearchContainer";
import NoResult from './NoResult';
import { BrowserRouter as Router, Switch, Route } from "react-router-dom";
import MoviePickContainer from "../container/MoviePickContainer";

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
              <Route path="/pick">
                <MoviePickContainer/>
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
