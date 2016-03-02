// Description:
//
// Write a function called LCS that accepts two sequences, and returns the longest subsequence common to the passed in sequences.
//
// Subsequence
//
// A subsequence is different from a substring. The terms of a subsequence need not be consecutive terms of the original sequence.
//
// Example subsequence
//
// Subsequences of "abc" = "a", "b", "c", "ab", "ac", "bc"
//
// LCS examples
//
// LCS( "abcdef" , "abc" ) => returns "abc"
// LCS( "abcdef" , "acf" ) => returns "acf"
// LCS( "132535365" , "123456789" ) => returns "12356"
// Notes
//
// Both arguments will be strings
// Return value must be a string
// Return an empty string if there exists no common subsequence
// Both arguments will have one or more characters (in JavaScript)
// All tests will only have a single longest common subsequence. Don't worry about cases such as LCS( "1234", "3412" ), which would have two possible longest common subsequences: "12" and "34".
// Note that the Haskell variant will use randomized testing, but any longest common subsequence will be valid.

function LCS(x, y) {
  if (x.length === 0 || y.length === 0) {
    return '';
  }
  else if (x[x.length - 1] === y[y.length - 1]) {
    return LCS(sub(x), sub(y)) + x[x.length - 1];
  }
  else {
    var a = LCS(x, sub(y)), b = LCS(sub(x), y);
    return (a.length > b.length) ? a : b;
  }
}
var sub = (s) => s.substr(0, s.length-1);
