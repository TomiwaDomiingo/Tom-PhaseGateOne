valid_input = False


while valid_input == False:
    last_period_day = int(input("Hi, what day of the month did your last period start?: "))
    
   
    if last_period_day < 1 or last_period_day > 31:
        print("Day isn’t valid! Pick a number between 1 and 31.")
        continue
    
    cycle_length = int(input("How long does your cycle last: "))
    
    flow_duration = int(input("How many days does your period last?: "))
    
   
    if cycle_length <= 0 or flow_duration <= 0:
        print("cycle length and flow duration can’t be zero or negative.")
        continue
    
    valid_input = True

# If period starts on day 1 and lasts 5 days, it ends on day 5
flow_end_day = last_period_day + flow_duration - 1

# If last period was on day 1 and cycle length is 28, next period is on day 29
next_period_day = last_period_day + cycle_length

# Ovulation is 14 days before the next period
ovulation_day = next_period_day - 14

# Fertile window is 4 days before ovulation to 2 days after
fertile_start_day = ovulation_day - 4
fertile_end_day = ovulation_day + 2

# From the end of the flow to the start of the fertile window
safe_period1_start = flow_end_day + 1 # Day after flow ends
safe_period1_end = fertile_start_day - 1 # Day before fertile window starts

# From the end of the fertile window to the day before the next period
safe_period2_start = fertile_end_day + 1 # Day after fertile window ends
safe_period2_end = next_period_day - 1 # Day before next period starts

print("Here’s your cycle info:")
print("Your last flow was: Day " + str(last_period_day) + " to Day " + str(flow_end_day))
print("Your next period starts on: Day " + str(next_period_day))
print("Ovulation date: Day " + str(ovulation_day))
print("Fertile window: Day " + str(fertile_start_day) + " to Day " + str(fertile_end_day))
print("Safe periods: Day " + str(safe_period1_start) + " to Day " + str(safe_period1_end) + " and Day " + str(safe_period2_start) + " to Day " + str(safe_period2_end))