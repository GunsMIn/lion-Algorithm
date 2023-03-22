package lionalgorithm.algorithm.day41;

import java.util.*;

class Company {
    String name;
    String preference;
    int slots;
    StringBuilder selectedApplicants;

    Company(String name, String preference, int slots) {
        this.name = name;
        this.preference = preference;
        this.slots = slots;
        this.selectedApplicants = new StringBuilder();
    }

    @Override
    public String toString() {
        return name + "_" + selectedApplicants.toString();
    }

    void selectApplicants(HashMap<Character, Applicant> applicantsMap) {
        StringBuilder updatedPreference = new StringBuilder();
        for (int i = 0; i < preference.length(); i++) {
            char applicantChar = preference.charAt(i);
            Applicant applicant = applicantsMap.get(applicantChar);

            if (applicant != null && applicant.applyToCompany(name)) {
                updatedPreference.append(applicantChar);
                slots--;
                if (slots == 0) break;
            }
        }
        preference = updatedPreference.toString();
    }
}

class Applicant {
    char name;
    String preference;
    int numApplications;

    Applicant(char name, String preference, int numApplications) {
        this.name = name;
        this.preference = preference;
        this.numApplications = numApplications;
    }

    boolean applyToCompany(String companyName) {
        if (numApplications == 0) return false;

        int index = preference.indexOf(companyName);
        if (index < numApplications) {
            preference = preference.substring(index + 1);
            numApplications--;
            return true;
        }

        return false;
    }
}

public class Solution {
    public static String[] solution(String[] companies, String[] applicants) {
        HashMap<String, Company> companiesMap = new HashMap<>();
        HashMap<Character, Applicant> applicantsMap = new HashMap<>();

        for (String companyInfo : companies) {
            String[] info = companyInfo.split(" ");
            companiesMap.put(info[0], new Company(info[0], info[1], Integer.parseInt(info[2])));
        }

        for (String applicantInfo : applicants) {
            String[] info = applicantInfo.split(" ");
            applicantsMap.put(info[0].charAt(0), new Applicant(info[0].charAt(0), info[1], Integer.parseInt(info[2])));
        }

        boolean hasRejectedApplicants;
        do {
            hasRejectedApplicants = false;

            for (Company company : companiesMap.values()) {
                company.selectApplicants(applicantsMap);
            }

            for (Applicant applicant : applicantsMap.values()) {
                if (applicant.numApplications > 0) {
                    hasRejectedApplicants = true;
                }
            }

        } while (hasRejectedApplicants);

        String[] result = companiesMap.values().stream()
                .sorted(Comparator.comparing(company -> company.name))
                .map(company -> company.name + "_" + company.selectedApplicants.toString())
                .toArray(String[]::new);

        return result;
    }

}