package projawslevelgdrive.domain;

import projawslevelgdrive.domain.*;
import projawslevelgdrive.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;

    public Indexed(Index aggregate){
        super(aggregate);
    }
    public Indexed(){
        super();
    }
}
