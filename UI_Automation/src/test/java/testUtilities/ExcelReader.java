package testUtilities;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelReader {
	private XLSContainer xLSContainer;

    public XLSContainer readXLS(XLSFile xLSFile) {
        try {

            WorkbookSettings ws = new WorkbookSettings();
            ws.setLocale(new Locale("en", "EN"));
            Workbook workbook = Workbook.getWorkbook(new File(xLSFile.getFileName()), ws);
            Sheet s = workbook.getSheet(0);
            System.out.println("Sheet Content::" + s.getName());
            readDataSheet(s);
            workbook.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return xLSContainer;

    }

    private void readDataSheet(Sheet s) {
        xLSContainer = new XLSContainer();

        int noOfRows = s.getRows();
        int noOfCols = s.getColumns();



        for (int i = 0; i < noOfRows; i++) {
            Vector item = new Vector();
            for (int j = 0; j < noOfCols; j++) {

                if (s.getCell(j, i).getContents() == "") {
                    item.add("");

                } else {
                    item.add(s.getCell(j, i).getContents());

                }
            }

            if (i == 0) {
                xLSContainer.addHeader(item);
            }else{
                xLSContainer.addRow(item);
            }
        }
    }
}
