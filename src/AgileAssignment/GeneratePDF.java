
/*package AgileAssignment;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DrawInterface;
import com.itextpdf.text.pdf.draw.VerticalPositionMark;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JScrollPane;


public class GeneratePDF extends javax.swing.JFrame {


    public GeneratePDF() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButton1)
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton1)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("iTextHelloWorld.pdf"));
        } catch (DocumentException ex) {
            Logger.getLogger(GeneratePDF.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GeneratePDF.class.getName()).log(Level.SEVERE, null, ex);
        }

        document.open();
        com.itextpdf.text.Font font = FontFactory.getFont(FontFactory.COURIER_BOLD, 14, BaseColor.BLACK);
         Paragraph para, para2, para3, para4  = new Paragraph();
          para = new Paragraph("Fiore Flowershop Sdn. Bhd."+"\n"+"Kampus Utama, Jalan Genting Kelang, 53300 Kuala Lumpur, Wilayah Persekutuan Kuala Lumpur.", font);
         para.setAlignment(Element.ALIGN_CENTER);
         para2 = new Paragraph("Date: ", font);
         para2.setAlignment(Element.ALIGN_LEFT);
         
         Chunk glue = new Chunk(new VerticalPositionMark());
         para2.add(new Chunk(glue));
         para2.add("Customer ID: ");
         
         para3 = new Paragraph("==========================================================================");
         para4 = new Paragraph("ITEMIZED BILL FOR Customized Floral Arrangements.");
         
         PdfPTable table = new PdfPTable(4);
         table.setWidthPercentage(100);
        try {
            table.setWidths(new float[]{5,25,50,20});
        } catch (DocumentException ex) {
            Logger.getLogger(GeneratePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
         table.addCell("No. ");
         table.addCell("Category");
         table.addCell("Name");
         table.addCell("Price (RM)");
         
         table.addCell("1.");
         table.addCell("Baseket Arrangment");
         table.addCell("Sun Flower");
         table.addCell("30");
         
         table.addCell("2.");
         table.addCell("Flower");
         table.addCell("Sun Flower");
         table.addCell("30");
         
         table.addCell("3.");
         table.addCell("Size");
         table.addCell("Sun Flower");
         table.addCell("30");
         
         table.addCell("4.");
         table.addCell("Accessory");
         table.addCell("Sun Flower");
         table.addCell("30");
         
         table.addCell("5.");
         table.addCell("Priority");
         table.addCell("Sun Flower");
         table.addCell("30");
         
         
        //Chunk chunk = new Chunk("Hello World", font);

        try {
            document.add(para);
            document.add(para2);
            document.add(para3);
            document.add(para4);
            document.add(para3);
            document.add(table);
        } catch (DocumentException ex) {
            Logger.getLogger(GeneratePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        document.close();
        String name ="iTextHelloWorld";
        try {
            Runtime.getRuntime().exec("rundll32  url.dll, FileProtocolHandler " + "C:\\Users\\ThisPc\\Desktop\\DSAAssignment\\"+name+".pdf");
        } catch (IOException ex) {
            Logger.getLogger(GeneratePDF.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneratePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneratePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneratePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneratePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneratePDF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}*/
