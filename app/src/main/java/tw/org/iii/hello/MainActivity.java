package tw.org.iii.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.lottery);

    }

    public void test2(View view) {
        //Log.v("brad","OK");

        textView.setText(createLottery());
    }//test2

    private String createLottery(){
        HashSet<Integer> set = new HashSet<>();
        while(set.size()<6){
            set.add((int)(Math.random()*49+1));
        }
        return set.toString();
    }//Lottery()

}
