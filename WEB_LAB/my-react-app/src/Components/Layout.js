import { BrowserRouter, Route, Routes, Link } from 'react-router-dom';
import Home from './Home';
import About from './About';
import Info from './Info';
// import './App.css';

const Layout = () => 
{
    return (
        <div>
            <BrowserRouter>
                <nav>
                    <Link to="/">Home</Link> | {" "}
                    <Link to="/about">About</Link> | {" "}
                    <Link to="/info">Info</Link>
                </nav>
                <Routes>
                    <Route path="/" element={<Home />} />
                    <Route path="/about" element={<About />} />
                    <Route path="/info" element={<Info />} />
                </Routes>
            </BrowserRouter>
        </div>
    );
};

export default Layout;