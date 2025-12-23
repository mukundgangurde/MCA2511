import {Link, Outlet } from 'react-router-dom';
function SemesterList(){
    return(
        <div>
            <h1>Semester List Page</h1>
            <nav style={{marginBottom: '20px'}}>
                <Link to="/allsemesters/sem1">Semester 1</Link> | {" "}
                <Link to="/allsemesters/sem2">Semester 2</Link> | {" "}
                <Link to="/allsemesters/sem3">Semester 3</Link> | {" "}
                {/* <Link to="sem4">Semester 4</Link> |  */}
            </nav>
            <Outlet/>
        </div>
    );
}
export default SemesterList;