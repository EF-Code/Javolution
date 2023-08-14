# Java Password Generator

![Java Badge](https://img.shields.io/badge/language-Java-blue)

This is a simple password generator program written in Java. It generates strong and random passwords based on user-defined length and character set preferences.

## Features

- Generate random passwords with customizable length.
- Choose from various character sets: lowercase, uppercase, digits, and special symbols.
- Copy generated password to clipboard for easy use.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor to modify and run the code.

### Usage

1. Clone or download this repository to your local machine.
2. Open the project in your Java IDE or text editor.
3. Run the `PasswordGeneratorMain.java` file or run it from terminal/console.

## Configuration

You can customize the following parameters in the `PasswordGenerator.java` file:

- `LENGTH`: Desired length of the generated password.
- `CHAR_LOWER`, `CHAR_UPPER`, `DIGITS`, `SPECIAL`: Toggle these flags to include/exclude character sets in the generated password.

## Example


public class PasswordGeneratorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int passwordLength;
        System.out.print("Enter the desired password length: ");
        passwordLength = scanner.nextInt();
        String generatedPassword = PasswordGenerator.generateRandomPassword(passwordLength);
        System.out.println("Generated Password: " + generatedPassword);
    }
}


Contributing
Contributions are welcome! If you find any issues or improvements, feel free to open an issue or submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE file for details.

