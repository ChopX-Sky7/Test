package TestProj.Test.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.lang.Nullable;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;

@Data
@Entity
public class FormMessages {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private Date sentAt;
    private String textMessage;


}
