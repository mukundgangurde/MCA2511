import React,{Component} from "react";
import {BrowserRouter,Route,Routes,Link} from 'react-router-dom';
import Home from "./Home";
import About from "./About";
import SemesterList from "./SemesterList";
import Subsem1 from "./Subsem1";
import Subsem2 from "./Subsem2";
import Subsem3 from "./Subsem3";
// import Subsem4 from "./Subsem5";

function Layout2(){
    return(
    <div>
        <BrowserRouter>
            <nav>
                <Link to="/">Home</Link> |{" "}
                <Link to="/allsemesters">Semester List</Link> |{" "}
                <Link to="/about">About Us</Link>
            </nav>
            <Routes>
                <Route path="/" exact element={<Home/>}/>
                <Route path="/allsemesters"  element={<SemesterList/>}>
                <Route path="/allsemesters/sem1" element={<Subsem1/>}/>
                <Route path="/allsemesters/sem2" element={<Subsem2/>}/>
                <Route path="/allsemesters/sem3" element={<Subsem3/>}/>
                </Route>
                {/* <Route path="/sem4" element={<Subsem1/>}/> */}
                <Route path="/about" exact element={<About/>}/>
            </Routes>
        </BrowserRouter>
    </div>
    );
}

export default Layout2;


