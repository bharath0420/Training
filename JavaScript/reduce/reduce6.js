/*  Write a function that takes an array of objects with a name and age property and 
returns the average age of all the objects.
 Use the reduce method to accomplish this.*/
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
  sum=s.reduce((e,i)=>{return e+i.age },0)
  av=sum/s.length;

  console.log(av);
