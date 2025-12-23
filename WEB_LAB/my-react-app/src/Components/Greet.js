import React from 'react';

// Basic props usage
// In this version, we take all props as a single object called `props`
// function Greet (props) 
// {
//     return <h1>Hello {props.name}, {props.surname}</h1>
// }

// // Destructure props and use rest (...rest)
// function Greet({name, surname, ...rest})
// {    
//     return <h1>Hello {name} {surname} {rest.year}</h1>
// }

// // Destructure with default values
// function Greet({name, surname="NA", age="0"})
// {
//     return <h1>Hello {name} {surname} {age}</h1>
// }

// Extract one prop and use rest for others
function Greet({name, ...rest})
{
    return <h1>Hello {name} {rest.surname} {rest.age}</h1>
}
export default Greet;