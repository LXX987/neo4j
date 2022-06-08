package com.acaisoft.neo4jdemo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

import java.util.HashSet;
import java.util.Set;

@NodeEntity
@Data
@NoArgsConstructor
public class Organization {
    @Id
    @GeneratedValue
    private Long id;

    @Property(name = "name")
    private String name;

    @Relationship(type = "CHILD")
    private Set<Organization> children = new HashSet<>();

    @Relationship(type = "HAS")
    private Set<Asset> assets = new HashSet<>();
}
