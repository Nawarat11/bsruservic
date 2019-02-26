package nawarat.roengsamai.bsru.ac.th;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Namactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        //add Fragment to activity
                getSupportFragmentManager().beginTransaction().add(R.id.layoutMainFragmant, new MainFragment()).commit();
    }   //Main Method
}   //Main Class
