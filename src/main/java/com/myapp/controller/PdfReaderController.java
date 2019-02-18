package com.myapp.controller;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.myapp.service.PdfReaderService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/file/reader")
@CrossOrigin(origins = "*", allowedHeaders = "*")
@Api(value="Pdfreader")
public class PdfReaderController {

	public static final String READ_FILE_ENDPOINT = "/read";
	public static final String SAVE_FILE_ENDPOINT = "/save";

	@Autowired
	private PdfReaderService pdfReaderService;

	@ApiOperation(value = "readFile")
	@RequestMapping(value = READ_FILE_ENDPOINT, method = RequestMethod.POST, consumes = { "multipart/form-data" })
	@ResponseBody
	public JSONObject readFile(@RequestParam MultipartFile file) {
		return pdfReaderService.readFile(file);
	}
	
	@RequestMapping(value = SAVE_FILE_ENDPOINT, method = RequestMethod.POST)
	public ResponseEntity<String> saveFile(@RequestBody List<String> contents) {
		pdfReaderService.saveData(contents);
		return new ResponseEntity<String>(HttpStatus.CREATED);	
	}

}
