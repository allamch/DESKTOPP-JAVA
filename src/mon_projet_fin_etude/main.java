
package mon_projet_fin_etude;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import mon_projet_fin_etude.JavaCallJasperReport;

import net.sf.jasperreports.engine.JRException;

public class main {

	public static void main(String[] args) throws ClassNotFoundException, JRException, SQLException {
		JavaCallJasperReport pr = new JavaCallJasperReport();
		String rec="880";
		String ann="2019";
		String nom="Hassen Farhat";
		String matri = "800";
		String mt="100.000";
		String pym = "Prime";
                String reg = "BOZIDI AYDA";
	    BigDecimal amount = new BigDecimal(100.5);    
		pr.print1(rec,ann,nom,matri,mt,pym,reg);
		
	}

}
