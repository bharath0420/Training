//Given a number n Calculate the factorial of the number
a=[3,5,7,8,9]
c=[]

function  fin( n){    
    if (n == 0)    
      return 1;    
    else    
      return(n * fin(n-1))}; 
a.forEach(e=>{  
    return c.push(fin(e))
   
})
    console.log(c)