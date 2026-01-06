package org.example;

public class CompanyNameConfiguration {
    public static String configureCompanyName (String name) {

        // NULL input handling
        if (name == null) {
            return "Company name cannot be null!";
        }

        //  Empty string handling
        if (name.isEmpty()) {
            return "Company name cannot be empty!";
        }

        // Whitespace handling
        if (name.trim().isEmpty()) {
            return "Company name contains only spaces!";
        }

        //  trim and collapse multiple spaces
        String value = name.toLowerCase()
                .trim()
                .replaceAll("\\s+", " ");

        return switch (value) {
            case "caf softsol", "caf solution", "caf softsolution india pvt limited" -> "CAF SoftSol India Pvt Ltd.";
            default -> "Invalid Company Name!";
        };
    }
}
