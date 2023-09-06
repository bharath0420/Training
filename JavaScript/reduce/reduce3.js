/* Write a function that takes an array of numbers and returns the average of all the numbers. 
Use the reduce method to accomplish this. */
arr=[2,4,6,3,7,21]

 sum=arr.reduce((e,i)=>{return e+i })
 av=sum/arr.length
 console.log(av);