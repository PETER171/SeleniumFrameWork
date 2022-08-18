package Demo;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.annotations.Test;

public class ReadPDF {
	
	@Test
	public void read() throws IOException{
		
		URL url = new URL("file:///Users/leratopeterkhambulo/Documents/Manual%20Testing/COMMRISK/16717431.pdf");
		
		InputStream is = url.openStream();
		BufferedInputStream fileParse = new BufferedInputStream(is);
		PDDocument a = null;
		
		a = PDDocument.load(fileParse);
		String pdfContentString = new PDFTextStripper().getText(a);
		System.out.println(pdfContentString);
		
		
	
	}
	
}
