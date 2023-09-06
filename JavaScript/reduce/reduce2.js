/* Write a function that takes an array of objects with a 'price' property and returns the total cost of all the objects.
 Use the reduce method to accomplish this. */
var  p = [
    { 'name': 'pen 1', 'price': 100 },
    { 'name': 'pen 2', 'price': 240 },
    { 'name': 'pen 3', 'price': 140 },
    { 'name': 'pen 4', 'price': 190 }]
sum=p.reduce((e,i)=>{return e+i.price},0)
console.log(sum);