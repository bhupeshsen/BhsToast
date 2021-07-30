package com.bhs.bhstoast;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Bhupesh Sen on 31/07/20 at 2:16 PM.
 * Bhupehsen11@gmail.com
 * 7974430255
 */
public class BhsToast {
    public static void showBhsToast(Context context,String message){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }
}
