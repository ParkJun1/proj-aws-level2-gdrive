package projawslevelgdrive.domain;

import projawslevelgdrive.domain.*;
import projawslevelgdrive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private Long fileKey;
}


