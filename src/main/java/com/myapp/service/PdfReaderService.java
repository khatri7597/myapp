package com.myapp.service;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

@Service
public class PdfReaderService {

	@SuppressWarnings("unchecked")
	public JSONObject readFile(MultipartFile file) {
		try {
			PdfReader reader = new PdfReader(file.getBytes());
			StringBuffer buffer = new StringBuffer("");
			for (int i = 1; i <= reader.getNumberOfPages(); i++) {
				buffer.append(PdfTextExtractor.getTextFromPage(reader, i) + "\n");
			}
			JSONObject pdfContent = new JSONObject();
			pdfContent.put("pdfData", buffer.toString());
			reader.close();
			return pdfContent;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new JSONObject();
	}

}
