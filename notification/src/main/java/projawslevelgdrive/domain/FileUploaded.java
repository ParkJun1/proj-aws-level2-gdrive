package projawslevelgdrive.domain;

import projawslevelgdrive.domain.*;
import projawslevelgdrive.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String type;
    private String userId;
}


