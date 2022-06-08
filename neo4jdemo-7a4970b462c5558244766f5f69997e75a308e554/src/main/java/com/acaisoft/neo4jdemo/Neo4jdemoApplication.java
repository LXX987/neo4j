package com.acaisoft.neo4jdemo;

import org.neo4j.ogm.config.ClasspathConfigurationSource;
import org.neo4j.ogm.config.ConfigurationSource;
import org.neo4j.ogm.session.SessionFactory;
import org.neo4j.ogm.session.transaction.DefaultTransactionManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;

@SpringBootApplication
@EnableNeo4jRepositories
//@Configuration
//@EnableTransactionManagement
//@ComponentScan("com.acaisoft.neo4jdemo")
public class Neo4jdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Neo4jdemoApplication.class, args);
    }

    @Bean
    public org.neo4j.ogm.config.Configuration getConfiguration() {
        ConfigurationSource properties = new ClasspathConfigurationSource("db.properties");
        System.out.println(properties.properties().get("URI"));
        return new org.neo4j.ogm.config.Configuration.Builder(properties).build();
    }

    @Bean
    public SessionFactory sessionFactory() {
        return new SessionFactory(getConfiguration(), "com.acaisoft.neo4jdemo");
    }

//    @Bean
//    public Neo4jTransactionManager transactionManager() {
//        return new Neo4jTransactionManager(sessionFactory());
//    }

    @Bean
    public Neo4jTransactionManager getDefaultTransactionManager(){
        System.out.println("-----------------test----------------------------");
        return new Neo4jTransactionManager(sessionFactory());
    }

}

