package projawslevelgdrive.domain;

import projawslevelgdrive.domain.VideoProcessed;
import projawslevelgdrive.VideoProcessingApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Vedio_table")
@Data

public class Vedio  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String videoUrl;
    
    
    
    
    
    private Long fileKey;

    @PostPersist
    public void onPostPersist(){


        VideoProcessed videoProcessed = new VideoProcessed(this);
        videoProcessed.publishAfterCommit();

    }

    public static VedioRepository repository(){
        VedioRepository vedioRepository = VideoProcessingApplication.applicationContext.getBean(VedioRepository.class);
        return vedioRepository;
    }




    public static void processVideo(FileUploaded fileUploaded){

        /** Example 1:  new item 
        Vedio vedio = new Vedio();
        repository().save(vedio);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileUploaded.get???()).ifPresent(vedio->{
            
            vedio // do something
            repository().save(vedio);


         });
        */

        
    }


}
