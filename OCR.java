package ocr;

import java.io.File;
import java.io.IOException;
import net.sourceforge.tess4j.*;

public class OCR {

	public static void main(String[] args) throws IOException {
		
		File img = new File("/home/lenovo/eclipse-workspace/ocr/images/ocr_test5.png");
		
		
		ITesseract instance = new Tesseract(); 
		
		instance.setDatapath("/home/lenovo/eclipse-workspace/ocr/tessdata");
		
		try {
			String result = instance.doOCR(img);
			System.out.println(result);
			
		}catch(TesseractException e) {
			e.printStackTrace();
		}
	}

}
