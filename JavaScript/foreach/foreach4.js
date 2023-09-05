/* //Given two arrays of integers. Add up each element in the same position and
create a new array containing the sum of each pair. Assume both arrays are of the same length. */
a=[1,4,3,6,8,9,3]
b=[5,7,2,9,1,8,2]

c=[]
b.forEach((e,i)=>{
    
 c.push(a[i]+e)})

console.log(c)