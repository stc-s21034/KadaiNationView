package jp.suntech.s21034.kadainationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvCountry = findViewById(R.id.lvCountry);
        lvCountry.setOnItemClickListener(new LiteItemClickLitener());
    }

    private class LiteItemClickLitener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            String item = (String) parent.getItemAtPosition(position);
            TextView output = findViewById(R.id.textView);
            output.setText(item);
        }
    }
}