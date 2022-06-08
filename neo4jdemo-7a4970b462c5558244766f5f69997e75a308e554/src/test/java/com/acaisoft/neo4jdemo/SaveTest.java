package com.acaisoft.neo4jdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.neo4j.DataNeo4jTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataNeo4jTest
public class SaveTest {
    private static final long BIALYSTOK_ID = 484080L; //10000 organizacji - 8 assetow w kazdej
    private static final long BIALYSTOK2_ID = 574085L; //100 org - 10 suborg - 10 grup - 8 assetow w kazdej
    private static final long BIALYSTOK3_ID = 665186L; //10 org - 10 suborg - 10 grup - 10 grup - 8 assetow w kazdej
    private static final long BIALYSTOK5_ID = 769278L; //10 org - 8 subord - 1000 assetow w kazdej
    private static final long BIALYSTOK6_ID = 849369L; //1 org - 80000 assetow w niej

    private static final long BIALYSTOK_CHILD_ID = 484156L;
    private static final long BIALYSTOK_CHILD2_ID = 581617L;
    private static final long BIALYSTOK_CHILD3_ID = 671477L;
    private static final long BIALYSTOK_CHILD5_ID = 769343L;

    @Autowired
    private OrganizationService organizationService;

    @Test
    public void calculateSumForBialystokOrganization() {
        long startTime = System.currentTimeMillis();

        int sum = organizationService.getAssetSumByOrganizationId(BIALYSTOK_ID);
        System.out.println("SUM: " + sum);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateAvgForBialystokOrganization() {
        long startTime = System.currentTimeMillis();

        double avg = organizationService.getAssetAvgByOrganizationId(BIALYSTOK_ID);
        System.out.println("AVERAGE: " + avg);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateSumForBialystok2Organization() {
        long startTime = System.currentTimeMillis();

        int sum = organizationService.getAssetSumByOrganizationId(BIALYSTOK2_ID);
        System.out.println("SUM: " + sum);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateAvgForBialystok2Organization() {
        long startTime = System.currentTimeMillis();

        double avg = organizationService.getAssetAvgByOrganizationId(BIALYSTOK2_ID);
        System.out.println("AVERAGE: " + avg);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateSumForBialystok3Organization() {
        long startTime = System.currentTimeMillis();

        int sum = organizationService.getAssetSumByOrganizationId(BIALYSTOK3_ID);
        System.out.println("SUM: " + sum);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateAvgForBialystok3Organization() {
        long startTime = System.currentTimeMillis();

        double avg = organizationService.getAssetAvgByOrganizationId(BIALYSTOK3_ID);
        System.out.println("AVERAGE: " + avg);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateSumForBialystok5Organization() {
        long startTime = System.currentTimeMillis();

        int sum = organizationService.getAssetSumByOrganizationId(BIALYSTOK5_ID);
        System.out.println("SUM: " + sum);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateAvgForBialystok5Organization() {
        long startTime = System.currentTimeMillis();

        double avg = organizationService.getAssetAvgByOrganizationId(BIALYSTOK5_ID);
        System.out.println("AVERAGE: " + avg);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateSumForBialystok6Organization() {
        long startTime = System.currentTimeMillis();

        int sum = organizationService.getAssetSumByOrganizationId(BIALYSTOK6_ID);
        System.out.println("SUM: " + sum);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateAvgForBialystok6Organization() {
        long startTime = System.currentTimeMillis();

        double avg = organizationService.getAssetAvgByOrganizationId(BIALYSTOK6_ID);
        System.out.println("AVERAGE: " + avg);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateSumforBialystokChildOrganization() {
        long startTime = System.currentTimeMillis();

        int sum = organizationService.getAssetSumByOrganizationId(BIALYSTOK_CHILD_ID);
        System.out.println("SUM: " + sum);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateAvgforBialystokChildOrganization() {
        long startTime = System.currentTimeMillis();

        double avg = organizationService.getAssetAvgByOrganizationId(BIALYSTOK_CHILD_ID);
        System.out.println("AVERAGE: " + avg);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateSumforBialystokChild2Organization() {
        long startTime = System.currentTimeMillis();

        int sum = organizationService.getAssetSumByOrganizationId(BIALYSTOK_CHILD2_ID);
        System.out.println("SUM: " + sum);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateAvgforBialystokChild2Organization() {
        long startTime = System.currentTimeMillis();

        double avg = organizationService.getAssetAvgByOrganizationId(BIALYSTOK_CHILD2_ID);
        System.out.println("AVERAGE: " + avg);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateSumforBialystokChild3Organization() {
        long startTime = System.currentTimeMillis();

        int sum = organizationService.getAssetSumByOrganizationId(BIALYSTOK_CHILD3_ID);
        System.out.println("SUM: " + sum);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateAvgforBialystokChild3Organization() {
        long startTime = System.currentTimeMillis();

        double avg = organizationService.getAssetAvgByOrganizationId(BIALYSTOK_CHILD3_ID);
        System.out.println("AVERAGE: " + avg);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateSumforBialystokChild5Organization() {
        long startTime = System.currentTimeMillis();

        int sum = organizationService.getAssetSumByOrganizationId(BIALYSTOK_CHILD5_ID);
        System.out.println("SUM: " + sum);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }

    @Test
    public void calculateAvgforBialystokChild5Organization() {
        long startTime = System.currentTimeMillis();

        double avg = organizationService.getAssetAvgByOrganizationId(BIALYSTOK_CHILD5_ID);
        System.out.println("AVERAGE: " + avg);

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Method invocation time: " + elapsedTime);
    }
}
