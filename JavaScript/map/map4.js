/* Write a function that takes a string and returns an object where the keys are the characters in the string and 
the values are the number of times each character appears in the string. Use the Map object to accomplish this. */
function charObj(s){
    s=s.toUpperCase();
    ch=s.split('');
    ob={};
    for(let i=0;i<ch.length;i++){
        let x=ch[i]
        let count=0
        
        for(let j=0;j<ch.length;j++){
            if(ch[i]==ch[j]){
                count++
            }
        }
        ob[x]=count

    }
    return ob;
    
}
a=['bharath','rama']
s=a.map(e=>charObj(e))
console.log(s)