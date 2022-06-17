package 중간고사1;

public class 중간고사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="123";
		byte value=Byte.parseByte(str1);
		System.out.println(value);
		
		String str2="456";
		short value2=Short.parseShort(str2);
		System.out.println(value2);
		
		String str3="789";
		int value3=Integer.parseInt(str3);
		System.out.println(value3);
		

		String str4="1234";
		long value4=Long.parseLong(str4);
		System.out.println(value4);

		String str5="5678";
		float value5=Float.parseFloat(str5);
		System.out.println(value5);


		String str6="910";
		double value6=Double.parseDouble(str6);
		System.out.println(value6);
		
		String str7="true";
		boolean value7=Boolean.parseBoolean(str7);
		System.out.println(value7);
	}

}
