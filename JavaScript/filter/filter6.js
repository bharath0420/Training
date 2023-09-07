/* Write a function that takes an array of objects with a name and hobbies property and 
returns a new array with only the objects where the hobbies include a given hobby.
 Use the filter method to accomplish this. */
 s=[
    {
      'name':"ram",
      'hobbies':'movie watching'
    },
    {
      'name':"alice",
      'hobbies':'cooking'
    },
    {
      'name':"ben",
      'hobbies':'music'
    },
    {
      'name':"barath",
      'hobbies':'movie watching'
    },
    {
      'name':"walter",
      'hobbies':'cooking'
    }
  ]
  y=s.filter(e=>e.hobbies=='cooking')
    console.log(y)