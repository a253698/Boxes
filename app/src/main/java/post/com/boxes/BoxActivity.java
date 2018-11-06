package post.com.boxes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BoxActivity extends AppCompatActivity {

//    Box3: 23 / 14 / 13 (長/寬/高) cm
//    Box5: 39.5 / 27.5 / 23 (長/寬/高) cm

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_box);
        TextView boxnumber = findViewById(R.id.boxnum);
        TextView dim = findViewById(R.id.boxdim);
        TextView price = findViewById(R.id.boxprice);

        float box = getIntent().getFloatExtra("BOX" , 3);

        if(box == 3){
            boxnumber.setText("Box3");
            dim.setText("Dimention:  23 / 14 / 13  cm ");
            price.setText("Price: 90");
        }else{
            boxnumber.setText("Box5");
            dim.setText("Dimention:  39.5 / 27.5 / 23  cm");
            price.setText("Price: 65 ");
        }
    }
}
