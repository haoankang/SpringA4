package ank.hao.web;

import ank.hao.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){

        return "home";
    }

    @RequestMapping("/upload")
    public String upload(@RequestPart("photo") byte[] photo) throws Exception{
        FileOutputStream outputStream = new FileOutputStream("c:\\11.txt");

        outputStream.write(photo);
        return "home";
    }

    @RequestMapping("/upload2")
    //@RequestParam的参数必须和提交的命名保持一致，或者默认的命名
    public String upload2(@RequestParam MultipartFile multipartFile){
        System.out.println(multipartFile);
        return "success";
    }

    @RequestMapping("/exception/{status}")
    public String exception(@PathVariable Integer status) throws Exception {
        if(status==1){
            throw new MyException();
        }
        return "success";
    }
}
