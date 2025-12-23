import React, {Component} from 'react';

class AddMultiply extends Component {
    constructor(props) {
        super(props);
        this.state = {Num1: '', Num2: ''};
    }
    Add = () => {
        var n1 = parseFloat(this.state.Num1);
        var n2 = parseFloat(this.state.Num2);
        var ans = n1 + n2;
        alert(ans);
    }
    Mult = () => {
        var n1 = parseFloat(this.state.Num1);
        var n2 = parseFloat(this.state.Num2);
        var ans = n1 * n2;
        alert(ans);
    }
    render() {
        return (
            <div>
                <h3>Addition & Multiply of Numbers</h3>
                <p>Num1: <input type='number' onChange={(e) => this.setState({Num1: e.target.value})} value={this.state.Num1} /></p>
                <p>Num2: <input type='number' onChange={(e) => this.setState({Num2: e.target.value})} value={this.state.Num2} /></p>

                <div>
                    <button class='button' onClick={this.Add}>Add</button>
                    <button class='button' onClick={this.Mult}>Multiply</button>
                </div>

            </div>
        )
    }
}

export default AddMultiply;