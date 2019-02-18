package com.myapp.service;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import com.myapp.dao.FileDataRepository;
import com.myapp.model.FileData;

@Service
public class PdfReaderService {
	
	@Autowired
	private FileDataRepository fileDataRepository;

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
	
	public void saveData(List<String> contents) {
		if(!contents.isEmpty()) {
			for(String content : contents) {
				FileData data = new FileData();
				data.setContent(content);
				fileDataRepository.save(data);
			}
		}
	}

}
