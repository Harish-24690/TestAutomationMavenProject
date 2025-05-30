package test;

import java.util.List;
import java.util.Map;

import utilities.ExcelUtil;

public class ReadExcel {
	
	public static void main(String[] args) {
		
//		List<Map<String, String>> data = ExcelUtil.readData("TestData.xlsx","Sheet1");
//		System.out.println(data.get(1).get("Password"));
		
		String[][] data=ExcelUtil.readData1("TestData.xlsx", "Sheet1");
	System.out.println(data[1][1]);	
				
	}

}
