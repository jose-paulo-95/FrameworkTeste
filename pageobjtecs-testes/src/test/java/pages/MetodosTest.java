package pages;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MetodosTest {

	WebDriver driver;

	/*
	 * @author Jose Paulo
	 * 
	 * @param abrir navegador
	 */

	public void abrirnavegador(String site, String navegador, String descricaoPasso) throws IOException {
		
try {
		if (navegador == "CHROME" || navegador == "FIREFOX") {

			if (navegador == "CHROME") {
				System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();

			} else if (navegador == "FIREFOX") {

				System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();

			}
		} else {
				System.out.println("Navegador Invalido");
			}
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);
			
		}

		
	}

	/*
	 * @author Jose Paulo
	 * 
	 * @param clicar com 
	 */

	public void clicar(By element,String descricaoPasso) throws IOException {
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			Assert.fail(LocalDateTime.now() + " --erro ao tentar " + descricaoPasso);
			screnShoot(descricaoPasso);
		}
		
	}

	/*
	 * @author Jose Paulo
	 * 
	 * @param preencher
	 */

	public void preencher(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}

	/*
	 * @author Jose Paulo
	 * 
	 * @param fechar pagina
	 */

	public void fecharpagina() {
		driver.quit();
	}

	/*
	 * @author Jose Paulo
	 * 
	 * @param enter
	 */

	public void submit(By element) {

		driver.findElement(element).submit();

	}

	/*
	 * @author Jose Paulo
	 * 
	 * @param Tirar Print
	 */

	public void screnShoot(String printName) throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File(printName);
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
