/* Write a function that takes an array of strings and returns a new array with only the unique strings.
 Use the Map object to accomplish this. */
 a=['ben','tom','joe','ross','ben','ron','russ','joe']
 var dist = [];
 a.map(e=>{
    
      if (!dist.includes(e))
        dist.push(e);}
    )
    // console.log('original',a)
    console.log(dist)