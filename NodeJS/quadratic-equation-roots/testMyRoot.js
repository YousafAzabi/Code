var rootQuad = require('./QuadEqu'); //use the module QuadEqu
let a = 1, b = 4, c = 3;

try{
  value = rootQuad.roots(a,b,c);
  console.log("\n\t***** The roots for the equation are: *****\n")
  console.log("First root is:\t" + value[0] + "\nSecond root is:\t" + value[1]);
} catch (e){
  console.log('Error: "a" cannot be 0.');
}
