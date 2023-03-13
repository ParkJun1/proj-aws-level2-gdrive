package projawslevelgdrive.domain;

import projawslevelgdrive.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="vedios", path="vedios")
public interface VedioRepository extends PagingAndSortingRepository<Vedio, Long>{

}
