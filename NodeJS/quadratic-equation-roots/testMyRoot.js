var rootQuad = require('./QuadEqu'); //use the module QuadEqu

var value = rootQuad.roots(1,3,4); //envoke the root function in QuadEqu

//print output to console
console.log("First root is: " + value[0] + "\n and \nSecond root is: " + value[1]);
