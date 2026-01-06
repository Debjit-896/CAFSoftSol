package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompanyNameConfigurationTest {

    @Test
    public void testNullInput() {
        String result = CompanyNameConfiguration.configureCompanyName(null);
        assertEquals("Company name cannot be null or empty!", result);
    }

    @Test
    public void testEmptyInput() {
        String result = CompanyNameConfiguration.configureCompanyName("");
        assertEquals("Company name cannot be null or empty!", result);
    }

    @Test
    public void testCafSoftsol() {
        String result = CompanyNameConfiguration.configureCompanyName("caf softsol");
        assertEquals("CAF SoftSol India Pvt Ltd.", result);
    }

    @Test
    public void testCafSolution() {
        String result = CompanyNameConfiguration.configureCompanyName("caf solution");
        assertEquals("CAF SoftSol India Pvt Ltd.", result);
    }

    @Test
    public void testCafSoftSolutionIndiaPvtLimited() {
        String result = CompanyNameConfiguration.configureCompanyName(
                "caf softsolution india pvt limited"
        );
        assertEquals("CAF SoftSol India Pvt Ltd.", result);
    }

    @Test
    public void testUnknownCompanyName() {
        String result = CompanyNameConfiguration.configureCompanyName(
                "TCS Pvt Ltd"
        );
        assertEquals("Invalid Company Name!", result);
    }
}
