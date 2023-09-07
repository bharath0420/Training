/* Write a function that takes an array of objects with a name and salary property and returns the total salary of all the employees.
 Use the reduce method to accomplish this. */
n=[
    {name:"KAVIN",salary:20000},
    {name:"venky",salary:20000},
    {name:"navin",salary:20000},
    {name:"sri",salary:200000},
    {name:"bhavana",salary:500000}
]
m=n.reduce((a,b)=> a+b.salary,0)
console.log(m);