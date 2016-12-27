import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.file;



public class ModifyExcelSpreadsheet {

	
	
	  public static void writeXLSXFile(int row, int col) throws IOException {
	        try {
	            FileInputStream file = new FileInputStream("C:\\Users\\samyy\\Desktop\\Adr");

	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	            XSSFSheet sheet = workbook.getSheetAt(0);
	            Cell cell = null;

	            //Update the value of cell
	            cell = sheet.getRow(row).getCell(col);
	            cell.setCellValue("Pass");

	            file.close();

	            FileOutputStream outFile =new FileOutputStream(new File("C:\\Anuj\\Data\\Data.xlsx"));
	            workbook.write(outFile);
	            outFile.close();

	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void main(String[] args) throws IOException {
	        // TODO Auto-generated method stub
	        writeXLSXFile(3, 3);
	    }
}
