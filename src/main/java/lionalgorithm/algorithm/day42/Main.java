package lionalgorithm.algorithm.day42;

import java.util.*;

class Company {
    String name;
    String preference;
    int slots;
    List<Character> applicants;

    public Company(String name, String preference, int slots) {
        this.name = name;
        this.preference = preference;
        this.slots = slots;
        this.applicants = new ArrayList<>();
    }

    public void selectApplicants() {
        StringBuilder updatedPreference = new StringBuilder();
        for (int i = 0; i < preference.length(); i++) {
            char applicant = preference.charAt(i);
            if (applicants.contains(applicant)) {
                updatedPreference.append(applicant);
                slots--;
                if (slots == 0) break;
            }
        }
        preference = updatedPreference.toString();
    }
}

class Applicant {
    String name;
    String preference;
    int desiredCompanies;

    public Applicant(String name, String preference, int desiredCompanies) {
        this.name = name;
        this.preference = preference;
        this.desiredCompanies = desiredCompanies;
    }
}

public class Main {
    public static String[] solution(String[] companies, String[] applicants) {
        List<Company> companyList = new ArrayList<>();
        List<Applicant> applicantList = new ArrayList<>();

        for (String companyInfo : companies) {
            String[] tokens = companyInfo.split(" ");
            companyList.add(new Company(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
        }

        for (String applicantInfo : applicants) {
            String[] tokens = applicantInfo.split(" ");
            applicantList.add(new Applicant(tokens[0], tokens[1], Integer.parseInt(tokens[2])));
        }

        boolean hasApplicants = true;
        while (hasApplicants) {
            hasApplicants = false;

            for (Applicant applicant : applicantList) {
                if (applicant.desiredCompanies > 0) {
                    hasApplicants = true;
                    String companyName = String.valueOf(applicant.preference.charAt(applicant.desiredCompanies - 1));
                    for (Company company : companyList) {
                        if (company.name.equals(companyName)) {
                            company.applicants.add(applicant.name.charAt(0));
                            break;
                        }
                    }
                    applicant.desiredCompanies--;
                }
            }

            for (Company company : companyList) {
                company.selectApplicants();
            }
        }

        List<String> result = new ArrayList<>();
        for (Company company : companyList) {
            result.add(company.name + "_" + company.preference);
        }
        Collections.sort(result);
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] companies = {"A fabdec 2", "B cebdfa 2", "C ecfadb 2"};
        String[] applicants = {"a BAC 1", "b BAC 3", "c BCA 2", "d ABC 3", "e BCA 3", "f ABC 2"};

        String[] result = solution(companies, applicants);
        System.out.println(Arrays.toString(result)); // ["A_bf", "B_ce", "C_d"]

        String[] companies2 = {"A abc 2", "B abc 1"};
        String[] applicants2 = {"a AB 1", "b AB 1", "c AB 1"};

        String[] result2 = solution(companies2, applicants2);
        System.out.println(Arrays.toString(result2)); // ["A_ab", "B_"]
    }
}
