package database;
import java.io.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Readexcel {
     private XSSFWorkbook wb;

	public void excel() throws Exception {
		// File file=new File("");
		Mysqlconnection connect=new Mysqlconnection();
	     connect.connect();
	     
         FileInputStream fileread=new FileInputStream("D:/aptitude.xlsx");
         wb = new XSSFWorkbook(fileread);
         XSSFSheet sheet1=wb.getSheetAt(0);
         
         Insert insert=new Insert();
         
         for(int i=1;i<30;i++){
        	 
        	 int data1= (int)sheet1.getRow(i).getCell(0).getNumericCellValue();
             String data2=sheet1.getRow(i).getCell(1).getStringCellValue();
             insert.insert(data1, data2);
             System.out.print("File Inserted to Database");
        	}
           
         }
  }
