class SwitchCaseTest {
	public static void main(String[] args) {
		int s = 99;
		switch(s/60){
		case 1:
			System.out.println("����");
		    break;
		case 0:
		    System.out.println("������");
			 break;
		default:
			System.out.println("�ɼ�����");
		    break;
		}
	}
}