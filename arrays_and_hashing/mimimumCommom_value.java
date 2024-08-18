package arrays_and_hashing;

import java.util.HashSet;

public class mimimumCommom_value {
    public int getCommon(int[] nums1, int[] nums2) {
        
        HashSet<Integer>s=new HashSet<Integer>();
        
        for(int i=0;i<nums1.length;i++){
            s.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(s.contains(nums2[j])){
                return nums2[j];
            }
        }
        return -1;
    }
}
