package git.app;

public class GitTest1
{
	public static void main(String[] args)
	{
		int[] intArr = new int[5]; //배열정의
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5; //배열 초기화

		//		System.out.println(intArr[3]);

		for (int i = 0; i < intArr.length; i++)
		{
			System.out.println(intArr[i]);
		}

		for (int item : intArr) //배열 풀스캔할때 사용.
		{
			System.out.println(item);
		}

		int[] intArr2 = { 1, 2, 3, 4, 5, 6 };
		for (int item : intArr2)
		{
			System.out.println(item);
		}
	}
}
