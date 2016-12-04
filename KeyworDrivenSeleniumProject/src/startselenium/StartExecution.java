package startselenium;



import java.io.IOException;

import jxl.read.biff.BiffException;
import ExcelUtilities.HashMapSheet;
//import ExcelUtilities.InputSheetReader;
import ExcelUtilities.InputSheetReader;

public class StartExecution {

	public static void main(String[] args) throws BiffException, IOException 
	{
		
		{
		InputSheetReader a1=new InputSheetReader();
		a1.readExcel();
			//HashMapSheet a1=new HashMapSheet();
			//a1.readExcel();

	}

}}