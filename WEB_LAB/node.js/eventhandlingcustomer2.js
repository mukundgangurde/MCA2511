var e =require('events');
var  evmt = new e.EventEmitter();
var customerinfo = function(code,cname,city,email)
{
    console.log(`Customer No ${code}`);
    console.log(`Customer Name ${cname}`);
    console.log("City " + city);
    console.log("email ID "+ email);
}

evmt.on("customerinfo",customerinfo);
evmt.emit("customerinfo", 1, "MG", "Thane", "mg@mail.com");
evmt.emit("customerinfo", 2, "MG2", "Thane2", "mg2@mail.com");