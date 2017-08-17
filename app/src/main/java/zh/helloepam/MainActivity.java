package zh.helloepam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);


    }

    public void sayHello(View view) {
        textView.setText("Привет ЕПАМ!");
        Toast toast = Toast.makeText(MainActivity.this, "Hello EPAM!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastImage = (LinearLayout) toast.getView();
        ImageView imageView = new ImageView(MainActivity.this);
        imageView.setImageResource(R.drawable.epam);
        toastImage.addView(imageView, 0);
        toast.show();
    }


}
