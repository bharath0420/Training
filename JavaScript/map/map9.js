/* Write a function that takes an array of strings and returns an object where 
the keys are the strings sorted alphabetically and the values are arrays of the original strings that are anagrams of 
each other. Use the Map object to accomplish this. */
str = ["cat", "dog", "tac", "god", "act"];
var dist = [];
for (let i = 0; i < str.length; i++) {
    sort = str[i].split('').sort().join('');

  if (!dist.includes(sort))
    dist.push(sort);
}

function anagram(y){
    ob={}
    x=y
    ob[x]=[]
    for(let i=0;i<str.length;i++){
        if(x===str[i].split('').sort().join(''))
    {  // ob[x]=s.name
       ob[x].push(str[i])
       
    }
}
return ob
  }
  a=dist.map(e=>anagram(e))
// console.log(dist);
console.log(a)
/* output
[ { act: [ 'cat', 'tac', 'act' ] }, { dgo: [ 'dog', 'god' ] } ] */