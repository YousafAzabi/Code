//module to calcualte the roots of a Quadratic Equation
exports.roots = function(a, b, c) {
  var sqrt = Math.pow(b,2) - (4 * a * c); //calculate the value under square-root
  var term1 = (-b) / (2 * a);
  var term2 = Math.sqrt(Math.abs(sqrt)) / (2 * a);

  if (sqrt < 0) { // check if sqaure-root is negative
    return [term1 + ' + i ' + term2, term1 + ' - i ' + term2]; //return complex roots
  }
  
  return [(term1 + term2), (term1 - term2)]; //return real number roots
};
