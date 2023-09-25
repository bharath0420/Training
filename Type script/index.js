"use strict";
// let a=1
let a = 'aaa';
console.log(a);
class DEMO {
    constructor() {
        this.i = 1;
        this.j = 23;
    }
    incmt() {
        return this.i++;
    }
}
let ob = new DEMO();
console.log(ob.i);
console.log(ob.incmt());
console.log(ob.i);
