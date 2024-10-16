package easy;

public class RemoveElement {
    public static int removingElement(int[] nums, int val) {
        int k = 0; // val과 같지 않은 요소를 배치할 위치를 추적하는 포인터

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {  // val과 같지 않으면
                nums[k] = nums[i]; // 앞쪽으로 옮김
                k++;               // k 값을 증가시킴
            }
        }
        return k;  // val과 같지 않은 요소의 개수를 반환
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int result = removingElement(nums, val);
        System.out.println("Result: " + result);

        // 수정된 배열 출력
        System.out.print("Modified array: ");
        for (int i = 0; i < result; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
