package tests;

import java.io.FileReader;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import pages.HomePage;
import pages.MyAccountPage;
import pages.UserSignInPage;

public class UserLoginTest extends TestBase {
	HomePage homeObjects;
	UserSignInPage signinobjects;
	MyAccountPage myAccountObject;
	CSVReader reader;


	@Test
	public void UserCanRegisterSuccessfully() throws CsvValidationException, IOException {

		String CSVFilePath = System.getProperty("user.dir")+"/DataFiles/VodafoneData.csv";
		reader = new CSVReader(new FileReader(CSVFilePath));

		String[] csvLine;

		while((csvLine = reader.readNext()) != null) {
			String email = csvLine[0];
			String password = csvLine[3];

			homeObjects = new HomePage(driver);
			homeObjects.openSignInPage();
			signinobjects = new UserSignInPage(driver);
			signinobjects.LogInToAccount(email, password);
			myAccountObject = new MyAccountPage(driver);
			Assert.assertTrue(myAccountObject.infoAccountTXT.getText().contains("Welcome to your account"));
		}
	}

}
