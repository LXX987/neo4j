package com.acaisoft.neo4jdemo;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssetRepository extends Neo4jRepository<Asset, Long> {

}
