package TestProj.Test;

import TestProj.Test.entities.FormMessages;
import TestProj.Test.repos.MessagesRepository;
import TestProj.Test.services.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/send")
public class FormController {


    private final MessagesRepository repository;
    private final MessageService service;



    @ModelAttribute(name = "message")
    public FormMessages addMessageToModel(Model model){
        return new FormMessages();
    }

    @GetMapping("/new")
    public String form(){
        return "send-files";
    }

    @PostMapping
    public String process(FormMessages message){
        message.setSentAt(new Date());
        service.saveMessage(message);
        return "send-files";
    }



}
