package post.com.boxes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public float BIGBOX = 5;
    public float SMALLBOX = 3;
    private EditText edlength;
    private EditText edheight;
    private EditText edwidth;

//    Box3: 23 / 14 / 13 (長/寬/高) cm
//    Box5: 39.5 / 27.5 / 23 (長/寬/高) cm

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void check(View view){
        findView();
        float l = Float.parseFloat(edlength.getText().toString());
        float h = Float.parseFloat(edheight.getText().toString());
        float w = Float.parseFloat(edwidth.getText().toString());
        Intent intent = new Intent(this,BoxActivity.class);
        if (l <= 23 && w <= 14 && h <= 13){
            intent.putExtra("BOX" , SMALLBOX);
            startActivity(intent);
        }else{
            intent.putExtra("BOX", BIGBOX);
            startActivity(intent);
        }
    }

    private void findView() {
        edlength = findViewById(R.id.edlength);
        edheight = findViewById(R.id.edheigth);
        edwidth = findViewById(R.id.edwidth);
    }
}
