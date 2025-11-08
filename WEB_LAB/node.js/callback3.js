let i=0;
var inter = setInterval(function()
{
    ++i;
    console.log("Hello There "+i);
    if (i==10) clearInterval(inter);
},3000);
var t = setTimeout(function()
{
    console.log("Time Out Example!");
},2000);
clearTimeout(t);
console.log("Program is running!");
process.nextTick(function()
{console.log("Urgent Task PM/CM");});
console.log('Hello => number 1');
setImmediate(() => {
    console.log('Running before the Timeout => number 3')
});
setTimeout(() => {
    console.log('The timeout running last => no 4');
}, 100);

process.nextTick(() => {
    console.log('Running before the Timeout => no 2');
});