/* 
var num1:number;
var num2:number=2;
var num3=3;
var num4=num3+100;
var str1=num1+'some ';
var nothappy:number=num1+'some '
console.log(num1);
console.log(num2)
console.log(num3);
console.log(num4);
console.log(str1);
console.log(nothappy);  */
var x:number=2;
let y:string='hello world';
let z:boolean=true;
console.log(x,y,z);
let x1:number|string='bharath';  // UNION 
console.log(typeof(x1));
//object 
let a1:{ name:string ;
    
    age:number;}//declaration
    a1={
        name:'bharath',
        age:23
    }           //assingment 
console.log(a1);
a1.age=25     // updation of age
console.log(a1);
// array of object
let a2:{ name:string ;
    
    age:number;}[] =[{
        name:'bharath',
        age:23
    } ]      // declaration & assingment
a2[1]={
    name:'vivi',
    age:23
} 
console.log(a2);// updation of array of object
a2.push({
    name:'zoro',
    age:23
} )             
console.log(a2)// pushing a new object into the array of object
