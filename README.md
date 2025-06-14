# Dice Roll Simulator - JAVA

A simple console-based Dice Rolling Simulator built with Java. Enter how many dice you'd like to roll, and get a visual representation of each roll along with the total score.

## Features

- Roll any number of dice
- ASCII representation of each dice face (1 to 6)
- Displays total score after all rolls
- Simple and intuitive user input

## How to Run

### Prerequisites

- Java 21 (OpenJDK)
- IDE (optional but recommended): JetBrains IntelliJ IDEA

### Steps

1. Clone this repository or download the `DiceRoll.java` file.
2. Open JetBrains IntelliJ IDEA.
3. Click `File` > `Open...`, then select the folder containing `DiceRoll.java`.
4. IntelliJ will detect it as a Java project. If prompted, select Java 21 SDK.
5. To run:
   - Right-click `DiceRoll.java`
   - Click `Run 'DiceRoll.main()'`

### Or run via terminal:

```bash
javac DiceRoll.java
java DiceRoll
```

## Gameplay

1. You'll be prompted to enter how many dice you want to roll.
2. Each roll displays:
   - The number rolled
   - An ASCII visual of the dice
3. Final total score is shown at the end.

## Example Output

```
Enter the amount of Dice you want to roll: 3
Your No. 1 Dice : 4
 ---------
| 0     0 |
|         |
| 0     0 |
 ---------

Your No. 2 Dice : 6
 ---------
| 0     0 |
| 0     0 |
| 0     0 |
 ---------

Your No. 3 Dice : 2
 ---------
| 0       |
|         |
|       0 |
 ---------

Final Score: 12
```

## Developer Notes

- Currently uses basic input handling (note: integer input expected)
- Easily extendable with more visual features or dice types
- Can be used for dice games, simulations, or teaching

## Tech Stack

- Java Version: OpenJDK 21
- IDE Used: JetBrains IntelliJ IDEA

## License

This project is open-source and available under the MIT License.
