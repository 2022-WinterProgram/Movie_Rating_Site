import React from 'react';

function MovieCard({index ,title, image_url, year, country }) {
    return (
        <li className = 'box' key={index}>
            <img src = {image_url} className='model' alt=""/>
            <div className='title'>{title}</div>
            <div className='year'>{year}</div>
            <div className='details'>
                <p className='country'>{country}</p>
            </div>
        </li>  
    )
}

export default MovieCard;
