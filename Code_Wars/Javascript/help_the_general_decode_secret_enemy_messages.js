// Description:
//
// General Patron is faced with a problem , his intelligence
//  has intercepted some secret messages from the enemy but
//  they are all encrypted. Those messages are crutial to
//  getting the jump on the enemy and winning the war. Luckily
//  intelligence also captured an encoding device as well. However
//  even the smartest programmers weren't able to crack it though.
//  So the general is asking you , his most odd but brilliant programmer.
//
// We think if you keep on this trail you should be able to crack the code!
//  You are expected to fill in the device.decode function Good luck !
//  General Patron is counting on you!


device.decode = function (w) {
  var alphabet = 'abcdefghijklmnopqrstuvwxyz' +
                 'ABCDEFGHIJKLMNOPQRSTUVWXYZ' +
                 '0123456789.,? ';
  return w.replace(/./g, function(current, index){
    var code = alphabet.indexOf(current)+1;
    while (index-- >= 0){ code = code%2 ? (code+67)/2 : code/2 };
    return code ? alphabet[code-1] : current;
  });
}
