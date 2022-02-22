import React from 'react';

const MovieCard = ({ item }) => {
  const { index, title, image_url, year, country} = item;
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
