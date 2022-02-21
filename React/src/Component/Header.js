import React, { Fragment} from 'react';
import MovieCard from '../Component/MovieCard';
import { Row, Col } from 'antd';
import { useEffect,  useState } from 'react';
import axios from 'axios';
import NoResult from '../Component/NoResult';
import {ReactComponent as Search_Icon} from "../Icon/Property 1=search 1.svg";
import {ReactComponent as User} from "../Icon/Property 1=user_big.svg";
import "./Header.css";
import LoginModal from "./LoginModal"
 import JoinModal from "./JoinModal"
import inputChange from "../Container/MovieSearchContainer";
import handleButton from "../Container/MovieSearchContainer";
import result from "../Container/MovieSearchContainer";
import {items, setItems} from "../Container/MovieSearchContainer";
import SearchResult from './SearchResult';
import Search from 'antd/lib/transfer/search';

// const searchStyle={
//     border:'solid',
//     borderRadius:'10px',
//     height:'4vh',
//     width:'70vh',
//   }
const searchButtonStyle={
    flex: 1, /* search-box내부에서 1만큼의 크기를 차지(비율) */
    height: '46px',
    margin: 0,
    padding: 0,
    border: 'none',
    outline: 'none',
    color: '#ffffff',
}


const Header=()=>{
    const getUrl=new URL(window.location.href);
  const urlParams=getUrl.searchParams;
  const keyword=urlParams.get("keyword")
  const [result, setResult]=useState('');
  const [pickresult, setPickresult] = useState('');
  const [items, setItems] = useState();
  const [len, setLen]=useState();
  
  const inputChange=(e)=>{
         const value=e.target.value;
         setResult(value);
     }


     const handleButton = async (value) => {
      try {
       const res = await axios.get('http://localhost:8080/search/'+value);
     
        if (res && res.status === 200) {
          const { data } = res;
          console.log(data);

          setItems(data);
          const len=data.length;
          setLen(len);          
        }
      } catch (e) {
        console.log("error ", e);
      }


    };

    const pickHandleButton = async () => {
        try {
            const res = await axios.get('http://localhost:8080/mypage/pick');

            if (res && res.status === 200) {
                const { data } = res;
                console.log(data);

                setItems(data);
                const len=data.length;
                setLen(len);
            }
        } catch (e) {
            console.log("error ", e);
        }


    };


    const [loginmodalOpen, setloginModalOpen] = useState(false);

    const openloginModal = () => {
        setloginModalOpen(true);
    };
    const closeloginModal = () => {
        setloginModalOpen(false);
    };

    const [joinmodalOpen, setjoinModalOpen] = useState(false);

    const openjoinModal = () => {
        setjoinModalOpen(true);
    };
    const closejoinModal = () => {
        setjoinModalOpen(false);
    };


//header
return(
    <div className='header'>
        {/*logo position */}
        <div className='logo'>
            Diflixpedia
        </div>
        <div className='search_bar'>
        {/* <div className='search_bar'> */}
            <input type="text" id=""  placeholder="검색어를 입력해주세요" onChange={inputChange} />
            <Search_Icon className='icon' width={35} height={35} style={searchButtonStyle} onClick={()=>handleButton(result)}/>
        {/* </div> */}
        </div>
        
        <div className='login'>
            <React.Fragment>
            <h1 className='log' onClick={openloginModal}>Login</h1>
                <LoginModal open={loginmodalOpen} close={closeloginModal} header="Diflixpedia Login">
                </LoginModal>
            </React.Fragment>
            
            <h1 className='log'>|</h1>


            <React.Fragment>
                <h1 className='log' onClick={openjoinModal}>Join</h1>
                <JoinModal open={joinmodalOpen} close={closejoinModal} header="Diflixpedia Join">
                </JoinModal>
            </React.Fragment>

            {/* <User className='icon' width={35} height={35} onClick={()=>pickHandleButton()}/> */}
        </div>

        <div className='Result'>
            <Row>
            {items&&items.map((item) => {
                return (
                <Col xs={24} sm={12} md={6} lg={4} xl={4}>
                    <MovieCard item={item} ></MovieCard>;
                </Col>
                );
            })}
            </Row>
      </div>
    </div>
);
};
export default Header;