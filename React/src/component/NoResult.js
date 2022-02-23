import React, { Fragment } from 'react';
import styled from 'styled-components';

const NoResult= ()=>{
    return(
        //NoResult Page
   
            <div className='NoResult' style={{ display: 'flex', justifyContent: 'center', padding: '2rem' }}>
            <h2>검색 결과가 없습니다.</h2><br/>
            <h3>검색어를 확인 해 주세요.</h3>
        </div>

    );
}; export default NoResult;