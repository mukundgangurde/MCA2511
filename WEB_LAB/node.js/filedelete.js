var f = require('fs');
f.unlinkSync("testfile.txt");

f.readFile("testfile.txt","utf8",function(error,data)
{
    if(error)
        console.log(error);
    else
        console.log(data);
});

