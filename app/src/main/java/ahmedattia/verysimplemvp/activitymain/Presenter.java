package ahmedattia.verysimplemvp.activitymain;


import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Ahmed Attia on 21/05/2017.
 */

public class Presenter implements MainMvp.presenter {
    private final MainMvp.view view;

    public Presenter(MainMvp.view view) {
        this.view = view;

    }

    @Override
    public void clickedToastButton() {
        User user = new User("male",28);
        view.displayToastMessage(user);

    }

    @Override
    public void getUsersFromDatabase() {
        // just example no code
    }

    @Override
    public void insertDataIntoDataBase() {
        // just example no code

    }

    @Override
    public void insertToSharedPreferences(Context ctx ) {
        // just example no code
        SharedPreferences settings ;
        settings = ctx.getSharedPreferences("PREFERENCE_NAME", 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("KEy String age", "28");
        editor.commit();}
}
