class Myclass{
 a!:number ;  //not null assertions
 b:number=2;
 readonly c:number=3; // readonly 
_val:string = "asa"// _val is private variable     _ is used to denote private variable 
 get val():string{
    
    _val:number=1;
    console.log("this getter");
    console.log(_val)
    return this._val
 }
 set val(a:string){
    console.log("this setter");
    
    this._val=a
 }
    constructor(){
    // this.a=2
    this.c=20;// readonly can change in constructor 
   //this.val="hi"
    }
}
let o=new Myclass()
console.log(o.val);
console.log(o.b,o.c);
o.a=5//
o.b=10
// o.c=20
console.log(o.a,o.b,o.c);
console.log(o._val);

o.val="20"
console.log(o.val);




