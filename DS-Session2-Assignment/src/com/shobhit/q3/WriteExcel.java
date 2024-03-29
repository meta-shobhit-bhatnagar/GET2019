package com.shobhit.q3;

import jxl.Workbook;
import jxl.write.*;
import jxl.write.Number;

import java.io.File;
import java.io.IOException;

import com.shobhit.q3.AllocateProgram;

public class WriteExcel {



	public static void writeFile() {

		AllocateProgram  result = new  AllocateProgram ();		
		int i = 0;
		try {
			WritableWorkbook workbook = Workbook.createWorkbook(new File("C:\\Users\\Shobhit\\Desktop\\GIT\\GET2019\\DS-Session2-Assignment\\src\\com\\shobhit\\q3\\Result.xls"));
			WritableSheet workbookSheet = workbook.createSheet("sheet1", 0);
			int j;
			for (j = 0; j < result.getStudentAllocate().size(); j++) {

				String name = result.getStudentAllocate().get(i).getStudentName();
				Label nameLabel = new Label(0, j, name);
				workbookSheet.addCell(nameLabel);
				String program = result.getStudentAllocate().get(i).getBranch();
				Label programLabel = new Label(1, j, program);
				i++;
				workbookSheet.addCell(programLabel);
			}
			workbook.write();
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
