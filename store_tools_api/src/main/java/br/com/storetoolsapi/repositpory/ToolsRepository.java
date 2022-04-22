package br.com.storetoolsapi.repositpory;

import br.com.storetoolsapi.model.Tools;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToolsRepository extends MongoRepository<Tools, String > {
}
