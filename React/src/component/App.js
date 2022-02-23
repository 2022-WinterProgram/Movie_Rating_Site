import React, { Component } from 'react';
import Header from './Header';
import MainContainer from '../container/MainContainer';
import MovieInfo from "./MovieInfo";
class App extends Component {
    
    render() {
        return (
            <div className='App'>
                <Header></Header>
                <MainContainer></MainContainer>
                {/*<MovieInfo/>*/}
            </div>

        );
    }
}

export default App;