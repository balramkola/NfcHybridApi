package cordova.plugin.nfchybridapi;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class NfcHybridPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("add")) {
            this.add(args, callbackContext);
            return true;
        }
        if (action.equals("substract")) {
            this.add(args, callbackContext);
            return true;
        }
        return false;
    }

    private void add(JSONArray args, CallbackContext callback) {
       if(args!=null){
           try{
               int p1= Integer.parseInt(args.getJSONObject(0).getString("param1"));
               int p2= Integer.parseInt(args.getJSONObject(0).getString("param2"));
               callback.success("addition result = "+ (p1+p2));
           }catch(Exception e){
            callback.error("Please dont pass null value");
           }

       }else{
           callback.error("something went wrong");
       }
    }

    private void substract(JSONArray args, CallbackContext callback) {
        if(args!=null){
            try{
                int p1= Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2= Integer.parseInt(args.getJSONObject(0).getString("param2"));
                callback.success("substract result = "+ (p1-p2));
            }catch(Exception e){
             callback.error("Please dont pass null value");
            }
 
        }else{
            callback.error("something went wrong");
        }
     }

}
