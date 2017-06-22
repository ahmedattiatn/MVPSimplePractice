package ahmedattia.verysimplemvp.activitymain;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import ahmedattia.verysimplemvp.R;

public class MainActivity extends AppCompatActivity implements MainMvp.view {
    private Button button;

    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*hééém baaaaaaaaaaarcha
                 to make any change in
                 the view (interface graphique : toat, annimation ,Progressbar..)
                 in the current  activity  we have to
                  1   call the presenter fiiiiiirst
                  2   the presenter will call the view because
                      any change on the view must be done in
                      the view (activity)
            ---------------------------------------------------------
                      Noté bien :
                  1   never ever change the view from
                      the presenter like ( display toat, annimation ,Progressbar....)
                  2  In the presenter we can insert data to databse , get data from
                      data base.....
                */
        presenter = new Presenter(this);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /* just focus on
                 presenter.clickedToastButton();
                 and
                 presenter.insertToSharedPreferences(MainActivity.this);
                 :
                 to understand the diference between
                 1 changing in
                   the view (interface graphique :Show Toast ,SHOw a PRogressDialog....)
                 2 do some background work (ya3ni 7wéyéj maychoufhéch el User fel écran)
                    like put or get data from SharedPreferences
                    or get data fom databsae ...


                */
                presenter.clickedToastButton();

                presenter.insertToSharedPreferences(MainActivity.this);



                presenter.getUsersFromDatabase();
                presenter.insertDataIntoDataBase();

            }
        });
    }

    @Override
    public void displayToastMessage(User user) {
        Toast.makeText(getApplicationContext(), "Clicked Me Your Age " +user.getAge(), Toast.LENGTH_LONG).show();
    }
}
