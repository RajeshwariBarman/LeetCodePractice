
public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = { 1,2,3,0,0,0 };
		int[] nums2 = { 2,5,6 };
		int n = 3, m = 3;
		int[] res = new int[n+m];
		int index = 0;
		int i,j;
		for (i = 0, j = 0; i<m && j<n ;) {

			if (nums1[i] <= nums2[j]) {
				res[index] = nums1[i];
				i++;
			}
			else if (nums2[j] <nums1[i]) {
				res[index] = nums2[j];
				j++;
			}

			index++;
		}
//		System.out.println(i);
//		System.out.println(j);
		if(i<m)
		{
			for(int k = i ; k < m;k++)
			{
				res[index] = nums1[k];
				index++;
			}
		}
		
		if(j<n)
		{
			for(int k = j ; k < n;k++)
			{
				res[index] = nums2[k];
				index++;
			}
		}

		for (int l = 0; l < n + m; l++)
		{
			nums1[l] = res[l];
			//System.out.println(nums1[l]);
			System.out.println(res[l]);
		}
			
	}

}
