public class orderAgnosticBs {
    public static void main(String[] args) {
        int[] arr={99,88,77,66,55,44,33,22,11};
        int target = 77;
        int ans = orderAgnosticBs(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBs(int[]arr,int target){
        int end = arr.length-1;
        int start = 0;
        boolean isAsc = (arr[start] < arr[end]);
        while(start <= end){
            int mid = start + ( end - start )/2;
            if(arr [mid] == target ){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end= mid - 1;
                } else{
                    start = mid+1;
                }
            }
            else{
                if (target>arr[mid]){
                        start=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            }
        return -1;
    }
}
