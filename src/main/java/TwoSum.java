import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // twoSum 메서드
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer complementIndex = complements.get(nums[i]);
            if (complementIndex != null) {
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }

        // 예외 처리 (target에 맞는 쌍을 못 찾을 경우)
        throw new IllegalArgumentException("No two sum solution");
    }

    // main 메서드
    public static void main(String[] args) {
        // 클래스 인스턴스 생성
        TwoSum solution = new TwoSum();

        // 테스트용 배열과 타겟 값
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // twoSum 메서드 실행
        int[] result = solution.twoSum(nums, target);

        // 결과 출력
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
