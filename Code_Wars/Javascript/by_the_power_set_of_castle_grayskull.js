// Description: http://www.codewars.com/kata/53d3173cf4eb7605c10001a8
//
// Write a function that returns all of the sublists of a list or Array.
//
// Your function should be pure; it cannot modify its input.
//
// Example:
//
// power([1,2,3]);
// // => [[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
// For more details regarding this, see the power set entry in wikipedia.

//VERSION 2
function power(set) {
  return set.reduce(function(previous,current){
    return previous.concat(
      previous.map(function(sublist){
        return sublist.concat(current);
      })
     );
  }, [[]]);
}

//VERSION 1
// function power(s) {
//   var result = [[]];
//   for(var i=0; i<s.length; i++){
//     var len = result.length
//     for(var k=0; k < len; k++){
//       result.push(result[k].concat(s[i]));
//     }
//   }
//   return result;
// }
