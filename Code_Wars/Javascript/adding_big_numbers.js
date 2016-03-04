// Description: http://www.codewars.com/kata/525f4206b73515bffb000b21
//
// We need to sum big numbers and we require your help.
//
// Write a function that returns the sum of two numbers.
//  The input numbers are strings and the function must return a string.
//
// Example
//
// add("123", "321"); -> "444"
// add("11", "99"); -> "110"
// Notes
//
// The input numbers are big.
// The input is a string of only digits
// The numbers are positives

function add(a, b) {
  a = a.split('').reverse();
  b = b.split('').reverse();
  var result = [], carry = 0, max = Math.max(a.length, b.length);
  for(var i=0; i<max; i++){
    var temp = parseInt(a[i] || 0) + parseInt(b[i] || 0) + carry
    result[i] = temp % 10;
    carry = (temp - result[i]) / 10;
  }
  if(carry){ result.push(carry); }

  return result.reverse().join('');
}
