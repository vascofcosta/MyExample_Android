package learning.experiences.vascocosta.myexample;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import learning.experiences.vascocosta.myexample.databinding.MainActivityBinding;


public class MainActivity extends AppCompatActivity {
    private MainActivityBinding mainActivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mainActivityBinding.setButtonText("Hi, I'm a button :)");
        mainActivityBinding.setListener(new Listeners());
    }

    @BindingAdapter("bind:buttonText")
    public static void setButtonText(Button view, String text) {
        view.setText(text);
    }

    public class Listeners implements  View.OnClickListener{
        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), "I was pressed :D", Toast.LENGTH_SHORT).show();
        }
    }
}
