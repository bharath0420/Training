/* // Write a program that will check if two strings are palindromes. A palindrome is a word that spells the same forward and backward.
Palindrome: a word, phrase, or sequence that reads the same backward as */
str=['madam','thinkpad']
c=[]
str.forEach(e=>{
    if(e==e.split('').reverse().join('')){
    c.push("palindrome")
}else{
   c.push(" not palindrome")}
})
console.log(c)