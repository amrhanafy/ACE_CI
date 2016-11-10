package Libs;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Excel_DDT {
	
	static Workbook wrkbook = null;
	static Sheet sheet = null;
	static Hashtable xldic = new Hashtable();
	
	// Initialize the class (constructor)
	public Excel_DDT (String FilePath)
	{
		try {
			wrkbook = Workbook.getWorkbook(new File(FilePath));
			sheet =wrkbook.getSheet("Sheet1");
			cloumndic();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static int rowcount ()
	{
		return sheet.getRows();
	}

	public static String getcellvalue (int colno , int rawno)
	{
		return sheet.getCell(colno, rawno).getContents();
	}
	
	public static void cloumndic ()
	{
		for (int col = 0; col<sheet.getColumns(); col++)
		{
			xldic.put(getcellvalue(col, 0), col);
		}
	}
	
	public static int Getcell (String colname)
	{
		try {
		int value;
		
		value= xldic.get(colname).hashCode();
		return value;
		}
		catch (NullPointerException e)
		{
			return 0;
		}
	}
	

}
