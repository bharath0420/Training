/* //   2.Write a function that takes an array of objects with a 
name property and returns a new array of strings with the name of each object capitalized. 
Use the Map object to accomplish this.  */
s=[
    {
      'name':"bharath"
    },
  {
      'name':"kavin"
    },
  {
      'name':"bharathi"
    },{
      'name':"dinesh"
    },
  {
      'name':"giri"
    }
  ]
  news=s.map(e=>{ a={}; a.name=e.name.toUpperCase(); return a })
  console.log(news)
  console.log(s)
  
