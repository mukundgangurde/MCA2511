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

con.query("CREATE TABLE student1(rollno int primary key, name VARCHAR(55), address VARCHAR(255))",
    function (err)
    {
        if (err) throw err;
        console.log("Student Table Created");
    }
);

con.query("INSERT INTO student1 values(1305,'fisrtname','world')",
    function (err)
    {
        if(err) throw err;
        console.log("Row Inserted");
    }
);

con.query("SELECT * FROM student1",
    function (err, res)
    {
        if(err) throw err;
        console.log("Student Details - ");
        console.log(res);
    }
);

con.query("UPDATE student1 SET rollno=5031, name='updatedname', address='updatedworld' WHERE rollno=1305",
    function (err)
    {
        if(err) throw err;
        console.log("Row Updated");
    }
);

con.query("SELECT * FROM student1",
    function (err, res)
    {
        if(err) throw err;
        console.log("Student Details - ");
        console.log(res);
    }
);