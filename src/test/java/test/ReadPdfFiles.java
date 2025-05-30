package test;

import utilities.PDFUtil;

public class ReadPdfFiles {
	
	public static void main(String[] args) {
		
		System.out.println(PDFUtil.pdfreader("TestFile.pdf"));
		System.out.println(PDFUtil.pdfreader("TestFile.pdf").contains("web-based administration"));
		
	}

}
