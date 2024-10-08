package com.his.department.controller;

import com.his.department.util.M;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

/**
 * 文件上传及下载
 */
@RestController
@RequestMapping("/Common")
public class CommonController {
    @Value("${}")
    private  String basePath;
    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping("/upload")
        public M upload(MultipartFile file){
            //file临时文件
        //原始文件名
        String originalFilename = file.getOriginalFilename();
        String suffix = originalFilename.substring(originalFilename.lastIndexOf("."));

        //使用UUID生成文件名，防止文件名重复
        String fileName = UUID.randomUUID().toString()+suffix;

        //创建一个目录
        File dir = new File(basePath);
        //判断当前目录是否存在
        if (!dir.exists()) {
            //目录不存在，创建
            dir.mkdirs();
        }

        try {
            file.transferTo(new File(basePath+fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return  M.ok().data("fileName",fileName);
        }

        public  void download(String name, HttpServletResponse response){

            try {
                //输入流，读取数据
                FileInputStream fileInputStream = new FileInputStream(new File(basePath+name));

                //输出流，写回到浏览器中
                ServletOutputStream outputStream = response.getOutputStream();
               //IOUtils.copy(fileInputStream,outputStream);
                response.setContentType("image/jpeg");

                int len=0;
                byte[] bytes=new byte[1024];
                while ((len = fileInputStream.read(bytes)) != -1) {
                    outputStream.write(bytes,0,len);
                    outputStream.flush();
                }

                //关闭资源
                fileInputStream.close();
                outputStream.close();

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
}
