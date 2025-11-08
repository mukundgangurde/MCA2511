var e = require('events');
var evmt = new e.EventEmitter();

evmt.on("div", (no1,no2)=>
{
    console.log(`${no1} / ${no2} = ${no1/no2}`);
});
evmt.on("add", (no1,no2)=>
{
    console.log(`${no1} + ${no2} = ${no1+no2}`);
});
evmt.on("sub", (no1,no2)=>
{
    console.log(`${no1} - ${no2} = ${no1-no2}`);
});
evmt.on("mod", (no1,no2)=>
{
    console.log(`${no1} % ${no2} = ${no1%no2}`);
});
evmt.on("sqrt", (no1)=>
{
    console.log(`Square root of ${no1} = ${Math.sqrt(no1)}`);
});
evmt.emit("add",10,20);
evmt.emit("div",10,2);
evmt.emit("sqrt",625);
evmt.emit("mod",10,20);
evmt.emit("sub",10,20);