package factorymethod;

public class TestFactory {
    public static void main(String[] args) {
        DocumentFactory factory;
 
        
        factory = new WordDocumentFactory();
        Document wordDoc = factory.createDocument();
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();
 
        System.out.println("-------------------");
 
        factory = new PdfDocumentFactory();
        Document pdfDoc = factory.createDocument();
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();
 
        System.out.println("-------------------");
 
        
        factory = new ExcelDocumentFactory();
        Document excelDoc = factory.createDocument();
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}

