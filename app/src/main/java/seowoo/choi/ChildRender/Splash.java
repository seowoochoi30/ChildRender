package seowoo.choi.ChildRender;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import seowoo.choi.ChildRender.MainActivity;
import seowoo.choi.ChildRender.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent it = new Intent(Splash.this, MainActivity.class);
                startActivity(it);
                finish();

            }
        },  2000);
    }
}
