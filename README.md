#  Java Countdown Timer 

This is a simple console-based **countdown timer** written in Java. It takes a number of seconds from the user and counts down to zero, displaying a celebratory message when the countdown finishes.

---

##  Features

- Takes user input for countdown duration (in seconds)
- Counts down with a **1-second interval**
- Prints `"HAPPY BIRTHDAY"` at the end 

---

##  How It Works

- Uses `Scanner` to take input from the user
- Uses a `for` loop to count down
- Pauses each second using `Thread.sleep(1000)`

---

##  How to Run

###  Prerequisites
- Java installed on your computer

###  Steps to Run

```bash
javac Main.java
java Main

## Sample Output
ENTER THE NO OF SECONDS YOU WANT TO COUNTDOWN FROM:
5
5
4
3
2
1
HAPPY BIRTHDAY
