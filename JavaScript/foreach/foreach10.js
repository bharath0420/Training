/* Write a program that finds the summation of every number from 1 to num. 
The number will always be a positive integer greater than 0. */
a=[2,4,1,7,9]
function sum(n){if (n == 1)    
    return 1;  
    else
    return(n + sum(n-1))}
c=[]
    a.forEach(e=>{  
        return c.push(sum(e))
       
    })
        console.log(c)
