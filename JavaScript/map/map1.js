/*//   1 . Write a function that takes an array of numbers and returns
 a new array with each number squared. Use the Map object to accomplish this. */
a=[2,3,5,6,7,8,9]
x=a.map(e=>{ sq=[];
    sq=Math.pow(e, 2); return sq})
console.log(x)  