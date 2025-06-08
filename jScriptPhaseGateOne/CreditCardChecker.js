const prompt = require('prompt-sync')();

const cardNum = prompt("Enter card number: ");

let numbers = new Array(cardNum.length);
for (let ccIndex = 0; ccIndex < cardNum.length; ccIndex++){
numbers[ccIndex] = parseInt(cardNum.charAt(ccIndex));
}

let total = 0;
let length = cardNum.length;

for (let ccIndex = length - 1; ccIndex >= 0; ccIndex--){
let number = numbers[ccIndex];

if ((length - 1 - ccIndex) % 2 === 0){ // Every second number from right
number = number * 2;
if (number > 9){
number = Math.floor(number / 10) + (number % 10); // Add the two numbers if it's over 9
}
}
total = total + number;
}

let cardType = "Invalid Card";
if (numbers[0] === 4) cardType = "Visa";
else if (numbers[0] === 5) cardType = "MasterCard";
else if (numbers[0] === 3) cardType = "American Express";
else if (numbers[0] === 6) cardType = "Discover";

let validity = "Invalid";
if (total % 10 === 0) {validity = "Valid";
}

console.log("Credit Card Type: " + cardType);
console.log("Credit Card Number: " + cardNum);
console.log("Credit Card Digit Length: " + length);
console.log("Credit Card Validity Status: " + validity);