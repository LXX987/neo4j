package com.acaisoft.neo4jdemo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomUtils;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
@Data
@NoArgsConstructor
public class Asset {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer sum = RandomUtils.nextInt(20, 100);
}
