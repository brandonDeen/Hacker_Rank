// Description:
//
// Given an array of positive or negative integers
//
// I= [i1,..,in]
//
// you have to produce a sorted array P of the form
//
// [ [p, sum of all ij of I for which p is a prime factor
//  (p positive) of ij] ...]
//
// P will be sorted by increasing order of the prime numbers.
//  The final result has to be given as a string in Java or C#
//  and as an array of arrays in other languages.
//
// Example:
//
// I = [12, 15]
// result = [[2, 12], [3, 27], [5, 15]]
// [2, 3, 5] is the list of all prime factors of the elements of I,
//  hence the result.
//
// Note: It can happen that a sum is 0 if some numbers are negative!
//
// Example: I = [15, 30, -45] 5 divides 15, 30 and (-45) so 5 appears
//  in the result, the sum of the numbers for which 5 is a factor is
//  0 so we have [5, 0] in the result amongst others.

function sumOfDivided(lst) {
  var max = Math.max.apply(null, lst.map(Math.abs)), //max abs value in lst
      primes = [],
      composites = [max+1]; //non prime numbers

  if(lst.length > 0){
    for(var i = 2; i <= max; i++) {
      if( !composites[i] ){
        var sum = 0, isFactor = false;

        lst.forEach(function(n) {
          if(n % i == 0) {
            sum += n;
            isFactor = true;
          }
        });
        if(isFactor){ primes.push([i, sum]); } //its prime and its a factor
        for(var j = 2*i; j <= max; j += i) { composites[j] = true; } //multiples of the prime
      }
    }
  }
  return primes;
}
