
public class vartest {

	public static void main(String[] args) {

		System.out.printf("%5d%n", 10); // ����5ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("%6d%n", 10); // ����6ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("%7d%n", 10); // ����7ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("%6d%n", 10); // ����6ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("%5d%n", 10); // ����5ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("%5d%n", 10); // ����5ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("%6d%n", 10); // ����6ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("%7d%n", 10); // ����7ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("%6d%n", 10); // ����6ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("%5d%n", 10); // ����5ĭ�� ������ְ� 10�� ������ش�.

		System.out.printf("[%-5d]%n", 10); // ����5ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("[%-4d]%n", 10); // ����5ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("[%-3d]%n", 10); // ����5ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("[%-2d]%n", 10); // ����5ĭ�� ������ְ� 10�� ������ش�.
		System.out.printf("[%-1d]%n", 10); // ����5ĭ�� ������ְ� 10�� ������ش�.

		System.out.printf("[%05d]%n", 10); // ���鿡 0���� ä��� 10�� ����Ѵ�.
		System.out.printf("[%010d]%n", 10); // ���鿡 0���� ä��� 10�� ����Ѵ�..
		System.out.printf("[%020d]%n", 10); //  ���鿡 0���� ä��� 10�� ����Ѵ�..
	
		double d = 1.23456789;
		System.out.printf("[d=%14.10f]%n", d); //14ĭ ������ְ� ������ĭ 0���� ä���.
	}
}