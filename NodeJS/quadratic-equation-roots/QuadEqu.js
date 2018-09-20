//module to calcualte the roots of a Quadratic Equation
exports.roots = function(a, b, c) {
  if(a == 0) {
    throw "ERROR: coefficient of quadratic term cannot be 0.";
  }
  let sqrt = Math.pow(b, 2) - (4 * a * c); //calculate the value under square-root
  let term1 = (-b) / (2 * a);
  let term2 = Math.sqrt(Math.abs(sqrt)) / (2 * a);

  if (sqrt < 0) { // check if sqaure-root is negative
    return [term1 + ' + ' + term2 + ' j ' , term1 + ' - ' + term2 + ' j ' ]; //return complex roots
  }
  return [(term1 + term2), (term1 - term2)]; //return real number roots
};
