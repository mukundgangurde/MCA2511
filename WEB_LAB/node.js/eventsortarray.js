var e = require('events');
var evmt = new e.EventEmitter();
var A = [7,2,5,4,3,6];
var st = ['a','v','e','d'];

function sortarray()
{
    console.log("Array before Sorting");
    console.log(st);
    console.log(A);
    st.sort();
    A.sort();
    console.log("Array before Sorting");
    console.log(st);
    console.log(A);
}

var searcharray = function(ch)
{
    flag = false;
    for(i=0;i<st.length;i++)
    {
        if(st[i]==ch)
        {
            flag=true;
            break;
        }
    }
        if(flag)
            console.log(ch + " is found");
        else
            console.log(ch + " is not found");
}
evmt.addListener("sort", sortarray);
evmt.on("search", searcharray);
evmt.emit("sort");
evmt.emit("search", 'e');
