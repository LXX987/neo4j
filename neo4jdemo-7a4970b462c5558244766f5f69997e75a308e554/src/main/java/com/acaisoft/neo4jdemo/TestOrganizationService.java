package com.acaisoft.neo4jdemo;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class TestOrganizationService implements OrganizationService {
    private final OrganizationRepository organizationRepository;

    @Override
    public Organization createMainOrganization(String name) {
        Organization organization = new Organization();
        organization.setName(name);
        return organizationRepository.save(organization);
    }

    @Override
    public Collection<Organization> findAll() {
        return organizationRepository.findAll();
    }

    @Override
    public int getAssetSumByOrganizationId(Long id) {
        return organizationRepository.getAssetSumByOrganizationId(id);
    }

    @Override
    public double getAssetAvgByOrganizationId(Long id) {
        return organizationRepository.getAssetAvgByOrganizationId(id);
    }

    @Override
    public Organization save(Organization organization) {
        return organizationRepository.save(organization);
    }

    @Override
    public Organization getById(Long id) {
        return organizationRepository.getById(id);
    }

    @Override
    public Organization getByIdWithRelationships(Long id) {
        return organizationRepository.getByIdWithRelationships(id);
    }

    @Override
    public void saveNOrganizationsWith8AssetsEach(Organization organization, int n) {
        for (int i = 0; i < n; i++) {
            Organization child = new Organization();
            child.setName("organization" + i);

            for (int j = 0; j < 8; j++) {
                Asset asset = new Asset();
                asset.setName("asset" + j);
                child.getAssets().add(asset);
            }
            organization.getChildren().add(child);
        }
    }

    @Override
    public void saveOrganizationWith2LeveledTreeAnd1000Assets(Organization organization, int firstLevel, int secondLevel) {
        for (int i = 0; i < firstLevel; i++) {
            Organization child = new Organization();
            child.setName("organization" + i);

            for (int j = 0; j < secondLevel; j++) {
                Organization grandChild = new Organization();
                grandChild.setName(RandomStringUtils.randomAlphabetic(10));

                for(int k = 0; k < 1000; k++) {
                    Asset asset = new Asset();
                    asset.setName("asset" + k);
                    grandChild.getAssets().add(asset);
                }
                child.getChildren().add(grandChild);
            }
            organization.getChildren().add(child);
        }
        organizationRepository.save(organization);
    }

    @Override
    public void saveOrganizationWith3LeveledTree(Organization organization, int firstLevel, int secondLevel, int thirdLevel) {
        for (int i = 0; i < firstLevel; i++) {
            Organization child = new Organization();
            organization.setName(RandomStringUtils.randomAlphabetic(10));

            for(int j = 0; j < secondLevel; j++) {
                Organization grandChild = new Organization();
                organization.setName(RandomStringUtils.randomAlphabetic(10));

                for(int k = 0; k < thirdLevel; k++) {
                    Organization greatGrandChild = new Organization();
                    organization.setName(RandomStringUtils.randomAlphabetic(10));

                    for (int l = 0; l < 8; l++) {
                        Asset asset = new Asset();
                        asset.setName(RandomStringUtils.randomAlphabetic(10));
                        greatGrandChild.getAssets().add(asset);
                    }
                    grandChild.getChildren().add(greatGrandChild);
                }
                child.getChildren().add(grandChild);
            }
            organization.getChildren().add(child);
        }
        organizationRepository.save(organization);
    }

    @Override
    public void saveOrganizationWith4LeveledTree(Organization organization, int firstLevel, int secondLevel, int thirdLevel, int fourthLevel) {
        for (int i = 0; i < firstLevel; i++) {
            Organization child = new Organization();
            child.setName(RandomStringUtils.randomAlphabetic(10));

            for(int j = 0; j < secondLevel; j++) {
                Organization grandChild = new Organization();
                grandChild.setName(RandomStringUtils.randomAlphabetic(10));

                for(int k = 0; k < thirdLevel; k++) {
                    Organization greatGrandChild = new Organization();
                    greatGrandChild.setName(RandomStringUtils.randomAlphabetic(10));

                    for (int o = 0; o < fourthLevel; o++) {
                        Organization greatGreatGrandChild = new Organization();
                        greatGreatGrandChild.setName(RandomStringUtils.randomAlphabetic(10));

                        for (int l = 0; l < 8; l++) {
                            Asset asset = new Asset();
                            asset.setName(RandomStringUtils.randomAlphabetic(10));
                            greatGreatGrandChild.getAssets().add(asset);
                        }

                        greatGrandChild.getChildren().add(greatGreatGrandChild);
                    }

                    grandChild.getChildren().add(greatGrandChild);
                }
                child.getChildren().add(grandChild);
            }
            organization.getChildren().add(child);
        }
        organizationRepository.save(organization);
    }

    @Override
    public void saveNAssetsToOrganization(Organization organization, int n) {
        for(int i = 0; i < n; i++) {
            Asset asset = new Asset();
            asset.setName(RandomStringUtils.randomAlphabetic(10));
            organization.getAssets().add(asset);
        }
        organizationRepository.save(organization);
    }
}
