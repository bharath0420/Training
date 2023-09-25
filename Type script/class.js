"use strict";
class Myclass {
    get val() {
        _val: number = 1;
        console.log("this getter");
        console.log(_val);
        return this._val;
    }
    set val(a) {
        console.log("this setter");
        this._val = a;
    }
    constructor() {
        this.b = 2;
        this.c = 3; // readonly 
        this._val = "asa"; // _val is private variable     _ is used to denote private variable 
        // this.a=2
        this.c = 20; // readonly can change in constructor 
        //this.val="hi"
    }
}
let o = new Myclass();
console.log(o.val);
console.log(o.b, o.c);
o.a = 5; //
o.b = 10;
// o.c=20
console.log(o.a, o.b, o.c);
console.log(o._val);
o.val = "20";
console.log(o.val);
