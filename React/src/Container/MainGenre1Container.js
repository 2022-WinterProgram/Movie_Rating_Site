import React, { Component } from "react";
import axios from "axios";  // 설치 후 import
import Listpage from "../component/MainListPage";
import '../css/MainContainer.css';

//actionList
class MainGenre1Container extends Component {
  state = { 
    loading: false,
    ItemList: []
  };
  loadItem = async () => {
   await axios
     .get("http://localhost:8080/main/GenreList1")
     .then(({ data }) => {
       this.setState({ 
         loading: true,
         ItemList: data
       });
     })
     .catch(e => {  // API 호출이 실패한 경우
       console.error(e);  // 에러표시
       this.setState({  
         loading: false
       });
     });
  };
  componentDidMount() {
    this.loadItem();  // loadItem 호출
  }

  render() {
    const { ItemList } = this.state;
    console.log(ItemList);
    return (
        <Listpage Itemcard={ItemList} />      
    );
  }
}
export default MainGenre1Container;

