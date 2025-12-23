import React, { Component } from 'react';
import pImg1 from './p1.jpg';
import pImg2 from './p2.jpg';

export class ProductImg extends Component {
    render() 
    {
        return (
                <div className='productImg'>
                    <img src={pImg1} alt="PImage"></img>
                    <img src={pImg2} alt="PImage"></img>
                    <br/>
                    <p>This is Product Component</p>
                </div>
        );
    }
}

export default ProductImg;