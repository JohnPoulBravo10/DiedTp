package Clases;

import java.io.FileOutputStream;
import java.util.List;   
        
              
        
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;

public class OrdenProvisionPDFGenerator {

    public void generarPDF(String numeroOrden, String sucursalOrigen, String sucursalDestino, String camino,int tiempo,
            List<Integer> productos) {
        Document document = new Document(PageSize.A4);

        try {
            PdfWriter.getInstance(document, new FileOutputStream("orden_provision_" + numeroOrden + ".pdf"));
            document.open();

            // Encabezado
            Font fontEncabezado = new Font(Font.FontFamily.HELVETICA, 16, Font.BOLD);
            Paragraph encabezado = new Paragraph("Orden de Provisión", fontEncabezado);
            encabezado.setAlignment(Element.ALIGN_CENTER);
            document.add(encabezado);

            // Información de la orden
            Paragraph infoOrden = new Paragraph("Número de Orden: " + numeroOrden);
            document.add(infoOrden);

            Paragraph origenDestino = new Paragraph("Origen: " + sucursalOrigen + " - Destino: " + sucursalDestino);
            document.add(origenDestino);

            Paragraph caminoRecorrido = new Paragraph("Camino: " + camino);
            document.add(caminoRecorrido);
            
            Paragraph tiempoRecorrido = new Paragraph("Tiempo de llegada: " + tiempo);
            document.add(tiempoRecorrido);

            // Lista de productos
            PdfPTable table = new PdfPTable(1);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            Font fontProductos = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL);

            for (int producto : productos) {
                PdfPCell cell = new PdfPCell(new Paragraph("Producto "+ producto, fontProductos));
                cell.setBorder(PdfPCell.NO_BORDER);
                table.addCell(cell);
            }

            document.add(table);

            document.close();
            
          
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
}
