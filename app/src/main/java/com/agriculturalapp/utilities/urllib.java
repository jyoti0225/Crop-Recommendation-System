package com.agriculturalapp.utilities;

/**
 * Created by user on 29-01-2019.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class urllib {
    public static StringBuffer urlopen(String url, String api_key, String data, String request_method) {
        try {
            URL u = new URL(url);

            HttpURLConnection con = (HttpURLConnection) u.openConnection();
            con.setDoInput(true);
            con.setDoOutput (true);
            con.setRequestMethod(request_method);
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("Authorization", "Bearer " + api_key);

            //make the request
            OutputStreamWriter writer = new OutputStreamWriter(con.getOutputStream());
            writer.write(data);
            writer.flush();

            //read the request
            BufferedReader reader=new BufferedReader(new InputStreamReader(con.getInputStream()));
            String response;
            StringBuffer sb = new StringBuffer();
            while ((response=reader.readLine())!=null)
                sb.append(response);
            return sb;
        } catch(MalformedURLException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
