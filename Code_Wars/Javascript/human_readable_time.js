// Description: http://www.codewars.com/kata/52685f7382004e774f0001f7
//
// Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)
//
// HH = hours, padded to 2 digits, range: 00 - 99
// MM = minutes, padded to 2 digits, range: 00 - 59
// SS = seconds, padded to 2 digits, range: 00 - 59
// The maximum time never exceeds 359999 (99:59:59)
//
// You can find some examples in the test fixtures

//VERSION 2
function humanReadable(seconds) {
  var format=function(x){ return x < 10 ? '0'+x : x ;}
  return format( parseInt(seconds / 3600)) + ':' +
          format( parseInt(seconds / 60 % 60)) + ':' +
            format( seconds % 60);
}

// VERSION 1
function humanReadable(seconds) {
  var s = seconds > 59 ? seconds % 60 : seconds;
  var m = (seconds-=s) >= 60 ? (seconds / 60) % 60 : 0;
  var h = (seconds-=(60*m)) >= 3600 ? seconds / 3600 : 0;

  return (h < 10 ? '0'+h:h) + ':' + (m < 10 ? '0'+m:m) + ':' + (s < 10 ? '0'+s:s);
}
