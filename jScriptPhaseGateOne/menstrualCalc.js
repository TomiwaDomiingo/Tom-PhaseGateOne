const prompt = require('prompt-sync')();

let validInput = false

while (!validInput){
let lastPeriodDay = parseInt(prompt("Hi, what day of the month did your last period start?: "))

if (lastPeriodDay < 1 || lastPeriodDay > 31){
console.log("Day isn’t valid! Pick a number between 1 and 31.")
continue
}

let cycleLength = parseInt(prompt("How long is your cycle usually?: "))

let flowDuration = parseInt(prompt("How many days does your period last?: "))

if (cycleLength <= 0 || flowDuration <= 0){
console.log("cycle length and flow duration can’t be zero or negative.")
continue
}

validInput = true


 // If period starts on day 1 and lasts 5 days, it ends on day 5
let flowEndDay = lastPeriodDay + flowDuration - 1

 // If last period was on day 1 and cycle length is 28, next period is on day 29
let nextPeriodDay = lastPeriodDay + cycleLength

 // Ovulation is 14 days before the next period
let ovulationDay = nextPeriodDay - 14


 // Fertile window is 4 days before ovulation to 2 days after
let fertileStartDay = ovulationDay - 4
let fertileEndDay = ovulationDay + 2

 // Safe period 1: From the end of the flow to the start of the fertile window
let safePeriod1Start = flowEndDay + 1 // Day after flow ends
let safePeriod1End = fertileStartDay - 1 // Day before fertile window starts

let safePeriod2Start = fertileEndDay + 1 // Day after fertile window ends
let safePeriod2End = nextPeriodDay - 1 // Day before next period starts

console.log("Here’s your cycle info:")
console.log("Your last flow was: Day " + lastPeriodDay + " to Day " + flowEndDay)
console.log("Your next period starts on: Day " + nextPeriodDay)
console.log("Ovulation date: Day " + ovulationDay)
console.log("Fertile window: Day " + fertileStartDay + " to Day " + fertileEndDay)
console.log("Safe periods: Day " + safePeriod1Start + " to Day " + safePeriod1End + " and Day " + safePeriod2Start + " to Day " + safePeriod2End)
    
}