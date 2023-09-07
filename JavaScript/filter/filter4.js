/* Write a function that takes an array of objects with a category property and returns a new array with 
only the unique categories.
 Use the filter and map methods to accomplish this. */
 s=[
    {name:'tomoto',  category:'vegetable'},
    {name:'apple',   category:'fruit'},
    {name:'orange',  category:'fruit'},
    {name:'beetroot',category:'vegetable'},
    {name:'brinjal', category:'vegetable'}
    ]
    y=s.filter(e=>e.category=='vegetable')
    console.log(y)