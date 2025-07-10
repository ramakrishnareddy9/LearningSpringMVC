package com.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FileController {

    @RequestMapping("/showFileForm")
    public String showUplodedFile() {

        return "FileForm";
    }

    @RequestMapping(value = "/uploadimage",method = RequestMethod.POST)
    public String uploadFile(@RequestParam("profile") CommonsMultipartFile file, HttpSession session, Model model) {
        System.out.println("File uploaded handler");
        System.out.println(file.getSize());
        byte[] fileData = file.getBytes(); // stores the file in byte array
        // we have to save the file in database or to server or to file system
        String path = session.getServletContext().getRealPath("/resources/images");
        String fullPath = path + File.separator + file.getOriginalFilename();
        System.out.println(path);
        try {
            File dir = new File(path);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            FileOutputStream fos = new FileOutputStream(fullPath);
            fos.write(fileData);
            fos.close();
            System.out.println("File uploaded successfully");
            model.addAttribute("message", "File uploaded successfully");
            model.addAttribute("fileName", file.getOriginalFilename());
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("File upload failed");
            model.addAttribute("message", "File upload failed");
            model.addAttribute("fileName", file.getOriginalFilename());
        }
        return "fileSccuess";
    }
}
