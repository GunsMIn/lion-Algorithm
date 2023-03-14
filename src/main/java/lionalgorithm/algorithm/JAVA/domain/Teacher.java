package lionalgorithm.algorithm.JAVA.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Teacher {

    private String name;
    private boolean isLikeAlgorithm;
    private boolean isLikeSpringBoot;


    private int totalSpringNum;


    public Teacher(String name, boolean isLikeAlgorithm, boolean isLikeSpringBoot) {
        this.name = name;
        this.isLikeAlgorithm = isLikeAlgorithm;
        this.isLikeSpringBoot = isLikeSpringBoot;
    }

    public int cntNameDigit() {
        return this.getName().length();
    }

    public int getCountSpringBoot() {

        if (this.isLikeSpringBoot) {
            totalSpringNum++;
        }
        return totalSpringNum;
    }
}
