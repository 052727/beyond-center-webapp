package text;


import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Class  {

		public static void main(String[] args) throws JSONException {
	       ParseJson("{\"name\":\"Alexia\",\"age\":\"23\"}");
	       CreateJson();
		}

		//解析JSON
		private static void ParseJson(String jsonString) throws JSONException
		{
			JSONObject jObject = new JSONObject(jsonString);
	        System.out.println(jObject.get("name"));
		}

		//创建一个JSON
		private static void CreateJson() throws JSONException
		{
			 // 下面构造两个map、一个list和一个Employee对象
	        Map<String, String> map1 = new HashMap<String, String>();
	        map1.put("name", "Alexia");
	        map1.put("sex", "female");
	        map1.put("age", "23");

	        Map<String, String> map2 = new HashMap<String, String>();
	        map2.put("name", "Edward");
	        map2.put("sex", "male");
	        map2.put("age", "24");

	        // 将Map转换为JSONArray数据
	        JSONArray jArray = new JSONArray();
	        jArray.put(map1);
	        jArray.put(map2);
	       //定义JSON
	        JSONObject jObject=new JSONObject();
	        jObject.put("List", jArray);
	        jObject.put("Count","1200");

	        System.out.println(jObject.toString());
		}
	 }

