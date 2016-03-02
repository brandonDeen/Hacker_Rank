// Description: http://www.codewars.com/kata/525d8c20915a399b5600087b
//
// In this kata you have to extend the dictionary with a method, that returns a list of words matching a pattern. This pattern may contain letters (lowercase) and placeholders ("?"). A placeholder stands for exactly one arbitrary letter.
//
// Example:
//
// var fruits = new Dictionary(['banana', 'apple', 'papaya', 'cherry']);
// fruits.getMatchingWords('lemon');     // must return []
// fruits.getMatchingWords('cherr??');   // must return []
// fruits.getMatchingWords('?a?a?a');    // must return ['banana', 'papaya']
// fruits.getMatchingWords('??????');    // must return ['banana', 'papaya', 'cherry']
// Additional Notes:
//
// the words and patterns are all lowercase
// the order of the returned words doesn't matter

//VERSION 3
function Dictionary(words) {
  this.words = words;
}

Dictionary.prototype.getMatchingWords = function(pattern) {
  pattern = new RegExp('^' + pattern.replace(/\?/g, '.') + '$');
  return this.words.filter((value) => value.match(pattern));
}

//VERSION 2
// function Dictionary(words) {
//   this.words = words;
// }
//
// Dictionary.prototype.getMatchingWords = function(pattern) {
//   pattern = pattern.replace(new RegExp(/\?/g), '.');
//   return this.words.filter((value) => value.match(pattern) && value.length == pattern.length);
// }

//VERSION 1
// function Dictionary(words) {
//   this.words = words;
// }
//
// Dictionary.prototype.getMatchingWords = function(pattern) {
//   var result = [];
//   for(var w in this.words){
//     this.words[w].search(new RegExp(pattern.replace(/\?/g, '.'))) == -1
//     || pattern.length != this.words[w].length
//       ?
//         '' : result.push(this.words[w]); }
//   return result;
// }
