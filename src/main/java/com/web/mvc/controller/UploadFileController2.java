package com.web.mvc.controller;

import com.web.mvc.beans.Photo;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.codec.binary.Base64;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/upload2")
public class UploadFileController2 {
    private List<Photo> list = new ArrayList<>();
    private String emptyBase64 = "iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=";
    
    @GetMapping("/")
    public String input(Model model) {
        model.addAttribute("list", list);
        return "fileUploadView2";
    }

    @PostMapping("/uploadFile")
    public String submit(@RequestParam("file") MultipartFile file, @RequestParam("name") String name, Model model) {
        Photo photo = new Photo();
        photo.setName(name);
        photo.setBase64(getBase64(file));
        list.add(photo);
        model.addAttribute("list", list);
        return "fileUploadView2";
    }

    private String getBase64(MultipartFile file) {
        String base64 = null;
        File f = null;
        try {
            f = File.createTempFile("tmp", null);
            file.transferTo(f);
            f.deleteOnExit(); //使用完成刪除檔案
            // 進行 base64 編碼程序
            FileInputStream inputFile = new FileInputStream(f);
            byte[] buffer = new byte[(int) f.length()];
            inputFile.read(buffer);
            inputFile.close();
            base64 = new String(Base64.encodeBase64(buffer));

        } catch (Exception e) {
            e.printStackTrace();
        }
        return base64.length() == 0 ? emptyBase64 : base64;
    }
}
