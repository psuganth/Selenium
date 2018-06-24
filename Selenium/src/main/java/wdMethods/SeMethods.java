package wdMethods;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods {

    RemoteWebDriver driver;
	int i = 1;

	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			System.out.println("The Browser " + browser + " is launched");
		} catch (NullPointerException e) {
			System.err.println("Browser value not matches with the requirements");
		} catch (WebDriverException e) {
			System.err.println("The WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement element = null;
		try {
			switch (locator) {
			case "id":
				element = driver.findElementById(locValue);
				break;
			case "name":
				element = driver.findElementByName(locValue);
				break;
			case "class":
				element = driver.findElementByClassName(locValue);
				break;
			case "xpath":
				element = driver.findElementByXPath(locValue);
				break;
			case "link":
				element = driver.findElementByLinkText(locValue);
				break;
			default:
				element = null;
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("Webdriver " + e + " not found");
		} catch (WebDriverException e) {
			System.err.println("The WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
		return element;

	}

	public WebElement locateElement(String locValue) {
		return locateElement("id", locValue);
	}

	public void type(WebElement ele, String data) {
		try {
			ele.clear();
			ele.sendKeys(data);
			System.out.println("The text field entered with text " + data);
		} catch (InvalidElementStateException e) {
			System.err.println("The element: " + ele + " is not found");
			throw new RuntimeException();
		} catch (WebDriverException e) {
			System.err.println("The WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element " + ele + " is clicked");
		} catch (InvalidElementStateException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element " + ele + " not found clicked");
		} catch (WebDriverException e) {
			System.err.println("The WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
	}

	public void clickWithoutSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The Element " + ele + " is clicked");
		} catch (InvalidElementStateException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element " + ele + " not found clicked");
		} catch (WebDriverException e) {
			System.err.println("The WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
	}

	public String getText(WebElement ele) {
		String text = null;
		try {
			text = ele.getText();
		} catch (WebDriverException e) {
			System.err.println("The WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
		finally {
			takeSnap();
		}
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		try {
			new Select(ele).selectByVisibleText(value);
			System.out.println("The dropdown is selected with text " + value);
		} catch (WebDriverException e) {
			System.err.println("The dropdown could not be selected with text " + value);
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		try {
			new Select(ele).selectByIndex(index);
			System.out.println("The dropdown is selected with index " + index);
		} catch (WebDriverException e) {
			System.err.println("The dropdown could not be selected with index " + index);
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
	}

	public String getTitle() {
		String title = null;
		try {
			title = driver.getTitle();
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
		return title;
	}

	public boolean verifyTitle(String expectedTitle) {
		boolean isTitleMatch = false;
		try {
			if (getTitle().equals(expectedTitle)) {
				System.out.println("Browser title matches the " + expectedTitle);
				isTitleMatch = true;
			} else {
				System.out.println("Browser title does not matches the" + expectedTitle);
			}
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
		return isTitleMatch;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			String text = getText(ele);
			if (text.equals(expectedText)) {
				System.out.println(text + " matches with the " + expectedText);
			} else {
				System.out.println(text + " does not matches with the " + expectedText);
			}
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}

	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		try {
			String text = getText(ele);
			if (text.contains(expectedText)) {
				System.out.println(text + " matches with the " + expectedText);
			} else {
				System.out.println(text + " does not matches with the " + expectedText);
			}
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}

	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			String Partialattr = ele.getAttribute(attribute);
			if (Partialattr.equals(value)) {
				System.out.println(Partialattr + " matches with the " + value);
			} else {
				System.out.println(Partialattr + " does not matches with the " + value);
			}
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		try {
			String Partialattr = ele.getAttribute(attribute);
			if (Partialattr.contains(value)) {
				System.out.println(Partialattr + " matches with the " + value);
			} else {
				System.out.println(Partialattr + " does not matches with the " + value);
			}
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
	}

	public void verifySelected(WebElement ele) {
		try {
			if (ele.isSelected()) {
				System.out.println("Element " + ele + " is selected");
			} else
				System.out.println("Element " + ele + " is not selected");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
	}

	public void verifyDisplayed(WebElement ele) {

		try {
			if (ele.isDisplayed()) {
				System.out.println("Element " + ele + " is Displayed");
			} else {
				System.out.println("Element " + ele + " is not Displayed");
			}
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		} finally {
			takeSnap();
		}
	}

	public void switchToWindow(int index) {
		try {
			Set<String> allWindowHandles = driver.getWindowHandles();
			List<String> allHandles = new ArrayList<>();
			allHandles.addAll(allWindowHandles);
			driver.switchTo().window(allHandles.get(index));
		} catch (NoSuchWindowException e) {
			System.err.println("The driver could not move to the given window by index " + index);
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
		} catch (NoSuchFrameException e) {
			System.err.println("Specified frame does not exist");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
	}

	public void acceptAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.err.println("There is no alert present.");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
	}

	public void dismissAlert() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			System.err.println("There is no alert present.");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
	}

	public String getAlertText() {
		String text = null;
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
		} catch (NoAlertPresentException e) {
			System.err.println("There is no alert present.");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The Exception occured: " + e.getMessage());
			throw new RuntimeException(e.getMessage());
		}
		return text;
	}
//getattribute//
	
//WebElement getinc = locateElement("incident.number");
	//String incnumber = getinc.getAttribute("value");

	public void takeSnap() {
		File Source = driver.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./Screenshots/Snap" + i + ".jpeg");
		try {
			FileUtils.copyFile(Source, destfile);
		} catch (Exception e) {
			System.err.println("Can't take a snap");
		}
		i++;

	}

	public void closeBrowser() {
		try {
			driver.close();
			System.out.println("The browser is closed");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The browser could not be closed");
		}
	}

	public void closeAllBrowsers() {
		try {
			driver.quit();
			System.out.println("The opened browsers are closed");
		} catch (WebDriverException e) {
			System.err.println("WebDriverException occured");
			throw new RuntimeException();
		} catch (Exception e) {
			System.err.println("The browsers could not be closed");
		}

	}

}
