package secondTry.array;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int m =3;
        int[] nums2={2,5,6};
        int n =3;
        Merge me = new Merge();
        me.merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1,int m,int[] nums2,int n){
        if(nums1.length==0||nums2.length==0)
            return;
        int[] nums1Coyp = new int[m];
        System.arraycopy(nums1,0,nums1Coyp,0,m);
        int n1=0,n2=0;
        int x=0;
        while(n1<m && n2<n){
            if(nums1Coyp[n1]>nums2[n2]){
                nums1[x++]=nums2[n2];
                n2++;
            }else{
                nums1[x++]=nums1Coyp[n1];
                n1++;
            }
        }

        if(n1<m)
            System.arraycopy(nums1Coyp,n1,nums1,n1+n2,m+n-n1-n2);
        if(n2<n)
            System.arraycopy(nums2,n2,nums1,n1+n2,m+n-n1-n2);
    }

}
