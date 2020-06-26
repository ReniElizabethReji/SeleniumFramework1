package utils;

import java.io.IOException;

public class ExcelSheetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String project_path = System.getProperty("user.dir");
	    
	    ExcelUtils obj = new ExcelUtils(project_path+"/excel/Data.xlsx","Sheet1");
	  
	    try {
	    	obj.getRowCount();
	    	obj.getColCount();
			obj.getCellDataNumber(1, 1);
			obj.getCellDataString(0, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	}

}
