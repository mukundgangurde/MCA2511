import React, {Component} from 'react'
// import './Form.css'
export class Form extends Component {
    constructor(props) {
        super(props)
        this.state = {
            usernanme: '',
            comments: '',
            topic: 'react'
        }
    }
    handleUsernameChange = (e) =>
    {this.setState({username: e.target.value})}
    handleCommentChange = (e) =>
    {this.setState({comments: e.target.value})}
    handleTopicChange = (e) =>
    {this.setState({topic: e.target.value})}
    handleSubmit = (e) =>
    {alert(`${this.state.username} ${this.state.comments}`)}

    render()
    {
        return (
            <form class="form-container" onSubmit={this.handleSubmit}>
                <div>
                    <label>Username</label>
                    <input type='text' value={this.state.username} onChange={this.handleUsernameChange}/>
                    <br></br>
                    <br></br>
                </div>
                <div>
                    <label>Comments</label>
                    <textarea type='text' value={this.state.comments} onChange={this.handleCommentChange}/>
                    <br></br>
                    <br></br>
                </div>
                <div>
                    <label>Select Topic</label>
                    <select type='text' value={this.state.topic} onChange={this.handleCommentChange}>
                        <option value='react'>React</option>
                        <option value='angular'>Angular</option>
                        <option value='vue'>Vue</option>
                    </select>
                    <br></br>
                    <br></br>
                </div>
                <div>
                    <button type='submit'>Submit</button>
                </div>
            </form>
        )
    }
}

export default Form;