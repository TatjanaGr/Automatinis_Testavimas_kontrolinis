package testdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.NoSuchElementException;

import basetest.BaseTest;
import pages.MainPage;

import utilities.FileReaderUtils;

public class FileTxtReaderTest extends BaseTest {

	private MainPage mainPage = new MainPage(driver);

	@Test
	public void testFromTestdataFileElementZero() throws IOException {

		mainPage.clickLinkMP3Players();
		mainPage.clickAllLinkMP3Players();
		mainPage.clickListView();

		List<String> testdata = FileReaderUtils.getTestData("src/test/resources/TestData_Products.txt");

		String productName = testdata.get(0);
		String actualResult = mainPage.searchProductNameFromListView(productName);
		assertEquals(productName + "does not exist in the eshop", productName, actualResult);
	}

	@Test
	public void testFromTestdataFileElementOne() throws IOException {

		mainPage.clickLinkMP3Players();
		mainPage.clickAllLinkMP3Players();
		mainPage.clickListView();

		List<String> testdata = FileReaderUtils.getTestData("src/test/resources/TestData_Products.txt");

		String productName = testdata.get(1);
		String actualResult = mainPage.searchProductNameFromListView(productName);
		assertEquals(productName + "does not exist in the eshop", productName, actualResult);
		mainPage.clickFoundProductName(productName);
		mainPage.clickAddToWishList();
		assertThat(mainPage.addToWishListMessage(), is("You must login or create an account to save iPod Nano to your wish list!×"));
	}

	@Test
	public void testFromTestdataFileElementTwo() throws IOException {

		mainPage.clickLinkMP3Players();
		mainPage.clickAllLinkMP3Players();
		mainPage.clickListView();

		List<String> testdata = FileReaderUtils.getTestData("src/test/resources/TestData_Products.txt");

		String productName = testdata.get(2);
		String actualResult = mainPage.searchProductNameFromListView(productName);
		assertEquals(productName + "does not exist in the eshop", productName, actualResult);

	}

	@Test
	public void testFromTestdataFileElementThree() throws IOException {

		mainPage.clickLinkMP3Players();
		mainPage.clickAllLinkMP3Players();
		mainPage.clickListView();

		List<String> testdata = FileReaderUtils.getTestData("src/test/resources/TestData_Products.txt");

		String productName = testdata.get(3);
		String actualResult = mainPage.searchProductNameFromListView(productName);
		assertEquals(productName + "does not exist in the eshop", productName, actualResult);
		mainPage.clickFoundProductName(productName);
		mainPage.clickAddToWishList();
	}
}
