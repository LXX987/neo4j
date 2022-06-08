package com.acaisoft.neo4jdemo;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface OrganizationRepository extends Neo4jRepository<Organization, Long> {
    @Query(value = "MATCH (n:Organization{name:{name}}) return n")
    Organization findByName(@Param("name") String name);

    @Query(value="MATCH (n:Organization) return n")
    Collection<Organization> findAll();

    @Query(value = "MATCH (o:Organization) where ID(o) = {id} return o")
    Organization getById(@Param("id") Long id);

    @Query(value = "MATCH (o:Organization)-[HAS*]->(a:Asset) where ID(o) = {id} return sum(a.sum)")
    int getAssetSumByOrganizationId(@Param("id") Long id);

    @Query(value = "MATCH (o:Organization)-[HAS*]->(a:Asset) where ID(o) = {id} return avg(a.sum)")
    double getAssetAvgByOrganizationId(@Param("id") Long id);

    @Query(value = "MATCH (n:Organization)-[r]-() WHERE ID(n) = {id} return n;")
    Organization getByIdWithRelationships(@Param("id") Long id);
}
