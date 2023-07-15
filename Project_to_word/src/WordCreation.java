// Java Program to Add Tables to a Word Document

// Importing I/O file libraries
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
// Creating a simple table
import org.apache.poi.xwpf.usermodel.XWPFTable;
// Creating a row of the table
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

// Java class converting tables to Word
public class WordCreation {

// Main driver method
	public static void main(String[] args) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the process flow");
		String flow = sc.next();
		System.out.println("what are your likes and dilikes");
		String like = sc.next();
		System.out.println("please enter for any suggestion");
		String suggest = sc.next();
		// Creating a blank Document
		XWPFDocument document = new XWPFDocument();

		// Writing the Document in file system
		FileOutputStream out = new FileOutputStream(
			new File("D:\\Digit\\doc1.docx"));

		// Creating a table
		XWPFTable table = document.createTable();

		// Create first row in a table
		XWPFTableRow tableRowOne = table.getRow(0);

		// Attributes added to the first table
		tableRowOne.getCell(0).setText("The Process Flow");
		tableRowOne.addNewTableCell().setText(flow);
		

		// Creating a second row
		XWPFTableRow tableRowTwo = table.createRow();

		// Attributes of second row
		tableRowTwo.getCell(0).setText("Like and DisLikes");
		tableRowTwo.getCell(1).setText(like);
		
		XWPFTableRow tableRow3 = table.createRow();

		// Attributes of second row
		tableRow3.getCell(0).setText("suggestions");
		tableRow3.getCell(1).setText(suggest);

		document.write(out);
		out.close();

		// Display message when
		// all data to the rows are inserted
		System.out.println(
			"create_table.docx written successfully");
	}
}
