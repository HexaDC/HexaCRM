/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkt_Util;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jenny
 */
public class ReportDAO {

    private Connection conn;

    public ReportDAO() {
        try {
            conn = new ConnectionFactory().useConnection();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    private String parametro_01;

    public String getParametro_01() {
        return parametro_01;
    }

    public void setParametro(String parametro) {
        this.parametro_01 = parametro;
    }

    public void relatorioListaEmpresa() throws IOException {
        try {

            HashMap parametro = new HashMap();
            parametro.put("EMPRESA_ID", parametro_01);
            JasperReport report = (JasperReport) JRLoader.loadObject(ReportDAO.class.getResource("/pkt_Relatorio/rltListaEmpresa.jasper"));
            JasperPrint print = JasperFillManager.fillReport(report, parametro, conn);

            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setTitle("Hexa CRM - Customer Relationship Management");
            viewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(ReportDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Argh! : " + ex.getLocalizedMessage());
            System.out.println("Argh 02! : " + ex.getStackTrace());
        }
    }

    public byte[] readImageAsByteArray(String filename) throws IOException {
        byte[] buffer = new byte[1024];
        InputStream is = this.getClass().getResourceAsStream(filename);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while (is.read(buffer) != -1) {
            out.write(buffer);
        }
        return out.toByteArray();
    }
}
