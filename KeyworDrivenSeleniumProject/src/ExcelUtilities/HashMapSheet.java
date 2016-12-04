package ExcelUtilities;

    import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

	import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.util.HashMap;
import java.util.Map;


	public class HashMapSheet
	{
		String driverSheetpath = "D:\\Vishal\\KeyworDrivenSeleniumProject\\TestAutomation\\InputSheets\\DriverSheet.xls";
		//String masterSheetPath = "D:\\Vishal\\KeyworDrivenSeleniumProject\\TestAutomation\\MasterSheet\\";
	LinkedHashMap<String,List<String>> map1 = (LinkedHashMap<String, List<String>>) new HashMap<String, List<String>>();
		
		public void readExcel() throws IOException, BiffException
		{
			Workbook wb=null;
			wb=getExcel(driverSheetpath,wb);
			Sheet sheet1=wb.getSheet(0);
			int columns=sheet1.getColumns();
			int rows=sheet1.getRows();
			
			List<String>mastersheetList = new ArrayList<String>();
			List<String>executionList = new ArrayList<String>();
			
			
			for (int i = 0; i <= columns - 2; i++) {
				for (int j = 1; j <= rows - 1; j++) {
					Cell cell = sheet1.getCell(i, j);
					mastersheetList.add(cell.getContents());
					
				}
		}
			for (int i = 1; i <= columns - 1; i++) {
				for (int j = 1; j <= rows - 1; j++) {
					Cell cell = sheet1.getCell(i, j);
					executionList.add(cell.getContents());
					
					}
			}
			map1.put("MasterSheet", mastersheetList);
			map1.put("executionList",executionList);
			
			
			
			
			for (Map.Entry<String, List<String>> entry2 : map1.entrySet())
			{
				String key=entry2.getKey();
				List<String> values = entry2.getValue();
				System.out.println("Key = " + key);
	            System.out.println("Values = " + values );
	            
			}
			
			
		}
		
		
		
		
		
		
		
		
			private Workbook getExcel(String sheetPath, Workbook wb)
			{
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
			
			
			
			
			
	}


