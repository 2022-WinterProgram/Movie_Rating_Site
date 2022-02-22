import React, { Component } from "react";
import MainActorContainer from './MainActorContainer';
import MainGenre1Container from './MainGenre1Container';
import MainGenre2Container from './MainGenre2Container';
import MainImdbTop10Container from './MainImdbTop10Container';
import '../css/MainContainer.css';


class MainContainer extends Component{
    render(){
        return(
            <>
            <div className='mainImage-box'>
                <img className='mainImage' src='img/mainPhoto.png'></img>
            </div>
            <div className='list'>
                <div className='listTitle'>
                    Chris Evan 의 영화
                </div>
                <MainActorContainer></MainActorContainer>
                <div className='listTitle'>
                    Action
                </div>
                <MainGenre1Container></MainGenre1Container>
                <div className='listTitle'>
                    Sci-Fi
                </div>
                <MainGenre2Container></MainGenre2Container>
                <div className='listTitle'>
                    IMDB TOP 10
                </div>
                <MainImdbTop10Container></MainImdbTop10Container>
            </div>
            </>
        );
    }
}

export default MainContainer;
