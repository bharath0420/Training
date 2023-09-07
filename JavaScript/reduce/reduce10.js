/* Write a function that takes an array of objects with a category property and 
returns an object where the keys are the categories, and the values are the total cost of all the objects with that category
 Use the reduce method to accomplish this.*/
 n=[
    {category:"fruits",price:50},
    {category:"fruits",price:40},
    {category:"vegetables",price:120},
    {category:"fruits",price:40},
    {category:"vegetables",price:100}
]
y=n.reduce((e,i)=> {
    if(i.category == "fruits")
       return e+i.price;
    else
       return e;
},0)
console.log(y);