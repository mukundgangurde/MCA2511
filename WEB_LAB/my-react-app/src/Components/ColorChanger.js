import React, { useState, useEffect } from "react";

const ColorChange = () => {
  const [circleBackColor, setCircleBackColor] = useState("red");

  const getRandomColor = () => {
    return "#" + Math.random().toString(16).slice(2, 8);
  };

  const changeColor = () => {
    setCircleBackColor(getRandomColor);
  };

  useEffect(() => {
    document.body.style.backgroundColor = getRandomColor();
  });
  return (
    <>
      <div>ColorChange</div>
      <div
        style={{height:"150px", cursor:"pointer", width: "150px", borderRadius: "100%", backgroundColor: circleBackColor}}
        className="circle"
        onClick={changeColor}
      ></div>
      <div className="txt">👆Click Me</div>
    </>
  );
};

export default ColorChange;
