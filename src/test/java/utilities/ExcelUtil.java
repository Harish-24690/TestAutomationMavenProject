package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static List<Map<String, String>> readData(String fileName, String sheetName) {
		List<Map<String, String>> data = new ArrayList<Map<String, String>>();

		try {

			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\" + fileName);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh = wb.getSheet(sheetName);
// Get the total rows & columns having data
			int totalRows = sh.getPhysicalNumberOfRows();
			int totalColumns = sh.getRow(0).getPhysicalNumberOfCells();
// Create Loops and load row wise data (column name=column value) into maps and
			// then store them in List
// Loop to iterate over rows
			for (int r = 1; r < totalRows; r++) {
				Map<String, String> rowData = new HashMap<String, String>();
// Loop to iterate over columns
				for (int c = 0; c < totalColumns; c++) {
					String columnName = sh.getRow(0).getCell(c).getStringCellValue();
					String columnValue = sh.getRow(r).getCell(c).getStringCellValue();
					rowData.put(columnName, columnValue);
				}

				data.add(rowData);

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return data;
		
		
	}
	
	public static String[][] readData1(String fileName,String sheetName) {
		String[][] data = null;
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\" + fileName);
			
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sh=wb.getSheet(sheetName);
			int totalRows = sh.getPhysicalNumberOfRows();
			int totalColumns =sh.getRow(0).getPhysicalNumberOfCells();
			
			data= new String[totalRows][totalColumns];
			for(int r=0;r<totalRows;r++) {
				for(int c=0;c<totalColumns;c++) {
			         data[r][c]= sh.getRow(r).getCell(c).getStringCellValue();		
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	} 

}
