/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class PDFGenerator {

    public void generate() {
        try {
            //Creación del documento de tamaño Carta
            Document doc = new Document(PageSize.LETTER);

            JFileChooser fileChooser = new JFileChooser();
            int seleccion = fileChooser.showSaveDialog(null);
            try {
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    File JFC = fileChooser.getSelectedFile();
                    String path = JFC.getAbsolutePath();

                    PdfWriter pdfw = PdfWriter.getInstance(doc, new FileOutputStream(path + ".pdf"));
                    // 72 puntos = 1 inch - Left, rigth, top, bottom
                    doc.setMargins(72f, 72f, 72f, 72f);

                    doc.open();

                    doc.add(new Paragraph("Intento de creación del PDF"));

                    doc.close();

                }
            } catch (Exception e) {
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se ha podido generar el PDF.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
