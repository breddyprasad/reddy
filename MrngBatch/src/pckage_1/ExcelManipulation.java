package pckage_1;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelManipulation {

	public static void main(String[] args) throws Exception {

//		// Workbook creation
//		WritableWorkbook myWritableWorkbook = Workbook.createWorkbook(new File("output.xls"));
//		// WorkSheet creation
//		WritableSheet myWritableSheet = myWritableWorkbook.createSheet("First sheet", 0);
//
//		// String value to be inserted in excel
//		Label label_1 = new Label(0, 1, "test value");
//
//		// Cel creation with the String value declared above
//		myWritableSheet.addCell(label_1);
//
//		// Number creation
//		Number number_1 = new Number(1, 2, 12345);
//
//		// Adding the Integer value to excel
//		myWritableSheet.addCell(number_1);
//
//		// Saving and closing the workbook
//		myWritableWorkbook.write();
//		myWritableWorkbook.close();

		// Reading the values from excel
		// Grabbing the Excel workbook
		Workbook myReadableWorkbbok = Workbook.getWorkbook(new File("output.xls"));

		// Grabbing the Sheet
		Sheet myReadableSheet = myReadableWorkbbok.getSheet(0);

		// Grabbing the Cell value based on the row n column value
		String cellValue = myReadableSheet.getCell(0, 1).getContents();
		
		//System.out.println("Reading the value from 0, 1 location: " + cellValue);
		
		//System.out.println(myReadableSheet.getCell(1, 2).getContents());
		
		
		
		
		// Looping on all rows and columns
		
		int rowCount = myReadableSheet.getRows();
		
		int columnCount = myReadableSheet.getColumns();
		
		for(int i = 0; i < rowCount; i++){
			
			for(int j =0; j < columnCount; j++){
				
				System.out.print(myReadableSheet.getCell(j, i).getContents());
				System.out.print(" | ");
			}
			System.out.println("");
		}
		
		myReadableWorkbbok.close();
		
		
		
	}

}
