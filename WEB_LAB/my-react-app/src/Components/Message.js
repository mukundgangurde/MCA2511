import React, {Component} from 'react'
class Message extends Component {
    constructor() {
        super()
        this.state ={
            message : 'Welcome visitor',
            visitor : 0,
            username: ''
        }
    }
    changeMessage() {
        if(this.state.visitor < 10)
            this.setState({visitor: this.state.visitor + 1})
        this.setState({message: "Thanks for Subscribing "})
    }
    render() {
        return (
        <div>
            <h1>{this.state.message} {this.state.visitor} {this.state.username}</h1>
            <p>Username: 
                <input type='text' onChange={(e) => this.setState({username: e.target.value})} value={this.state.username}></input>
            </p>
            <button onClick={this.changeMessage.bind(this)}>Subscribed Visitor</button>
        </div>
        )
    }
}

export default Message;