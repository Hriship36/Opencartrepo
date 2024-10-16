package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	
	public static Cell Fetchdatafromexcel(String sheet,int row, int col) throws  IOException {
		
		String path= "C:\\Users\\LENOVO\\Documents\\codexcel.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Cell cell = WorkbookFactory.create(file).getSheet("mysheet").getRow(2).getCell(2);
		
		return cell;
	}



public static void CaptureScreenshot(WebDriver driver) throws IOException {
	DateTimeFormatter atf = DateTimeFormatter.ofPattern("YYYY-MM-dd  HH-MM-SS");
	
	TakesScreenshot t = (TakesScreenshot)driver;
	File a = t.getScreenshotAs(OutputType.FILE);
	
	LocalDateTime now = LocalDateTime.now();
	File dest = new File ("C:\\Users\\LENOVO\\Desktop\\my java\\System.currentTimeMillis().jpg");
	
	FileHandler.copy(a, dest);
	
	
}
}