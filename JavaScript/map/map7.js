/* Write a function that takes an array of numbers and returns an object where the keys are 
the numbers and the values are arrays of their prime factors. 
Use the Map object to accomplish this. */
var x=[9,4,8,12,56]


function primeFact(num) {
    function is_prime(num) {
      for (let i = 2; i <= Math.sqrt(num); i++)
      {
        if (num % i === 0) return false;
      }
      return true;
    }
    const result = [];
    for (let i = 2; i <= num; i++)
    {
      while (is_prime(i) && num % i === 0) 
      {
        if (!result.includes(i)) result.push(i);
        num /= i;
      }
    }
    return result;
  }


  function num(y){
    ob={}
    z=y
    ob[z]=[]
    a=primeFact(z)
    for(let i=0;i<a.length;i++){ob[z].push(a[i])}
    return ob
 
}
a=x.map(e=>num(e))
console.log(a)
  