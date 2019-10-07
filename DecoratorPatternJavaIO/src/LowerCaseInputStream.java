/*
 * 
 * Head First Design Patterns
 * 입력 스트림에 있는 대문자를 전부 소문자로 바꿔주는 Decorator
 * 
 * 
 * */

import java.io.*;

// FilterInputStream은 모든 InputStream의 추상 데코레이터
public class LowerCaseInputStream extends FilterInputStream {
	
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	
	/* 두개의 read() 메소드를 통해 각각 byte 값 하나, 또는 byte 배열을 읽고 각 byte(문자를 나타냄)를 검사하여 대문자이면 소문자로 변환 */
	
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
