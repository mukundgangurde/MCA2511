import React from 'react';
import './App.css';
import Test from './Components/Test'

class App extends React.Component {
  constructor() {
    super();
    this.state = {
      showApp: true,

    };
  }
  render() {
    return (
      <div className="App" >
        <h1>FOOD TOGGLE</h1>
        <button onClick={() => this.setState({ showApp: !this.state.showApp })}>
          {this.state.showApp ? "Hide Favourite Food" : "Show Favourite Food"}
        </button>
        {this.state.showApp ? <Test /> : null}
      </div >
    )
  }
}

export default App;