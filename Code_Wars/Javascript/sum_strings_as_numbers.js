// Description:
//
// Given the string representations of two integers, return the string
//  representation of the sum of those integers.
//
// For example:
//
// sumStrings('1','2') // => '3'
// C# sumStrings("1","2") // => "3"
//
// A string representation of an integer will contain no characters besides
//  the ten numerals "0" to "9".

function sumStrings(a,b) {
  var result = [], carry = 0;
  a = a.replace(/^0+/, '').split('');
  b = b.replace(/^0+/, '').split('');

  while( a.length || b.length || carry ){
    carry += ~~a.pop() + ~~b.pop();
    result.push(carry % 10);
    carry = carry > 9;
  }

  return result.reverse().join('');
}

//***VERSION 1***
// function sumStrings(a,b) {
//   a = a.replace(/^0+/, '').split('').reverse();
//   b = b.replace(/^0+/, '').split('').reverse();
//   var result = [], carry = 0, max = Math.max(a.length, b.length);
//
//   for( var i=0; i<max; i++){
//     var temp = parseInt(a[i] || 0) + parseInt(b[i]  || 0) + carry;
//     result.push(temp % 10);
//     carry = (temp-result[i]) / 10;
//   }
//
//   if( carry ) { result.push(carry); }
//
//   return result.reverse().join('');
// }
