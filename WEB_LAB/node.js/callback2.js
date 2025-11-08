var calculate = function(x,y,display)
{
    let sum = x+y;
    setTimeout(function(){display(sum);},20000);

    //will execute after 20 seconds.
    console.log("Leaving....");
    //function call leaves this block.
}

calculate(5,10,function(res)
    {
        console.log("Sum: "+res);
        console.log("Program Ends");
    }
);