package projawslevelgdrive.domain;

import projawslevelgdrive.domain.*;
import projawslevelgdrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private Long fileKey;

    public VideoProcessed(Vedio aggregate){
        super(aggregate);
    }
    public VideoProcessed(){
        super();
    }
}
