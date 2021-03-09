package lotto;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.net.URLDecoder;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import org.json.JSONObject;


public class Lotto {

	public static int N = 6;
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub

		//System.out.println((int)(Math.random() * 10) +1);
		//System.out.println((int)(Math.random() * 10) +1);
		
		for(int ii=0;ii<10;ii++) {
			//System.out.println("number : " + (ii+1) + "=================");
			int sum=0;
		
			for(int cnt=0;cnt<5;cnt++) {
				int list1[] = new int[6];
				int list2[] = new int[45+1];
				sum = 0;
				
				for (int i=0;i<N;i++) {
					
					
					int selN = (int)(Math.random() * 45)+1;
					
					if(list2[selN] == 0) {
						list2[selN] = selN;
						list1[i] = selN;
						sum += selN;
					}
					else i--;
				}
				
				if(sum<100 || sum > 181) {
					cnt = cnt-1;
					continue;
				}
				
				Arrays.sort(list1);
				//System.out.println(Arrays.toString(list1) + " : " + sum);
				//System.out.println(Arrays.toString(list1));
				
			}
			
		}
		
		Decoder decoder = Base64.getDecoder();
		
		String encodedData = "eyJtS2V5IjoiMzk5NzUyMTZmNWExMTliNjA1MjU1ZTI3ZmZjYWNkMWU2YzlmNjM0NGM2NTlkMDYzMzdiY2Q1NTExMDg1NTdkYSIsImNoYXJzZXQiOiJVVEYtOCIsImdvb2RuYW1lIjoix/a060hDTi28rbrxvbrAzL/rt+EiLCJzaWduYXR1cmUiOiI3NmJjNjFjYTNmMmFmYTg2NmQzOGI1YjRlYzkxZmE3ZmE3OGFiNGEwZmMyZmUwZWYzMDMxZDQ5MjgyM2JiY2ZlIiwibWlkIjoiSENONTIyV0VCMiIsIm9pZCI6IjUyMl8zMDE2NzQ3MV8xNjEyMzMxODI3NDQ1IiwibGFuZ3VhZ2VWaWV3IjoiIiwibm9pbnRlcmVzdCI6IiIsInByaWNlIjoiMjYwMDMwIiwiZ29wYXltZXRob2QiOiJDYXJkIiwiaW5pX2NhcmRjb2RlIjoiIiwiY3VycmVuY3kiOiJXT04iLCJwYXlWaWV3VHlwZSI6InBvcHVwIiwicmV0dXJuVXJsIjoiaHR0cHM6Ly93d3cuaGNuLmNvLmtyOjQ0My9pbmlwYXkvaW5pcGF5UHJvYy5kbyIsInRpbWVzdGFtcCI6IjE2MTIzMzE4Mjc0NDUiLCJxdW90YWJhc2UiOiIyOjM6NDo1OjY6Nzo4Ojk6MTA6MTE6MTI6MTM6MTQ6MTU6MTY6MTc6MTg6MTk6MjA6MjE6MjI6MjM6MjQ6MjU6MjY6Mjc6Mjg6Mjk6MzA6MzE6MzI6MzM6MzQ6MzU6MzYiLCJhbnNpbV9xdW90YSI6IiIsImJ1eWVydGVsIjoiMDEwNjUzNzg5NzciLCJhY2NlcHRtZXRob2QiOiIiLCJvZmZlclBlcmlvZCI6IiIsIm1hcmtldF9jb2RlIjoiNTIyIiwidmVyc2lvbiI6IjEuMCIsImNjQ29kZSI6IklOSCIsImNsb3NlVXJsIjoiaHR0cHM6Ly93d3cuaGNuLmNvLmtyOjQ0My9pbmlwYXkvY2xvc2UuZG8iLCJwb3B1cFVybCI6Imh0dHBzOi8vd3d3Lmhjbi5jby5rcjo0NDMvaW5pcGF5L3BvcHVwLmRvIiwiY2lkIjoiMzAxNjc0NzEiLCJidXllcm5hbWUiOiJIVUI2IiwiaW5pX29ubHljYXJkY29kZSI6IiJ9";
		String merchantData = new String(decoder.decode(encodedData));
		JSONObject reqData = new JSONObject(merchantData);
        String price = reqData.getString("price");
        System.out.println(reqData);
	}
}






