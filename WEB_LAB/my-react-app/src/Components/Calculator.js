import React, { useState } from "react";
// import "./App.css";

function Calculator() {
    const [val, setVal] = useState("");
    return (
        <div className="calculator">
            <h1>Calculator</h1>
            <div>
                <input type="text" value={val} disabled></input>
            </div>
            <button className="button" value="" onClick={(e) => setVal("")}> AC </button>
            <button className="button" value="" onClick={(e) => setVal("")}> C </button>

            <button className="button" value="%" onClick={(e) => setVal(val + e.target.value)}> % </button>
            <button className="button" value="/" onClick={(e) => setVal(val + e.target.value)}> / </button>
            <div>
                <button className="button" value="1" onClick={(e) => setVal(val + e.target.value)}> 1 </button>
                <button className="button" value="2" onClick={(e) => setVal(val + e.target.value)}> 2 </button>
                <button className="button" value="3" onClick={(e) => setVal(val + e.target.value)}> 3 </button>
                <button className="button" value="*" onClick={(e) => setVal(val + e.target.value)}> x </button>
            </div>
            <div>
                <button className="button" value="4" onClick={(e) => setVal(val + e.target.value)}> 4 </button>
                <button className="button" value="5" onClick={(e) => setVal(val + e.target.value)}> 5 </button>
                <button className="button" value="6" onClick={(e) => setVal(val + e.target.value)}> 6 </button>
                <button className="button" value="-" onClick={(e) => setVal(val + e.target.value)}> - </button>
            </div>
            <div>
                <button className="button" value="7" onClick={(e) => setVal(val + e.target.value)}> 7 </button>
                <button className="button" value="8" onClick={(e) => setVal(val + e.target.value)}> 8 </button>
                <button className="button" value="9" onClick={(e) => setVal(val + e.target.value)}> 9 </button>
                <button className="button" value="+" onClick={(e) => setVal(val + e.target.value)}> + </button>
            </div>
            <button className="button" value="0" onClick={(e) => setVal(val + e.target.value)}> 0 </button>
            <button className="button" value="." onClick={(e) => setVal(val + e.target.value)}> . </button>
            <button className="buttonsum" value="=" onClick={(e) => setVal(String(eval(val)))}> = </button>


        </div>
    );
}

export default Calculator;