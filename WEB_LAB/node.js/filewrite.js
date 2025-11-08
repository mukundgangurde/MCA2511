var f = require("fs");

f.writeFileSync('testfile.txt',"Hello Good Morning. Nice to meet you");
console.log("Before Appending");

var data = f.readFileSync('testfile.txt',data);
console.log(data.toString());


f.appendFileSync("testfile.txt"," Iam appended data");
console.log("After Appending");

f.readFile('testfile.txt',function(ferr,filedata)
{
    if(ferr) return console.error(ferr);
    else {
        console.log(filedata.toString());
    }
});
