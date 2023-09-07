/* Write a function that takes an array of objects with a name and email property and 
returns a new array with only the objects where the email address includes a given domain.
 Use the filter method to accomplish this. */
 x=[
    {name:'kavin',  email:"kavin@"  ,domain:"finstein.ai"},
    {name:'sam',   email:"sam098@"   ,domain:"gmail.com"},
    {name:'bharath',email:"bharath@",domain:"yahoo.com"},
    {name:'ross', email:"ross@" ,domain:"hotmail.com"},
    {name:'pinkman', email:"pinkman@" ,domain:"gmail.com"}
    ]
    y=x.filter(e=>e.domain=="gmail.com")
    console.log(y)