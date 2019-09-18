package experis;

import netscape.javascript.JSObject;
import org.json.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIHandler {

    public void APIHandler() {

    }

    public Float call() {

        try {

            URL url = new URL("https://financialmodelingprep.com/api/v3/forex/");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("User-Agent", "");

            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder result = new StringBuilder();
            String line;

            while ((line = rd.readLine()) != null) {
                result.append(line);
            }

            rd.close();

            JSONObject JSONPackage = new JSONObject(result.toString());
            JSONArray ecoList = JSONPackage.getJSONArray("forexList");
            int len = ecoList.length();

            for (int i = 0; i < len; i++) {
                JSONObject a = new JSONObject(ecoList.get(i));
                String name = ecoList.getJSONObject(i).getString("ticker");

                    if (name.equals("USD/SEK")) {
                        Float changeVal = ecoList.getJSONObject(i).getFloat("bid");
                        return (changeVal);
                    }
            }

        } // end try
        catch (Exception e) {
            System.out.println(e);
            return (-999f);
        }
        return (-999f);
    }

}
