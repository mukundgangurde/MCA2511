import React, {Component} from 'react';
export class ProductImg2 extends Component {
    render ()
    {
        return ( 
        <div className='productImg'>
            <img class="img2" alt='this' src={this.props.in}></img>
            <p>This is Product Component</p>
        </div>
        );
    }
}

export default ProductImg2;