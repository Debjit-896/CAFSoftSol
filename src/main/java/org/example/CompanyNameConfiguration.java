package org.example;

public class CompanyNameConfiguration {
    public static String configureCompanyName (String name) {

        // NULL input handling
        if (name == null || name.trim().isEmpty()) {
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

    public static String configureCompanyName (String[] name) {
        if(name.length>0){
            for(int i=0;i<name.length;i++){
                configureCompanyName(name[i]);
            }
        }else{
            return "Please enter input";
        }
        return null;
    }
}
