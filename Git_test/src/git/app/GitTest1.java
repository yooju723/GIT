package git.app;

public class GitTest1
{
	public static void main(String[] args)
	{
		int[] intArr = new int[5]; //�迭����
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5; //�迭 �ʱ�ȭ

		//		System.out.println(intArr[3]);

		for (int i = 0; i < intArr.length; i++)
		{
			System.out.println(intArr[i]);
		}

		for (int item : intArr) //�迭 Ǯ��ĵ�Ҷ� ���.
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
