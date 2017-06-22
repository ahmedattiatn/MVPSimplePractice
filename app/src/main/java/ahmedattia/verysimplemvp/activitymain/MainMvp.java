package ahmedattia.verysimplemvp.activitymain;

import android.content.Context;

/**
 * Created by Ahmed Attia on 21/05/2017.
 */

public interface MainMvp {


    interface view {
        void displayToastMessage(User user);
    }


    interface presenter {

        void clickedToastButton();

        void getUsersFromDatabase();

        void insertDataIntoDataBase();

        void insertToSharedPreferences(Context ctx);
    }


}
