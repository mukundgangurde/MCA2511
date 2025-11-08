var e = require('events');
var evmt = new e.EventEmitter();
evmt.on("Calculate Salary", (basic) =>
{
var hra = basic * 60/100;
var da = basic;
var pt = 200;
var it = basic * 30 / 100;
var gross = basic + hra + da + pt + it
var net = gross - (pt+it);

console.log(`Basic Salary : ${basic}`);
console.log(`Dearness Allowance : ${da}`);
console.log(`HRA : ${hra}`);
console.log(`Profession Tax : ${pt}`);
console.log(`Income Tax : ${it}`);
console.log(`Gross Salary : ${gross}`);
console.log(`Net Salary : ${net}`);
});

evmt.emit("Calculate Salary", 50000);