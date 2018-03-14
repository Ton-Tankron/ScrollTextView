package ton.th.scrolltextview;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ScrollTextView scrollTextView = (ScrollTextView) findViewById(R.id.scrolltext);


        //call method
        scrollTextView.setText("YOU TEXT");
        scrollTextView.setTextColor(Color.BLUE);
        scrollTextView.startScroll();

    }
}
