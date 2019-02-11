package com.myapp.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.myapp.service.PdfReaderService;

@RestController
@RequestMapping(value = "/file/reader")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PdfReaderController {

	public static final String READ_FILE_ENDPOINT = "/read";
	public static final String SAVE_FILE_ENDPOINT = "/save";

	@Autowired
	private PdfReaderService pdfReaderService;

	@RequestMapping(value = READ_FILE_ENDPOINT, method = RequestMethod.POST, consumes = { "multipart/form-data" })
	@ResponseBody
	public JSONObject readFile(@RequestParam MultipartFile file) {
		return pdfReaderService.readFile(file);
	}

}
