// Description:
//
// Create a find function that takes a string and an array. If the string is in the array, return true.
//
// For example:
//
// find("hello", ["bye bye","hello"]) // return true
// find("anything", ["bye bye","hello"]) // return false
// Note: Hello != hello, case-sensitive.

var find = function(string, array) {
  return array.indexOf(string) >= 0;
};
