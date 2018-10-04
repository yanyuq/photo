package com.heasaima.photo.web;

import com.heasaima.photo.config.file.FileProperties;
import com.heasaima.photo.mapper.model.PhotoInfo;
import com.heasaima.photo.service.PhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author YanYuq
 */
@RestController
@RequestMapping("/photo")
public class PhotoController {

    @Autowired
    private PhotoService photoService;

    @Autowired
    private FileProperties fileProperties;

    @RequestMapping("fileUpload")
    public String fileUpload(@RequestParam("file") MultipartFile file, String description) {
        if (file.isEmpty()) {
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();

        String confPath = fileProperties.getPath();
        // TODO to util
        long dateLong = System.currentTimeMillis() / (1000 * 60 * 24);
        String path = "d" + dateLong + "/" + UUID.randomUUID() + fileName;
                File dest = new File(confPath + path);
        // 判断文件父目录是否存在
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            // 保存文件
            file.transferTo(dest);
            PhotoInfo photoInfo = new PhotoInfo();
            photoInfo.setName(fileName);
            photoInfo.setPath(path);
            // TODO to SQL
            photoInfo.setCreateTime(new Date());
            photoInfo.setUpdateTime(new Date());
            photoInfo.setUserId(1);
            photoInfo.setUserName("heasaima");
            photoInfo.setCreateBy("heasaima");
            photoInfo.setUpdateBy("heasaima");
            photoInfo.setDescription(description);
            photoService.insert(photoInfo);
            return "true";
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }

    @RequestMapping("list")
    public List<PhotoInfo> list(){
        PhotoInfo photoInfo = new PhotoInfo();
        photoInfo.setUserName("heasaima");
        List<PhotoInfo> photoInfos = photoService.queryList(photoInfo);
//        photoInfos.forEach(img -> img.setPath(fileProperties.getPath()+img.getPath()));
        return photoInfos;
    }

    @RequestMapping(value = "path/{imgId}", method = RequestMethod.GET)
    public String IoReadImage(@PathVariable Integer imgId, HttpServletRequest request, HttpServletResponse response) throws IOException {
        ServletOutputStream out = null;
        FileInputStream ips = null;
        try {
            //获取图片存放路径
            PhotoInfo photoInfo = photoService.selectByPrimaryKey(imgId);
            String imgPath = fileProperties.getPath()+photoInfo.getPath();
            ips = new FileInputStream(new File(imgPath));
            response.setContentType("multipart/form-data");
            out = response.getOutputStream();
            //读取文件流
            int len = 0;
            byte[] buffer = new byte[1024 * 10];
            while ((len = ips.read(buffer)) != -1){
                out.write(buffer,0,len);
            }
            out.flush();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            out.close();
            ips.close();
        }
        return null;
    }

}
