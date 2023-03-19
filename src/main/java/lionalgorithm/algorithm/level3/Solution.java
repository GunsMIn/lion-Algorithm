package lionalgorithm.algorithm.level3;
import java.util.*;
// 회사 클래스
class Company {
    //{"A fabdec 2", "B cebdfa 2", "C ecfadb 2"} 매개변수로 {회사이름, 선호인재 , 채용인원수}
    String name; // 회사이름
    Map<Character, Integer> preference; // 선호도를 저장(지원자 , 지원자 인덱스)
    int hiringCount; // 채용 가능 인원 수
    List<Character> hiredApplicants; // 채용된 지원자 목록

    // 회사 정보를 받아 객체를 생성하는 생성자
    public Company(String info) { //  {"A fabdec 2", "B cebdfa 2", "C ecfadb 2"}; info에 하나하나 들어온다.
        String[] tokens = info.split(" "); // 우선 split으로 나누어준다.
        this.name = tokens[0]; // 회사이름 (A)
        this.preference = new HashMap<>();
        // 지원자 선호도를 맵에 저장
        for (int i = 0; i < tokens[1].length(); i++) {
            preference.put(tokens[1].charAt(i), i); // 지원자와 지원자의 인덱스를 우선순위로 등록 ('f',0)
                                                // 여기서는 지원자의 인덱스가 선호도 순위로 대체할 수 있다.
        }
        this.hiringCount = Integer.parseInt(tokens[2]); // 회사 채용 인원 수 (2)
        this.hiredApplicants = new ArrayList<>();
    }

    // 지원자를 추가하는 메서드
    public void addApplicant(char applicant) { // 매개변수로는 지원자의 이름이 들어온다.
        hiredApplicants.add(applicant);
        // 회사의 선호도에 따라 지원자들을 오름차순 정렬
        // preference.get(a)를 통해 해당 지원자에 대한 회사의 선호도 순위를 반환
        hiredApplicants.sort(Comparator.comparingInt(a -> preference.get(a)));
        // 인원 초과 시 가장 낮은 선호도의 지원자를 거절
        // 만약 채용된 지원자 목록이 채용할 수 있는 인원보다 크다면 거절해야한다.
        if (hiredApplicants.size() > hiringCount) {
            rejectApplicant(hiredApplicants.remove(hiringCount));
        }
    }

    // 지원자를 거절하는 메서드
    public void rejectApplicant(char applicant) {
        Applicant.rejectedApplicants.add(applicant);
    }
}

// 지원자 클래스
class Applicant { // {"a BAC 1", "b BAC 3", "c BCA 2", "d ABC 3", "e BCA 3", "f ABC 2"};
    char name; // 지원자의 이름 (a)
    String preference; // 지원자의 선호 기업 (BAC)
    int applyIndex; // 현재 지원한 회사의 인덱스
    int maxCompanies; // 지원자가 지원할 수 있는 최대 회사 수 (1)

    // 지원자 정보를 받아 객체를 생성하는 생성자
    public Applicant(String info) { // {"a BAC 1", "b BAC 3", "c BCA 2", "d ABC 3", "e BCA 3", "f ABC 2"};
        String[] tokens = info.split(" ");
        this.name = tokens[0].charAt(0); // string을 char로 변환
        this.preference = tokens[1]; // 지원자의 회사 선호 목록
        this.applyIndex = 0;
        this.maxCompanies = Integer.parseInt(tokens[2]); // 회사 지원 가능 갯수
    }

    // 다음 선호하는 회사에 지원하는 메서드
    public void applyToNextCompany(Map<String, Company> companiesMap) {
        if (applyIndex < maxCompanies) { // 현재 지원한 회사 인덱스가 최대 회사 수보다 작은 경우
            String companyName = String.valueOf(preference.charAt(applyIndex)); // 선호 회사 목록에서 다음 선호하는 회사 이름 추출
            companiesMap.get(companyName).addApplicant(name); // 해당 회사에 지원자 추가
            applyIndex++; // 현재 지원한 회사 인덱스 증가
        }
    }

    // 거절당한 지원자를 저장하는 큐
    // 거절당한 지원자들이 순서대로 처리되어야 하기 때문에 FIFO방식의 자료구조 채택
    public static Queue<Character> rejectedApplicants = new LinkedList<>();
}

class Solution {
    // 회사와 지원자 정보를 받아 결과를 반환하는 메서드
    public static String[] solution(String[] companies, String[] applicants) {
        //company의 정보를 저장할 map
        Map<String, Company> companiesMap = new HashMap<>();
        //applicant의 정보를 저장할 map
        Map<Character, Applicant> applicantsMap = new HashMap<>();
        // 회사 객체를 생성하고 맵에 저장
        for (String companyInfo : companies) { // {"A fabdec 2", "B cebdfa 2", "C ecfadb 2"};
            //회사의 정보를 넣어준다.(생성자를 통해)
            Company company = new Company(companyInfo);
            //그리고 companiesMap에 추가
            companiesMap.put(company.name, company);
        }
        // 지원자 객체를 생성하고 맵에 저장
        for (String applicantInfo : applicants) {
            Applicant applicant = new Applicant(applicantInfo);
            applicantsMap.put(applicant.name, applicant);
            // 거절당한 지원자를 큐에 추가
            Applicant.rejectedApplicants.add(applicant.name); // {"a", "b", "c", "d", "e", "f"};

        }

        // 거절당한 지원자가 없을 때까지 반복
        while (!Applicant.rejectedApplicants.isEmpty()) {
            char rejectedApplicantName = Applicant.rejectedApplicants.poll();
            Applicant applicant = applicantsMap.get(rejectedApplicantName);
            // 거절당한 지원자가 다음 선호하는 회사에 지원
            applicant.applyToNextCompany(companiesMap);
        }

        String[] result = new String[companies.length];
        int index = 0;
        // 최종 결과를 문자열 배열로 저장
        for (String companyName : companiesMap.keySet()) {
            Company company = companiesMap.get(companyName);
            // 지원자의 오름 차순 정렬을 하기 위해 List를 sort(null)로 설정
            //
            List<Character> hiredApplicants = company.hiredApplicants;
            hiredApplicants.sort(null); // null로 한이유 -> 오름 차순 정렬하기위해
            StringBuilder hiredApplicantsStr = new StringBuilder();
            // 회사가 채용한 지원자들의 이름을 문자열로 변환
            for (char applicantName : company.hiredApplicants) {
                hiredApplicantsStr.append(applicantName);
            }
            // 결과 문자열 배열에 회사 이름과 지원자 이름을 추가
            result[index++] = companyName + "_" + hiredApplicantsStr.toString();
        }
        // 결과 배열을 정렬하고 반환
        Arrays.sort(result);
        return result;
    }


}

    /*public static void main(String[] args) {
        String[] companies = {"A fabdec 2", "B cebdfa 2", "C ecfadb 2"};
        String[] applicants = {"a BAC 1", "b BAC 3", "c BCA 2", "d ABC 3", "e BCA 3", "f ABC 2"};

        String[] result = solution(companies, applicants);
        System.out.println(Arrays.toString(result));
    }*/