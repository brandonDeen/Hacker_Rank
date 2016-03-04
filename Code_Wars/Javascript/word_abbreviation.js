// Description: http://www.codewars.com/kata/5375f921003bf62192000746
//
// The word i18n is a common abbreviation of internationalization the developer community use instead of typing the whole word and trying to spell it correctly. Similarly, a11y is an abbreviation of accessibility.
//
// Write a function that takes a string and turns any and all words within that string of length 4 or greater into an abbreviation following the same rules.
//
// Notes:
//
// A "word" is a sequence of alphabetical characters. By this definition, any other character like a space or hyphen (eg. "elephant-ride") will split up a series of letters into two words (eg. "elephant" and "ride").
// The abbreviated version of the word should have the first letter, then the number of removed characters, then the last letter (eg. "e6t-r2e").

function abbreviate(string) {
  var result = [];
  var words = string.split(' ');
  for(var w in words){
    result.push(
      words[w].length < 4 ?
        words[w] : words[w].indexOf('-') == -1 ?
          newString(words[w]) : newStringHyphen(words[w].split('-') ));
  }
  return result.join(' ');
}
function newString(s){
  return s.indexOf(',') == -1 ? s[0] + (s.length-2) + s[s.length-1] : s[0] + (s.length-3) + s[s.length-2] + ',';
}
function newStringHyphen(s){
  var result = [];
  for(var i in s){ result.push(newString(s[i])); }
  return result.join('-');
}
