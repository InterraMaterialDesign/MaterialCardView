package cards.materialdesign.interra.com.cards;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.design.card.MaterialCardView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.CycleInterpolator;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button defaultButton = findViewById(R.id.defaultCard);
        final Button customButton = findViewById(R.id.customCard);



        defaultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(view.getContext(), CardDefault.class);
                startActivity(intent);
            }

        });

        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(view.getContext(), CardCustom.class);
                startActivity(intent);
            }
        });



    }


}

/*float x = customButton.getWidth() / 2;
                float y = customButton.getHeight() / 2;
                ObjectAnimator objectAnimatorX = ObjectAnimator.ofFloat(customButton, "translationX", 0f, -x);
                ObjectAnimator objectAnimatorY = ObjectAnimator.ofFloat(customButton, "translationY", 0f, -y);

                objectAnimatorX.setInterpolator(new AnticipateInterpolator());
                objectAnimatorY.setInterpolator(new AnticipateInterpolator());
                objectAnimatorX.setDuration(200);
                objectAnimatorY.setDuration(200);

                objectAnimatorX.start();
                objectAnimatorY.start();*/