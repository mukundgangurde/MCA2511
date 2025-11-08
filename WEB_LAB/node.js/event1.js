var e = require('events');
var event = new e.EventEmitter();

function CreateFile(){
    console.log("Creating a file");
}
function Read() {
    console.log("Reading a file");
}
function Write() {
    console.log("Writing a file");
}

event.addListener("IOoperations", Write);
event.addListener("IOoperations", Read);
event.once("CreateIO", CreateFile);
console.log(event.listenerCount("CreateIO"));
event.emit("CreateIO");

event.emit("IOoperations");
event.emit("IOoperations");
console.log(event.rawListeners("IOoperations"));
console.log(event.listenerCount("IOoperations"));
event.removeListener("IOoperations", Read);
event.emit("IOoperations");
console.log(event.listenerCount("IOopertions"));
event.emit("CreateIO");
console.log(event.listenerCount("CreateIO"));