/* Write a function that takes an array of objects with a category property and returns an object where the keys are the categories, and 
the values are arrays of objects with that category. Use map  */
s=[
    {
      'name':"tomato",
      'category':'veg'
    },
    {
      'name':"apple",
      'category':'fruit'
    },
    {
      'name':"cucumber",
      'category':'veg'
    },
    {
      'name':"broccoli",
      'category':'veg'
    },
    {
      'name':"watermelon",
      'category':'fruit'
    }
  ]
  function category(y){
    ob={}
    x=y
    ob[x]=[]
    for(let i=0;i<s.length;i++){
        if(x==s[i].category)
      { // ob[x]=s.name
       ob[x].push(s[i].name)
      }
    }
    return ob
  }
 
  var dist = [];
for (let i = 0; i < s.length; i++) {
  if (!dist.includes(s[i].category))
    dist.push(s[i].category);
}
a=dist.map(e=>category(e))
// console.log(dist);
console.log(a)
