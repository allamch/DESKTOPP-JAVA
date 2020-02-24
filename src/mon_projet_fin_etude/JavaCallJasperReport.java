/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mon_projet_fin_etude;
import java.io.File;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;


import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.ExporterInput;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author USER
 */
public class JavaCallJasperReport {
    
    
    
    public void print1(String rec, String ann, String nom, String matri, String mt, String pym, String reg) throws JRException {
		try {
			/* User home directory location */
			String userHomeDirectory = System.getProperty("C:/Users/USER/Report");
			

			/* Map to hold Jasper report Parameters */
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("p1", rec);
			parameters.put("p2", ann);
			parameters.put("p3", nom);
			parameters.put("p4", matri);
			parameters.put("p5", mt);
			parameters.put("p6", pym);
                        parameters.put("p7", reg);
			/* Using compiled version(.jasper) of Jasper report to generate PDF */
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					"C:/Users/USER/Documents/NetBeansProjects/mon_projet_fin_etude/src/jasper/credit2.jasper", parameters, new JREmptyDataSource());
			
                        JasperViewer jasperViewer = new JasperViewer(jasperPrint,false);
                        
                        jasperViewer.viewReport( jasperPrint, false );
			File outDir = new File("C:/Credit");
			outDir.mkdirs();

			JRPdfExporter exporter = new JRPdfExporter();

			ExporterInput exporterInput = new SimpleExporterInput(jasperPrint);

			exporter.setExporterInput(exporterInput);

             // ExporterOutput
			OutputStreamExporterOutput exporterOutput = new SimpleOutputStreamExporterOutput("C:/Credit/credit.pdf");
            
            // Output
			exporter.setExporterOutput(exporterOutput);
			SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
			exporter.setConfiguration(configuration);
			exporter.exportReport();

		} catch (JRException e1) {
			e1.printStackTrace();
		}
		System.out.print("Done!");
	}

    
    
    public void print2(String rec, String ann, String cdb,String nom,String cin, String dliv,String dec, String mt, String pym) throws JRException {
		try {
			/* User home directory location */
			String userHomeDirectory = System.getProperty("C:/Users/USER/Report");

			/* Map to hold Jasper report Parameters */
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("p1", rec);
			parameters.put("p2", ann);
			parameters.put("p3", cdb);
			parameters.put("p4", nom);
			parameters.put("p5", cin);
			parameters.put("p6", dliv);
			parameters.put("p7", dec);
			parameters.put("p8", mt);
			parameters.put("p9", pym);

			/* Using compiled version(.jasper) of Jasper report to generate PDF */
			JasperPrint jasperPrint = JasperFillManager.fillReport(
					"C:/Users/USER/Documents/NetBeansProjects/mon_projet_fin_etude/src/jasper/debit.jasper", parameters, new JREmptyDataSource());
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false);
                        jasperViewer.viewReport( jasperPrint, false );
			File outDir = new File("C:/Credit");
			outDir.mkdirs();

			JRPdfExporter exporter = new JRPdfExporter();

			ExporterInput exporterInput = new SimpleExporterInput(jasperPrint);

			exporter.setExporterInput(exporterInput);

             // ExporterOutput
			OutputStreamExporterOutput exporterOutput = new SimpleOutputStreamExporterOutput("C:/Credit/debit.pdf");
            
            // Output
			exporter.setExporterOutput(exporterOutput);
			SimplePdfExporterConfiguration configuration = new SimplePdfExporterConfiguration();
			exporter.setConfiguration(configuration);
			exporter.exportReport();

		} catch (JRException e1) {
			e1.printStackTrace();
		}
		System.out.print("Done!");
	}

    
    
    
    
    
    
    
}
