import java.util.Scanner;

public class CreditCardChecker{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter card number: ");
String cardNum = input.nextLine();

        
int[] numbers = new int[cardNum.length()];
for (int ccIndex = 0; ccIndex < cardNum.length(); ccIndex++){
numbers[ccIndex] = cardNum.charAt(ccIndex) - '0';
}

int total = 0;
int length = cardNum.length();

for (int ccIndex = length - 1; ccIndex >= 0; ccIndex--){
int number = numbers[ccIndex];

if ((length - 1 - ccIndex) % 2 == 0){ // Every second number from right
number = number * 2;
if (number > 9){
number = (number / 10) + (number % 10); // Add the two numbers if it's over 9
}
}
total = total + number;
}

      
String cardType = "Invalid Card";
if (numbers[0] == 4) cardType = "Visa";
else if (numbers[0] == 5) cardType = "MasterCard";
else if (numbers[0] == 3) cardType = "American Express";
else if (numbers[0] == 6) cardType = "Discover";

        
String validity = "Invalid";
if (total % 10 == 0){
validity = "Valid";
}

        
System.out.println("Credit Card Type: " + cardType);
System.out.println("Credit Card Number: " + cardNum);
System.out.println("Credit Card Digit Length: " + length);
System.out.println("Credit Card Validity Status: " + validity);

input.close();
}
}
