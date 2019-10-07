import java.io.*;

public class InputTest {
	
	public static void main(String[] args) throws IOException {
		
		int c;
		
		try {
			
			// FileInputStream을 만들고 새로 만든 LowerCaseInpustStream과 BufferedInputStream으로 감싸기(데코레이터)
			InputStream in = 
					new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			
			in.close();
										
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
	
	}

}
