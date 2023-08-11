import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class CurrencyConverter {
	private static final String API_KEY = "YOUR_API_KEY";
	private static final String BASE_URL = "https://openexchangerates.org/api/latest.json";

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		try {

			String urlString = BASE_URL + "?app_id=" + API_KEY;
			URL url = new URL(urlString);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

			String line;
			StringBuilder response = new StringBuilder();

			while ((line = reader.readLine()) != null) {
				response.append(line);

			}
			reader.close();

			JSONObject jsonResponse = new JSONObject(response.toString());
			JSONObject rates = jsonResponse.getJSONObject("rates");

			double usdToEurRate = rates.getDouble("EUR");
			double usdToGbpRate = rates.getDouble("GBP");
			double usdToJpyRate = rates.getDouble("JPY");

			// Add more currencies and rates here

			double usdToInrRate = rates.getDouble("INR");
			double usdToCnyRate = rates.getDouble("CNY");

			// User input
			System.out.print("Amount in USD: $");
			double usdAmount = scanner.nextInt();
			scanner.nextLine();
			System.out.print("Target Currency (e.g \"EUR\"): ");
			String targetCurrency = scanner.nextLine();

			double convertedAmount = 0;

			switch (targetCurrency) {
			case "EUR":
				convertedAmount = usdAmount * usdToEurRate;
				break;

			case "GBP":
				convertedAmount = usdAmount * usdToGbpRate;
				break;

			case "JPY":
				convertedAmount = usdAmount * usdToJpyRate;
				break;

			case "INR":
				convertedAmount = usdAmount * usdToInrRate;
				break;

			case "CNY":
				convertedAmount = usdAmount * usdToCnyRate;
				break;

			default:
				System.out.println("Currency not supported.");

			}

			System.out.println("Converted amount in " + targetCurrency + ": " + convertedAmount);

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
}
