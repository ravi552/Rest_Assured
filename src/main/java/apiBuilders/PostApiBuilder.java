package apiBuilders;

import java.util.HashMap;
import java.util.Map;

public class PostApiBuilder {
	
	public Map<String, String> postRequestBody(String id,String title,String author){
		System.out.println("PostApiBuilder.postRequestBody()");
		Map<String, String> body= new HashMap<String, String>();
		body.put("id", id);
		body.put("title", title);
		body.put("author", author);
		return body;
	}
}
