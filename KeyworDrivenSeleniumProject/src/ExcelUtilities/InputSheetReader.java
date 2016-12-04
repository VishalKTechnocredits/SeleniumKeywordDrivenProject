package ExcelUtilities;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class InputSheetReader

{

	String driverSheetpath = "D:\\Vishal\\KeyworDrivenSeleniumProject\\TestAutomation\\InputSheets\\DriverSheet.xls";
	String masterSheetPath = "D:\\Vishal\\KeyworDrivenSeleniumProject\\TestAutomation\\MasterSheet\\";

	public void readExcel() throws IOException, BiffException {
		
	Workbook wb=null ;//What is workbook object or class
	wb = getExcel(driverSheetpath,wb);
		
		Sheet sheet1 = wb.getSheet(0);
		int columns = sheet1.getColumns();
		int rows = sheet1.getRows();
List<String>mastersheetList = new ArrayList<String>();//what is List here,class or object
List<String>executionList = new ArrayList<String>();
		
		for (int i = 0; i <= columns - 2; i++) { //If I make column-1 then what will be the value of j,will it be 3
			for (int j = 0; j <= rows - 1; j++) {
				Cell cell = sheet1.getCell(i, j);
				mastersheetList.add(cell.getContents());
				
			}
			System.out.println(mastersheetList);
		}
		for (int i = 1; i <= columns - 1; i++) {  
			for (int j = 0; j <= rows - 1; j++) {
				Cell cell = sheet1.getCell(i, j);
				executionList.add(cell.getContents());
				
			}
			System.out.println(executionList);
		}
for(int y = 1 ;y <=mastersheetList.size()-1;y++){
	
		
		if(executionList.get(y).equalsIgnoreCase("YES")){
			String name = mastersheetList.get(y);
			System.out.println(name);
		readMasterSheet(name);
	}
	
}
		
		
		// for(int i=0;i<=columns-1;i++)
		// {
		// for(int j=0;j<=rows-1;j++)
		// {
		// Cell cell=sheet1.getCell(i,j);
		// System.out.println(cell.getContents());
		// }
		// }

		// Obtain reference to the Cell using getCell(int col, int row) method
		// of sheet
		// Cell colArow1 = sheet1.getCell(0, 0);
		// Cell colBrow1 = sheet1.getCell(1, 0);
		// Cell colArow2 = sheet1.getCell(0, 1);
		// Cell colBrow2=sheet1.getCell(1, 1);

		// Read the contents of the Cell using getContents() method, which will
		// return
		// it as a String
		// String str_colArow1 = colArow1.getContents();
		// String str_colBrow1 = colBrow1.getContents();
		// String str_colArow2 = colArow2.getContents();
		// String str_colBrow2 = colBrow2.getContents();

		// Display the cell contents
		// System.out.println("Contents of cell Col A Row 1: \""+str_colArow1 +
		// "\"");
		// System.out.println("Contents of cell Col B Row 1: \""+str_colBrow1 +
		// "\"");
		// System.out.println("Contents of cell Col A Row 2: \""+str_colArow2 +
		// "\"");
		// System.out.println("Contents of cell Col B Row 2:\""+str_colBrow2 +
		// "\"");

		// ArrayList<String> MasterSheetName = new ArrayList<String>();
		// ArrayList<String> Execution = new ArrayList<String>();
		// MasterSheetName.add(str_colArow1);
		// MasterSheetName.add(str_colBrow1);
		// Execution.add(str_colArow2);
		// Execution.add(str_colBrow2);

	}

	private Workbook getExcel(String sheetPath, Workbook wb) {
		// TODO Auto-generated method stub
		try {
			wb = Workbook.getWorkbook(new File(sheetPath));
			
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return wb;
	}

	private void readMasterSheet(String mastersheetName) {
		// TODO Auto-generated method stub
		String filePath = masterSheetPath+mastersheetName;// Doubt-how the string conaca working here
		System.out.println(filePath);
		Workbook wb1 = null;
		wb1 = getExcel(filePath,wb1);
		Sheet sheet1 = wb1.getSheet(0);
		int columns = sheet1.getColumns();
		int rows = sheet1.getRows();
List<String>mastersheet = new ArrayList<String>();

		
		for (int i = 0; i <= columns - 2; i++) {
			for (int j = 0; j <= rows - 1; j++) {
				Cell cell = sheet1.getCell(i, j);
				mastersheet.add(cell.getContents());
				
			}
			System.out.println(mastersheet);
		}
	}

}
