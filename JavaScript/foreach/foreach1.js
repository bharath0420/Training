/* Get the sum of two arrays…actually the sum of all their elements.P.S. 
Each array includes only integer numbers. Output is a number too. */
a=[1,4,3,6,8,9,3]
b=[5,7,2,9,1,8,2]
sum=0
a.forEach(e=>{sum+=e})
b.forEach(e=>{sum+=e})
console.log(sum)