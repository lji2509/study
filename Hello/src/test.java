import java.io.File;

public class test {

	public static void main(String[] args) {
		try {
			File f = createFile("");
			System.out.println( f.getName()+"������ ���������� �����Ǿ����ϴ�.");
		} catch (Exception e) {
			System.out.println(e.getMessage()+" �ٽ� �Է��� �ֽñ� �ٶ��ϴ�.");
		}
	}	// main�޼����� ��

	static File createFile(String fileName) throws Exception {
		if (fileName==null || fileName.equals(""))
			throw new Exception("�����̸��� ��ȿ���� �ʽ��ϴ�.");
		File f = new File(fileName);		//  FileŬ������ ��ü�� �����.
     	// File��ü�� createNewFile�޼��带 �̿��ؼ� ���� ������ �����Ѵ�.
		
		f.createNewFile();
		return f;		// ������ ��ü�� ������ ��ȯ�Ѵ�.
	}	// createFile�޼����� ��
}	// Ŭ������ ��