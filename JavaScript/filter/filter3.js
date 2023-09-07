/* Write a function that takes an array of strings and returns a new array with only the strings that have a length greater than a given length. 
Use the filter method to accomplish this. */
a=['ben','tommy','joestar','ross','barath','ron','russ','joe']
b=a.filter((e)=>e.length>=4 )
console.log(b);