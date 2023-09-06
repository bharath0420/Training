/* Write a function that takes an array of strings and returns an object where 
the keys are the strings, and the values are the number of times each string appears in the array. 
Use the reduce method to accomplish this. */
a=['ben','tom','joe','ross','ben','ron','russ','joe']
b=[]
b.push(a.reduce((e,ob)=>{ ob={}
    x=e
    ob[x]=[]
    c=1
    for(let i=0;i<a.length;i++){
        if(x==a[i])
    {  c++
       ob[x].push(c)
       
    }
}
}))
console.log(b);
