package projawslevelgdrive.infra;
import projawslevelgdrive.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class VedioHateoasProcessor implements RepresentationModelProcessor<EntityModel<Vedio>>  {

    @Override
    public EntityModel<Vedio> process(EntityModel<Vedio> model) {

        
        return model;
    }
    
}
