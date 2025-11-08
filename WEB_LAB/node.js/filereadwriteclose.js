var f = require('fs');
f.open('testrw.txt','w+',function (err,fd)
{
    if (err)
        return console.error(err);
    // var buffr = new Buffer.alloc(1024);
    // buffr = Buffer.from("Hello new read write file");

   const buffr = Buffer.from("Hello new read write file");

    f.write(fd,buffr,0,buffr.length,0,function(err)
    {
        if (err) throw err;
        console.log("Write Successful");

        f.read(fd,Buffer.alloc(buffr.length),0,buffr.length, 0, function(err, bytesRead, buffr)
        {
            if (err) throw err;
            if (bytesRead>0) {
                console.log(buffr.toString());
            }
        

            f.close(fd,function(err) {
                if(err) throw err;
                else console.log("Closed Successful");
            });//closing of f.close
        });//end of f.read
    });//closing of f.write
});//closing for f.open