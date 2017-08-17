package sort;

/**
 * Created by hcq on 2017/8/17.
 */
public class removeDup {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 1;//用于第一个比较
        int j = 0;//J用于计算，
        for (; i < nums.length; i++) {
            if (nums[j] != nums[i]) {//如果不相等，也就是说有了新的数，及j++,然后把Nums[j]的那个位置替换为接下来需要对比的数
                j++;
                nums[j] = nums[i];
            }
        }
        return ++j;//因为j为从0开始的 所以最后返回到时候要加上1
    }

    public static void main(String[] args) {
    }
}
