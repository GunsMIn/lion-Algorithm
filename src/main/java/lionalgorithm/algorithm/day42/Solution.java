package lionalgorithm.algorithm.day42;

import java.util.ArrayList;
import java.util.List;

public class Solution {

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

        // 선호하는 지원자를 선택하는 메소드
        public void selectApplicants() {
            StringBuilder updatedPreference = new StringBuilder();
            for (int i = 0; i < preference.length(); i++) {
                char applicant = preference.charAt(i);
                //기업이 받은 지원서(applicants)에 현재 순회 중인 지원자가 포함되어 있다면, 해당 지원자를 선택합니다🔽
                if (applicants.contains(applicant)) {
                    updatedPreference.append(applicant); // 지원자를 선택하면 StringBuilder에 append 해주자
                    slots--; // 그리고 slots 채용 인원수는 줄여주자
                    if (slots == 0) break; // slots이 0 이면
                }
            }
            preference = updatedPreference.toString();
        }
    }

}
