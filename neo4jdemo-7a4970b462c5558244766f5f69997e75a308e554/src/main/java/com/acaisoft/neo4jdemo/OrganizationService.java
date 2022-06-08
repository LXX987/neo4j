package com.acaisoft.neo4jdemo;

import java.util.Collection;

public interface OrganizationService {
    Organization createMainOrganization(String name);

    Collection<Organization> findAll();

    int getAssetSumByOrganizationId(Long id);

    double getAssetAvgByOrganizationId(Long id);

    Organization save(Organization organization);

    Organization getById(Long id);

    Organization getByIdWithRelationships(Long id);

    void saveNOrganizationsWith8AssetsEach(Organization organization, int n);

    void saveOrganizationWith2LeveledTreeAnd1000Assets(Organization organization, int firstLevel, int secondLevel);

    void saveOrganizationWith3LeveledTree(Organization organization, int firstLevel, int secondLevel, int thirdLevel);

    void saveOrganizationWith4LeveledTree(Organization organization, int firstLevel, int secondLevel, int thirdLevel, int fourthLevel);

    void saveNAssetsToOrganization(Organization organization, int n);
}
