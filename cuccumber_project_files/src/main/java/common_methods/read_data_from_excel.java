package common_methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_data_from_excel {
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String path=null;
	
	
	public read_data_from_excel(String path){
		this.path=path;
	}
	
	public int getRowCount(String Sheetname) throws IOException {
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet=workbook.getSheet(Sheetname);
		int rows= sheet.getLastRowNum();
		return rows;
	}
	
	public int getcellCount(String sheetname, int rowNum) throws IOException {
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		row=sheet.getRow(rowNum);
		int cellcount=row.getLastCellNum();
		return cellcount;
	}
	
	public String celldata(String sheetname, int rownum, int colnum) throws IOException {
		fi= new FileInputStream(path);
		workbook= new XSSFWorkbook(fi);
		sheet=workbook.getSheet(sheetname);
		
		String value=sheet.getRow(rownum).getCell(colnum).getStringCellValue();
		
		return value;
		
	}

}
