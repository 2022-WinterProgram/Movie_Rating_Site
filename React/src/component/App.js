import React from 'react';
import Header from './Header';
import MainContainer from '../container/MainContainer';
import {BrowserRouter as Router, Route, Routes, Link} from 'react-router-dom';

function App(){
    return(
        <Router>
            <Header></Header>
            <div>
                <Routes>
                    <Route path = '/' element={<MainContainer/>}/>
                    <Route path='/search'/>
                </Routes>
            </div>
        </Router>
    )
}
export default App;