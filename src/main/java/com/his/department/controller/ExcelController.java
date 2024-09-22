package com.his.department.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.excel.EasyExcel;
import com.his.department.entity.Department;
import com.his.department.service.DepartmentService;
import com.his.department.util.M;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.net.URLEncoder;
import cn.hutool.extra.tokenizer.Result;
import cn.hutool.poi.excel.ExcelReader;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;

@RestController
@CrossOrigin
@RequestMapping("/his/department")
public class ExcelController {
	@Autowired
	private DepartmentService departmentService;
	/**
	 * 下载模板
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/downloadExcel")
    public void downloadExcel(HttpServletResponse response) throws IOException {  
        // 指定文件在工程中的位置（例如：src/main/resources/excel/）  
        String filePath = "excel.xlsx";  
  
        // 尝试获取资源  
        Resource resource = new ClassPathResource(filePath);  
        if (!resource.exists()) {  
            throw new RuntimeException("文件不存在！");  
        }  
  
        // 设置响应头  
        String fileName = "excel.xlsx"; // 设置要下载的文件名  
        response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);  
        response.setCharacterEncoding("utf-8");  
        String headerValue = "attachment; filename*=UTF-8''" + java.net.URLEncoder.encode(fileName, "UTF-8");  
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, headerValue);  
  
        // 读取文件内容并写入到response的输出流中  
        try (InputStream inputStream = resource.getInputStream();  
             OutputStream outputStream = response.getOutputStream()) {  
  
            byte[] buffer = new byte[4096];  
            int bytesRead = -1;  
            while ((bytesRead = inputStream.read(buffer)) != -1) {  
                outputStream.write(buffer, 0, bytesRead);  
            }  
  
            outputStream.flush();  
        }
    }
	/**
	 * 根据ids数组查询，用于导出excel
	 */
	@RequestMapping("/selectDepartmentsByids")
	public M selectDepartmentsByids(@RequestParam Integer[] ids){
		List<Department> list=departmentService.selectDepartmentsByids(ids);
		return M.ok().data("list",list);
	}
	
	/*
	 * @RequestMapping("/uploadExcel")
	 */
	@RequestMapping("/uploadExcel")
	public M batchInsert(@RequestBody List<Department> department) throws Exception {
		boolean flag=departmentService.batchInsert(department);
		if (flag==true) {
			return M.ok();
		} else {
			return M.error();
		}
	}
}
