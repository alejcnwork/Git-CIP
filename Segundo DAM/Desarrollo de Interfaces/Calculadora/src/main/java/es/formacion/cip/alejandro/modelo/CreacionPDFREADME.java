package es.formacion.cip.alejandro.modelo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreacionPDFREADME {

    /**
     * Este método nos crea un PDF en la raiz del proyecto simulando el README.MD que tenemos en el repositorio de GitHub
     */
    public static void crearPDFREADME() throws IOException, DocumentException {
        {
            Document document = new Document();
            @SuppressWarnings("unused")
            com.itextpdf.text.pdf.PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream("README.pdf"));
            document.open();



            /**
             * creamos fuentes
             */
            Font fontTitulo = FontFactory.getFont(FontFactory.HELVETICA.toString(), 26, Font.NORMAL);

            /**
             * creamos parrafos
             */
            Paragraph title0 = new Paragraph(new Paragraph("Proyecto Calculadora\n", fontTitulo));
            Image img = Image.getInstance("image-calcu.jpg");
            img.scaleAbsolute(160,160);
            Paragraph title1 = new Paragraph(new Paragraph("\nComenzando\n", fontTitulo));
            Paragraph paragraph1 = new Paragraph();
            Paragraph title2 = new Paragraph(new Paragraph("Construido con\n", fontTitulo));
            Paragraph paragraph2 = new Paragraph();
            Paragraph title3 = new Paragraph(new Paragraph("Autores\n", fontTitulo));
            Paragraph paragraph3 = new Paragraph();
            Paragraph title4 = new Paragraph(new Paragraph("Licencia\n", fontTitulo));
            Paragraph paragraph4 = new Paragraph();

            /**
             *  Modificamos parrafos
             */
            title0.setAlignment(Element.ALIGN_CENTER);
            img.setAlignment(Element.ALIGN_CENTER);
            title1.setAlignment(Element.ALIGN_CENTER);
            paragraph1.setAlignment(Element.ALIGN_CENTER);
            title2.setAlignment(Element.ALIGN_CENTER);
            paragraph2.setAlignment(Element.ALIGN_CENTER);
            title3.setAlignment(Element.ALIGN_CENTER);
            paragraph3.setAlignment(Element.ALIGN_CENTER);
            title4.setAlignment(Element.ALIGN_CENTER);
            paragraph4.setAlignment(Element.ALIGN_CENTER);

            /**
             * ingresamos los parrafos
             */
            paragraph1.add("Esta app calculadora te permite hacer cálculos matemáticos, en esta versión \"Tarea 7\" \nestán disponibles las operaciones de sumar, restar, multiplicar, dividir y de resto.\n\n");
            paragraph2.add("Java - Lenguaje de programación\n\n");
            paragraph2.add("IntellJ - IDE\n\n");
            paragraph2.add("Maven - Manejador de dependencias\n\n");
            paragraph3.add("Alejandro Cea\n\n");
            paragraph4.add("Este proyecto está bajo la Licencia Open-Source\n\n");

            document.add(title0);
            document.add(img);
            document.add(title1);
            document.add(paragraph1);
            document.add(title2);
            document.add(paragraph2);
            document.add(title3);
            document.add(paragraph3);
            document.add(title4);
            document.add(paragraph4);
            document.close();
        }

    }
}
