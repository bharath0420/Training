/* Write a function that takes an array of objects with a quantity and price property and returns 
the total cost of all the objects, considering the quantity of each object. 
Use the reduce method to accomplish this. */
p = [
    { name: 'Pen 1', quantity: 2, price: 10 },
    { name: 'Pen 2', quantity: 1, price: 24 },
    { name: 'Pen 3', quantity: 2, price: 14 },
    { name: 'Pen 4', quantity: 1, price: 19 },
  ];
  sum=0
  b=p.reduce((e,i)=>{ v=i.price*i.quantity
    sum+=v
    return sum },0)
  console.log(b);