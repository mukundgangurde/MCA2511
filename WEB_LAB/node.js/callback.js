var fs = require("fs")
fs.readFile('input.txt',function(ferr, data)
    {
        if (ferr) return console.error(ferr);
        console.log(data.toString());
        console.log("End of Read");
    }
);

console.log("reading File!");
// Executed before the file is read as reading
// is happening asyncronously
x=5;
y=123;
console.log("Sum: "+(x+y));

