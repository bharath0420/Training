/* Write a function that takes an array of objects with a name and age property and 
returns a new array with only the objects where the age is greater than a given age.
 Use the filter method to accomplish this. */
 s=[
    {
      'name':"ram",
      'age':25
    },
    {
      'name':"alice",
      'age':30
    },
    {
      'name':"ben",
      'age':22
    },
    {
      'name':"barath",
      'age':25
    },
    {
      'name':"walter",
      'age':30
    }
  ]
  y=s.filter(e=>e.age<30)
    console.log(y)