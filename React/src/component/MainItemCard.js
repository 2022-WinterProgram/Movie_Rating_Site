import React from 'react';

function MainItemCard({index ,title, image_url, year, country ,imdb }) {
    return (
        <li className = 'box' key={index}>
            {/* <p className='netflix'>NETFLIX</p> */}
            <a href={'http://localhost:8080/movies/'+title} target='_self'>
            <img src = {image_url} className='model' alt=""/>
            <div className='title'>{title}</div>
            <div className='year'>{year}</div>
            <div className='details'>
                {/* <img src='img/AntMan-logo.png' className='logo'></img> */}
                <p className='country'>{country}</p>
                <p className='imdb'>{imdb}</p>
            </div>
            </a>
        </li>  
    )
}

export default MainItemCard;

