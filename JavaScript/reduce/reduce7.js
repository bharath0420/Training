/*  Write a function that takes an array of strings and returns the longest string in the array. 
Use the reduce method to accomplish this.*/
a=['ben','tommy','joestar','ross','barath','ron','russ','joe']
b=a.reduce((e,i)=>{ if(i.length<e.length){return e} else{ return i}})
console.log(b);