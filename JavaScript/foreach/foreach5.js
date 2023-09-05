// Given a string change the every second letter to an uppercase ‘Z’. Assume there are no space.
str='uppercase'
 str=str.toUpperCase();
ch=str.split('');
res=[]
ch.forEach((e,i)=>{if(i%2!=0){
    ch[i]='Z'
}res.push(ch[i])
})
console.log(res)