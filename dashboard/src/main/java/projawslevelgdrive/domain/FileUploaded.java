package projawslevelgdrive.domain;

import projawslevelgdrive.infra.AbstractEvent;
import lombok.Data;
import java.util.*;


@Data
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String type;
    private String userId;
}
