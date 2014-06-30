import java.io.FileOutputStream;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

public class DeckOfCards {

	public static void main(String[] args)  {	
		
		try {
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("Deck-of-Cards.pdf "));
			document.open();
			
			 
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(50);
			table.getDefaultCell().setFixedHeight(100);
			table.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
			table.getDefaultCell().setVerticalAlignment(Element.ALIGN_MIDDLE);
			
			BaseFont baseFont = BaseFont.createFont("./times.ttf", BaseFont.IDENTITY_H, true);
			Font black = new Font(baseFont, 30f, 0, BaseColor.BLACK);
            Font red = new Font(baseFont, 30f, 0, BaseColor.RED);
			
			String card;
			char sing;
						 
			for (int i = 2; i < 15; i++) {
				for (int j = 0; j < 4; j++) {

						switch (i) {
						case 11:card = "J";break;
						case 12:card = "Q";break;
						case 13:card = "K";break;
						case 14:card = "A";break;
						default: card = ""+i;break;
						}
						switch (j) {
						case 0:sing='\u2660';table.addCell(new Paragraph(card + sing+" ",black)); break;
						case 1:sing='\u2663';table.addCell(new Paragraph(card + sing+" ",black)); break;
						case 2:sing='\u2666';table.addCell(new Paragraph(card + sing+" ",red)); break;
						case 3:sing='\u2665';table.addCell(new Paragraph(card + sing+" ",red)); break;
						}

				}
				
			}
			document.add(table);
		document.close();
		}
		catch (Exception e) {
            e.printStackTrace();
		}
	}

}
