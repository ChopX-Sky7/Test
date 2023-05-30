package TestProj.Test.services;

import TestProj.Test.entities.FormMessages;
import TestProj.Test.repos.MessagesRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Service
@Slf4j
@RequiredArgsConstructor
public class MessageService {

    private final MessagesRepository repository;

    private final File contentPath = new File("/resources/static/content/");

    /*public void saveFile(FormMessages message,
                         MultipartFile file) throws IOException {
        File temp = new File(contentPath, file.getName());
        String tempFormat = FilenameUtils.getExtension(temp.getCanonicalPath());

//        FileOutputStream foc = new FileOutputStream();


    }
*/
    public void saveMessage(FormMessages messages){
        repository.save(messages);
    }

}
