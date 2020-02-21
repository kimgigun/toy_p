package com.myproject.web.controller;

import java.io.IOException;
import java.io.PrintStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.web.service.HomeService;

@Controller
public class HomeController {

	@Resource
	private HomeService serivce;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = { "/" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public ModelAndView home(Locale locale, Model model) throws Exception {
		List list = this.serivce.getMenuList();

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/main/main2");
		mav.addObject("list", list);
		return mav;
	}

	@RequestMapping(value = { "/exceldown" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public void excelDown(Locale locale, Model model, HttpServletRequest reuqest, HttpServletResponse response)
			throws IOException {
		Workbook xls = new XSSFWorkbook();

		ServletOutputStream sos = null;
		try {
			Sheet sheet = xls.createSheet("Excel");

			sheet.setColumnWidth(3, 5000);

			sheet.setColumnWidth(5, 5000);

			sheet.setColumnWidth(7, 5000);

			Row row = null;
			Cell cell = null;
			row = sheet.createRow(1);
			cell = row.createCell(2);
			cell.setCellValue("번호");
			cell = row.createCell(3);
			cell.setCellValue("제목");
			cell = row.createCell(4);
			cell.setCellValue("글쓴이");
			cell = row.createCell(5);
			cell.setCellValue("날짜");
			cell = row.createCell(6);
			cell.setCellValue("조회수");
			cell = row.createCell(7);
			cell.setCellValue("IP");

			for (int i = 0; i < 8; i++) {
				row = sheet.createRow(i + 2);
				cell = row.createCell(2);
				cell.setCellValue("1");
				cell = row.createCell(3);
				cell.setCellValue("2");
				cell = row.createCell(4);
				cell.setCellValue("3");
				cell = row.createCell(5);
				cell.setCellValue("4");
				cell = row.createCell(6);
				cell.setCellValue("5");
				cell = row.createCell(7);
				cell.setCellValue("6");
			}

			response.setHeader("Content-Disposition",
					"attachment; filename=" + URLEncoder.encode("excelDownload.xlsx", "UTF-8"));
			response.setContentType("application/vnd.ms.excel");

			sos = response.getOutputStream();
			xls.write(sos);
			((PrintStream) xls).close();
			sos.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (sos != null)
				sos.close();
		}
	}

	@RequestMapping(value = { "/login" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String login(Model model) {
		return "/login/login";
	}

	@RequestMapping(value = { "/main" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	public String main(Model model) {
		return "/main/main";
	}
}