package br.com.werison.annotations;

import java.util.Arrays;

public class Application {

	public static void main(String ...args) {
		
		Person person = new Person("Werison", "Fernandes");
		person.setTest(Arrays.asList(1,2,3,4,5,6));
		
		ObjectToJsonConverter converter = new ObjectToJsonConverter();
		String json = converter.convertToJson(person);
		
		System.out.print(json);
	}
}
