
# Currency Converter

A simple currency converter application that fetches real-time exchange rates using the Open Exchange Rates API and performs currency conversions.

## Getting Started

### Prerequisites

To use this currency converter, you'll need:

- Java Development Kit (JDK) installed on your machine.
- An API key from Open Exchange Rates to fetch exchange rate data.
- JSON for Java (org.json.jar file)

### Obtaining an API Key

1. Sign up for an account on the [Open Exchange Rates website](https://openexchangerates.org/).
2. Once registered, you'll receive an API key.
3. Replace `YOUR_API_KEY` in the code with your actual API key.

## Usage

- Add org.json.jar file in your project's build path

1. Clone the repository:

  
   git clone https://github.com/EF-Code/Javolution.git
   

2. Compile the Java program:

   
   javac CurrencyConverter.java
   

3. Run the program:

  
   java CurrencyConverter
   

- Run the added executable jar using:
	java -jar CurrencyConverter.java


4. Follow the prompts to enter the amount in USD and the target currency code (e.g., "EUR").

5. The program will display the converted amount in the target currency.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- This project uses the `org.json` library for JSON processing.



Replace `"YOUR_API_KEY"` with your actual Open Exchange Rates API key. Also, make sure to provide accurate repository URLs, license information, and acknowledgments.

Feel free to customize the formatting, add more sections, or include any additional information that you think is relevant for your project's README.