package xy;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

public class MD5Test {
		public static void main(String[] args) {
		String source="1111";
		String salt="abc";
		int hashIterations=1;
		Md5Hash md5Hash=new Md5Hash(source, salt, hashIterations);
		String pwd_md5=md5Hash.toString();
		System.out.println(pwd_md5);
		
		SimpleHash simpleHash=new SimpleHash("SHA1", source, salt, hashIterations);
		System.out.println(simpleHash.toString());
	}
}
