package javaBasic;

public class Topic_01_OS_Properties {
	public static void main(String args[]) {
		String projectPath = System.getProperty("user.dir");
		String osName = System.getProperty("os.name");

		System.out.println(projectPath);
		System.out.println(osName);
	}

}
