package ExcelUtilities;
import java.io.*;  
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MastersheetReader 
{
	public void readmasterSheet() throws IOException, BiffException
	{
	String masterSheetpathLogin="D:\\Vishal\\KeyworDrivenSeleniumProject\\TestAutomation\\MasterSheet\\LogInSheet.xls";
	
	
	Workbook wb=Workbook.getWorkbook(new File(masterSheetpathLogin));
	Sheet sheet1=wb.getSheet(0);
	int columns=sheet1.getColumns();
	int rows=sheet1.getRows();
		
	
}}
