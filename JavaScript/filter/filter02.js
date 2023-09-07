/*  Write a function that takes an array of objects with a price property and returns a 
new array with only the objects that have a price less than a given amouent. 
Use the filter method to accomplish this*/
p = [
    { name: 'Pen 1', quantity: 2, price: 10 },
    { name: 'Pen 2', quantity: 1, price: 24 },
    { name: 'Pen 3', quantity: 2, price: 14 },
    { name: 'Pen 4', quantity: 1, price: 19 },
  ];
x=p.filter(e=>e.price>15)
console.log(x);