package adv1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class exc6 {

	public static void main(String[] args)throws Exception,IOException{
		// TODO Auto-generated method stub
          File scr= new File("C:\\Selenium\\Selium 3.0\\Book1.xlsx");
          FileInputStream fis=new FileInputStream(scr);
          XSSFWorkbook wb= new XSSFWorkbook(fis);
          XSSFSheet sheet1=wb.getSheetAt(0);
          String s=sheet1.getRow(0).getCell(0).getStringCellValue();
          String s1=sheet1.getRow(0).getCell(1).getStringCellValue();
          System.out.println(s);
          System.out.println(s1);
          
          
	}

}
