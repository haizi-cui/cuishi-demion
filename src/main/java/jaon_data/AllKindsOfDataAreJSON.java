package jaon_data;


import org.json.JSONException;
import org.json.JSONObject;



public class AllKindsOfDataAreJSON {




    public JSONObject JsonAdd(){
        /**
         * 创建一个json格式的数据
         */
        JSONObject jsonObject  = new JSONObject();
        jsonObject.put("陆文静","女");
        jsonObject.put("崔星海","男");
        jsonObject.put("卢文小静静",new String[] {"男","未知","不知道"});
        jsonObject.put("陆文静","女");
        return jsonObject;

    }

    public void JsonData(){

//        AllKindsOfDataAreJSON allKindsOfDataAreJSON = new AllKindsOfDataAreJSON();
//        JSONObject jsonOb=allKindsOfDataAreJSON.JsonAdd();
        JSONObject jsonObject  = new JSONObject();
        jsonObject.put("陆文静","女");
        jsonObject.put("崔星海","男");
        jsonObject.put("卢文小静静",new String[] {"男","未知","不知道"});
        jsonObject.put("陆文静1","女");
        String name = jsonObject.getString("陆文静");

        System.out.println(name);

    }


    /**
     * 处理一个标准的json字符串
     */

    public void odJSON(){

        String sourcel = "{'name':'崔星海','age':'15','sex':'男','phone':'18789401611','address':'陕西省合阳县'}";

        String soural1 = "["+"{'name':'崔星海','age':'15','sex':'男'},"+
                            "{'name':'cui','age':'15','sex':'男'},"+
                             "{'name':'xing','age':'15','sex':'男'}]";
        try {
            JSONObject jsonObject = new JSONObject(sourcel);
            System.out.println(jsonObject.get("name"));
            System.out.println("--------------------------");

            JSONObject jsonObject1 = new JSONObject(sourcel);
            for (int i = 0; i < jsonObject1.length() ; i++){

                JSONObject jsonObject2 = jsonObject1.getJSONObject(String.valueOf(i));
                System.out .println(jsonObject2.get("nane"));

            }

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }





    public static void main(String[] args) {
        AllKindsOfDataAreJSON allKindsOfDataAreJSON = new AllKindsOfDataAreJSON();
        allKindsOfDataAreJSON.odJSON();
    }
}
