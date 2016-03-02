// Description: http://www.codewars.com/kata/52e1476c8147a7547a000811
//
// You need to write regex that will validate a password to make sure it meets the follwing criteria:
//
  // At least six characters long
  // contains a lowercase letter
  // contains an uppercase letter
  // contains a number
// Valid passwords will only be alphanumeric characters.

function validate(password) {
  return (/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{6,}$/).test(password);
}

//
//At least six characters long    -> {6,}
//contains a lowercase letter     -> [a-z]+
//contains an uppercase letter    -> [A-Z]+
//contains a number               -> /d+



//***** NOT MY SOLUTION, but I really like how it was done****
// function validate(password) {
//   return  /^[A-Za-z0-9]{6,}$/.test(password) &&
//           /[A-Z]+/           .test(password) &&
//           /[a-z]+/           .test(password) &&
//           /[0-9]+/           .test(password) ;
// }
