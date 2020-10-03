package tests;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import pages.HomePage;
import pages.MyAccountPage;
import pages.RegistrationPage;
import pages.UserSignInPage;

public class UserRegistrationTest extends TestBase {

	HomePage homeObjects;
	UserSignInPage signinobjects;
	RegistrationPage registrationObjects;
	MyAccountPage myAccountObject;
	CSVReader reader;

	@Test
	public void UserCanRegisterSuccessfully() throws CsvValidationException, IOException {

		String CSVFilePath = System.getProperty("user.dir")+"/DataFiles/VodafoneData.csv";
		reader = new CSVReader(new FileReader(CSVFilePath));

		String[] csvLine;

		while((csvLine = reader.readNext()) != null) {
			String email = csvLine[0];
			String fName = csvLine[1];
			String lName = csvLine[2];
			String password = csvLine[3];
			String address = csvLine[4];
			String city = csvLine[5];
			String state = csvLine[6];
			String postcode = csvLine[7];
			String country = csvLine[8];
			String phone = csvLine[9];
			String alias = csvLine[10];

			homeObjects = new HomePage(driver);
			homeObjects.openSignInPage();
			signinobjects = new UserSignInPage(driver);
			signinobjects.firstRegistration(email);
			registrationObjects = new RegistrationPage(driver);
			registrationObjects.registrationForm(fName, lName, password, address, city, state, postcode, country, phone, alias);
			myAccountObject = new MyAccountPage(driver);
			Assert.assertTrue(myAccountObject.infoAccountTXT.getText().contains("Welcome to your account"));
			myAccountObject.SignOutClick();	
		}
	}
}
