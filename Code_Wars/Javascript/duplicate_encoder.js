// Description: http://www.codewars.com/kata/54b42f9314d9229fd6000d9c
//
// The goal of this exercise is to convert a string to a new string where each character in the new string is '(' if that character appears only once in the original string, or ')' if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.
//
// Examples:
//
// "din" => "((("
//
// "recede" => "()()()"
//
// "Success" => ")())())"
//
// "(( @" => "))(("

function duplicateEncode(word){
   var result = '';
   for(var i in word){ isUnique(word[i].toLowerCase(),word.toLowerCase()) ? result +=')' :  result += '('; }
   return result;
}
function isUnique(char, str){ return str.lastIndexOf(char) !== str.indexOf(char); }
