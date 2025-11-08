var mysql = require('mysql2');
var con = mysql.createConnection({
    host:"localhost",
    user:"root",
    password: "",
    database:"student",
    port:3306
});

con.connect(function(err) {
    if(err) throw err;
    console.log("Connected! to mysql");
});
con.query("CREATE DATABASE faculty",
    function(err) {
        if(err) throw err;
        console.log("Faculty Database Created");
});