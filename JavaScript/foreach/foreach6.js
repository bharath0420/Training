// Check if a string contains the letter “y”. Print “yes” if it does and “no” if it does not.
str='array of system'
 str=str.toUpperCase();
ch=str.split('');
res=0
ch.forEach((e,i)=>{if(ch[i]=='Y'){res++}  } )
if(res==0)
{console.log('no')}
else{console.log("yes")}