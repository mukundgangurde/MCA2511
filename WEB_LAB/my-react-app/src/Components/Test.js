import React, { Component } from "react";

class Test extends Component {
  constructor(props) {
    super(props);
    this.state = { favoritefood: "rice" };
  }
  //   static getDerivedStateFromProps(props, state) {
  //     return { favoritefood: props.favfood };
  //   }
  componentDidMount() {
    setTimeout(() => {
      this.setState({ favoritefood: "pizza" });
    }, 2000);
  }

  changeState() {
    this.setState({ favoritefood: "chicken" });
  }

  getSnapshotBeforeUpdate(prevProps, prevState) {
    document.getElementById("div1").innerHTML =
      "Before the update, the favorite was " + prevState.favoritefood;
  }

  componentDidUpdate() {
    document.getElementById("div2").innerHTML =
      "The update, the favorite food is " + this.state.favoritefood;
  }

  componentWillUnmount(){
      alert("Food Component removed")
  }

  render() {
    return (
      <>
        <h1>My Favorite Food Is {this.state.favoritefood}</h1>
        <div id="div1"></div>
        <div id="div2"></div>
        <button onClick={this.changeState.bind(this)}>Change Food</button>
      </>
    );
  }
}

export default Test;
