package org.example;

public class CompanyNameConfiguration {
    public static String configureCompanyName (String name) {

        // NULL input handling
        if (name == null || name.isEmpty()) {
            return "Company name cannot be null or empty!";
        }

        //  trim and collapse multiple spaces
        String value = name.toLowerCase()
                .trim()
                .replaceAll("\\s+", " ");

        switch (value) {
            case "caf softsol":
            case "caf solution":
            case "caf softsolution india pvt limited":
                return "CAF SoftSol India Pvt Ltd.";

            default:
                return "Invalid Company Name!";
        }
    }
}
