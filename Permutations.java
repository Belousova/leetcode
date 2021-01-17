class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permuteHelper(nums, 0, ans);
        return ans;
    }

    private void permuteHelper(int[] nums, int start, List<List<Integer>> ans) {
        if (start == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            ans.add(list);
            return;
        }

        for (int i = 0; i <= start; i++) {
            swap(nums, i, start);
            permuteHelper(nums, start + 1, ans);
            swap(nums, start, i);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
/*my solution 2ms 49%

    //функция - передаем список
    //если 2 элемента в списке - вызвращаем 2 комбинации этих элементов
    //по списку выделяем один элемеент и список без этого элемеента (remove from List)
    //передаем список дальше, возвращаем список сочетаний элемеентов этого списка
    //добавляем элемент к значением в этом списке
    //возвращаем список комбинаций

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        if (nums.length==1) {
            List<Integer> l1 = new ArrayList(Arrays.asList(nums[0]));
            ans.add(l1);
            return ans;
        }
        if (nums.length==2) {
            List<Integer> l1 = new ArrayList(Arrays.asList(nums[0], nums[1]));
            ans.add(l1);
            List<Integer> l2 = new ArrayList(Arrays.asList(nums[1], nums[0]));
            ans.add(l2);
            return ans;
        }

        for(int i=0; i<nums.length; i++){
            int n = nums[i];
            int[] nextl = new int[nums.length-1];
            int k = 0;
            for(int j=0; j<nums.length; j++){
                if (i!=j) {
                    nextl[k] = nums[j];
                    k++;
                }
            }
            List<List<Integer>> resl = permute(nextl);
            for (int j=0; j<resl.size(); j++) {
                resl.get(j).add(0, n);
            }
            ans.addAll(resl);
        }
        return ans;
    }*/

}