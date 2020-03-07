package es.formacion.cip.alejandro.modelo;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreacionPDF {
    public static void crearPDFHolaMundo() throws FileNotFoundException, DocumentException {
        {
            Document document = new Document();
            @SuppressWarnings("unused")
            PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("Hola_Mundo_Alejandro.pdf"));
            document.open();

            Paragraph paragraph = new Paragraph();
            paragraph.add("¡Hola mundo!");

            document.add(paragraph);
            document.close();
        }
    }
}
