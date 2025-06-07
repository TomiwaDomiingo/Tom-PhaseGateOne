import java.util.Scanner;

public class MenstrualApp{
public static void main(String[] args){
 
Scanner userInput = new Scanner(System.in);
boolean validInput = false;



        
while (!validInput){
            
System.out.println("Hello, what day of the month did your last period start?");
int lastPeriodDay = userInput.nextInt();

            
if (lastPeriodDay < 1 || lastPeriodDay > 31){
System.out.println("Date not valid! Pick a number between 1 and 31.");
continue;
}

            
System.out.println("How long is your cycle usually?");
int cycleLength = userInput.nextInt();

        
System.out.println("How many days does your period last? (Like, 5 days?)");
int flowDuration = userInput.nextInt();

           
if (cycleLength <= 0 || flowDuration <= 0){
System.out.println("Hey, cycle length and flow duration can’t be zero or negative! Try again.");
userInput.nextLine(); 
continue; 
}

            
validInput = true;

            // Calculate the flow end day
            // If period starts on day 1 and lasts 5 days, it ends on day 5
int flowEndDay = lastPeriodDay + flowDuration - 1; // Subtract 1 because the start day counts as day 1

            // Calculate the next period day
            // If last period was on day 1 and cycle length is 28, next period is on day 29
int nextPeriodDay = lastPeriodDay + cycleLength;

            // Calculate the ovulation day
            // Ovulation is 14 days before the next period
int ovulationDay = nextPeriodDay - 14;

            // Calculate the fertile window
            // Fertile window is 4 days before ovulation to 2 days after
int fertileStartDay = ovulationDay - 4;
int fertileEndDay = ovulationDay + 2;

            // Calculate the safe periods
            // Safe period 1: From the end of the flow to the start of the fertile window
int safePeriod1Start = flowEndDay + 1; // Day after flow ends
int safePeriod1End = fertileStartDay - 1; // Day before fertile window starts

            // Safe period 2: From the end of the fertile window to the day before the next period
int safePeriod2Start = fertileEndDay + 1; // Day after fertile window ends
int safePeriod2End = nextPeriodDay - 1; // Day before next period starts

           
System.out.println("\nHere’s your cycle info: ");
System.out.println("Your last flow was: Day " + lastPeriodDay + " to Day " + flowEndDay);
System.out.println("Your next period starts on: Day " + nextPeriodDay);
System.out.println("Ovulation date: Day " + ovulationDay);
System.out.println("Fertile window: Day " + fertileStartDay + " to Day " + fertileEndDay);
System.out.println("Safe periods: Day " + safePeriod1Start + " to Day " + safePeriod1End + " and Day " + safePeriod2Start + " to Day " + safePeriod2End);
}

        
userInput.close();
}
}
