cardNum = input("Enter card number: ")

numbers = []
for ccIndex in range(len(cardNum)):
    numbers.append(int(cardNum[ccIndex]))

total = 0
length = len(cardNum)

# loop through each number from right to left
for ccIndex in range(length - 1, -1, -1):
    number = numbers[ccIndex]

    if (length - 1 - ccIndex) % 2 == 0: # Every second number from right
        number = number * 2
        if number > 9:
           number = (number // 10) + (number % 10) # Add the two numbers if double is over 9
    total = total + number


cardType = "Invalid Card"
if numbers[0] == 4: cardType = "Visa"
elif numbers[0] == 5: cardType = "MasterCard"
elif numbers[0] == 3: cardType = "American Express"
elif numbers[0] == 6: cardType = "Discover"

validity = "Invalid"
if total % 10 == 0:
	validity = "Valid"


print("Credit Card Type: " + cardType)
print("Credit Card Number: " + cardNum)
print("Credit Card Digit Length: " + str(length))
print("Credit Card Validity Status: " + validity)