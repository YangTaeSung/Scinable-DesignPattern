/*
 * 
 * Head First Design Patterns
 * �Է� ��Ʈ���� �ִ� �빮�ڸ� ���� �ҹ��ڷ� �ٲ��ִ� Decorator
 * 
 * 
 * */

import java.io.*;

// FilterInputStream�� ��� InputStream�� �߻� ���ڷ�����
public class LowerCaseInputStream extends FilterInputStream {
	
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	
	/* �ΰ��� read() �޼ҵ带 ���� ���� byte �� �ϳ�, �Ǵ� byte �迭�� �а� �� byte(���ڸ� ��Ÿ��)�� �˻��Ͽ� �빮���̸� �ҹ��ڷ� ��ȯ */
	
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toLowerCase((char)c));
	}
	
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = super.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
			b[i] = (byte) Character.toLowerCase((char)b[i]);
		}
		return result;
	}

}
