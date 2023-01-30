/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String args[])
	{
	 public int[] twoSum(int[] nums, int target) \* nums is a array declared and target will be sum of 2 */
	 {
    for (int i = 0; i < nums.length; i++)\* i will start from 0 to n and it will be incremented*/
    {
        for (int j = i + 1; j < nums.length; j++) \* j will be the next value of i and it will also go to n*/
        {
            if (nums[j] == target - nums[i])\* if nums j will be target-nums i then position of i and j will be given*/
            {
                return new int[] { i, j };
            }
            return new int[] { -1, -1};\*otherwise it will be startfrom -1*/
        }
    }
	}
	}
}
    

