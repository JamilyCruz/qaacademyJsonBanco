package json;

import org.json.JSONObject;
import org.junit.Assert;

public class ManipulandoJson {
    public String criandoJson(){
        JSONObject json = new JSONObject();
        json.put("nome", "Jamily");
        json.put("sobrenome", "Cruz");
        json.put("idade", 23);
        return json.get("nome").toString();
        //System.out.println(json);
        //System.out.println(json.get("nome"));
    }

}
