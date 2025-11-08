
// Addition, Subtraction, Multiplication, Division, Modulos function
function add(x,y) {return x+y;}
function sub(x,y) {return x-y;}
function mul(x,y) {return x*y;}
function div(x,y) {return x/y;}
function mod(x,y) {return x%y;}

// Function to calculate sum between two numbers
function sumoftwono(x,y)
{
    sum = 0;
    for(i=x;i<=y;i++) sum = sum + i;
    return sum;
}

// Factorial function
function fact(x)
{
    fact = 1;
    for(i=x;i>0;i--) fact = fact * i;
    return fact;
}

// Giving values
n1=10;
n2=12;

console.log("Addition of "+n1+" & "+n2+"\t\t:" + add(n1,n2));
console.log("Subtraction of "+n1+" & "+n2+"\t\t:" +sub(n1,n2));
console.log("Multiplication of "+n1+" & "+n2+"\t:" + mul(n1,n2));
console.log("Division: of "+n1+" & "+n2+"\t\t:" + div(n1,n2));
console.log("Modulos: of "+n1+" & "+n2+"\t\t:" + mod(n1,n2));

console.log("Factorial of "+n1+" is "+fact(n1));
console.log("Sum of between two no "+n1+" & "+n2+" is "+sumoftwono(n1,n2));