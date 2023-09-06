/* Write a function that takes an array of objects with a name and age property and returns an object where the keys are the age and the values are arrays of objects with that age.
 Use the Map object to accomplish this. */
 s=[
    {
      'name':"ram",
      'age':'25'
    },
    {
      'name':"alice",
      'age':'30'
    },
    {
      'name':"ben",
      'age':'22'
    },
    {
      'name':"barath",
      'age':'25'
    },
    {
      'name':"walter",
      'age':'30'
    }
  ]
  function age(y){
    ob={}
    x=y
    ob[x]=[]
    for(let i=0;i<s.length;i++){
        if(x==s[i].age)
    {  // ob[x]=s.name
       ob[x].push(s[i].name)
       
    }
}

    
   

    
    return ob
  }
  
 var dist = [];
for (let i = 0; i < s.length; i++) {
  if (!dist.includes(s[i].age))
    dist.push(s[i].age);
}
a=dist.map(e=>age(e))
console.log(a)