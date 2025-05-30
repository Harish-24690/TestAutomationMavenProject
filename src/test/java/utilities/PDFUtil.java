package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Pdf;

public class PDFUtil {
	
	public static String pdfreader(String fileName) {
		String  text= " ";
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestFiles\\"+fileName);
			PDDocument document = PDDocument.load(fis);
			PDFTextStripper pdf  = new PDFTextStripper();
			pdf.setStartPage(1);
			pdf.setEndPage(1);
			text=  pdf.getText(document);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}

}
