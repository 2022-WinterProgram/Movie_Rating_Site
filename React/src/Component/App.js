import React, { Component } from 'react';
import 'antd/dist/antd.css';
import MainContainer from '../container/MainContainer';
import MovieSearchContainer from '../container/MovieSearchContainer';
class App extends Component {
    
    render() {
        return (
            <div className='App'>
                {/* <MovieSearchContainer></MovieSearchContainer> */}
                <MainContainer></MainContainer>
            </div>

        );
    }
}

export default App;