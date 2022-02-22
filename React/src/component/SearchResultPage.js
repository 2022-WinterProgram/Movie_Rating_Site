import React, { Component } from "react";
import MovieCard from "./MovieCard";
import Col from 'react-bootstrap/Col';
import Row from 'react-bootstrap/Row';


const SearchPage = () => {

    var id = 1;
    const state = {};

    const mapping=()=>{
        const { MovieCard } = this.props;
        return MovieCard.map((itemdata, insertIndex) => {
            return (
                <Row>
                    <Col xs={24} sm={12} md={6} lg={4} xl={4}>
                        <MovieCard
                            key={insertIndex}
                            title={itemdata.title}
                            image_url={itemdata.image_url}
                            year={itemdata.year}
                            country={itemdata.country}
                        />
                    </Col>
                </Row>
            );
        });
    }

    return(
        <div className='ResultContainer'>
            {this.mapping()}
        </div>
    );    

}

export default SearchPage;