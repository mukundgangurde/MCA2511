exports.myDtTime = function() {
    return Date();
}

exports.myMessage = function() {
    return("Hello World");
}

exports.Palindrome = function(str) {
    var rev ="";
    var str1 = str.toString();
    for(i=str1.length-1;i>0;i--)
    {
        rev = rev + str1.charAt(i);
    }
    if(str1==rev)
        return(str1 + " is palindrome");
    else
        return(str1 + " is not palindrome");

}

exports.sumofdigits = function(num)
{
    temp=num;
    sum=0;
    while(temp>0)
    {
        sum = sum + temp%10;
        temp = parseInt(temp/10);
    }
    return("Sum of digits of "+ num + " is " + sum);
}

exports.armstorng = function(num)
{
    temp=num;
    sum=0;
    while(temp>0)
    {
        sum = sum + Math.pow(temp%10, 3);
        temp = parseInt(temp/10);
    }
    if(num == sum)
        return (num + " is an ArmStrong Number");
    else
        return (num + " is not an ArmStrong Number")
}