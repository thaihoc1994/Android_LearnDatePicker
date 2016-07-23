package learndatetimepicker.learn.thaihoc.learndatetimepicker;

import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    TextView txtDate, txtTime;
    ImageButton btnDate,btnTime;
    Calendar calendar = Calendar.getInstance();

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
