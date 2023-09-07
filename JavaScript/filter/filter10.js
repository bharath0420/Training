/* Write a function that takes an array of strings and returns a new array with only 
the strings that are palindromes. 
Use the filter method to accomplish this */
x=[
    {name:'malayalam'},
    {name:'madam'},
    {name:'small'},
    {name:'act'},
    {name:'amma'}
    ]
    y=x.filter(e=>e.name==e.name.split('').reverse().join(''))
    console.log(y)