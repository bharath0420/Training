/*  Write a function that takes an array of objects with a name and grades property 
and returns a new array with only the objects where the average grade is greater than a given amount. 
Use the filter method to accomplish this.*/
s=[
    {
      'name':"ram",
      'grade':87
    },
    {
      'name':"alice",
      'grade':90
    },
    {
      'name':"ben",
      'grade':72
    },
    {
      'name':"barath",
      'grade':65
    },
    {
      'name':"walter",
      'grade':30
    }
  ]
  y=s.filter(e=>e.grade<70)
    console.log(y)