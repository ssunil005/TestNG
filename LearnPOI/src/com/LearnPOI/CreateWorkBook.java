package com.LearnPOI;

import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

public class CreateWorkBook {
	public  static void main(String[]args) {
        Workbook wb = new HSSFWorkbook();  
        try(OutputStream fileOut = new FileOutputStream("D:\\CaptureScreen\\javatpoint2.xls")){
        	wb.write(fileOut);
        	
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        	
        	
        }
        test();
        
	}
	public static  void test() {
		Workbook w = new HSSFWorkbook();
        try(OutputStream fileOut = new FileOutputStream("D:\\CaptureScreen\\javatpoint12.xls")){
			w.write(fileOut);			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
