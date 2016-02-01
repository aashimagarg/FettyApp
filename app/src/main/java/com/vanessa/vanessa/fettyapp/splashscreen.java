package com.vanessa.vanessa.fettyapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class splashscreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        /*final Queue<Drawable> t = new LinkedList<>();
        t.add(getResources().getDrawable(R.drawable.fettycutecrop));
        t.add(getResources().getDrawable(R.drawable.fettyfacecrop));*/
        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(splashscreen.this, fettyface.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();


    }
}

   /* private void doAnimation() {
        if (t.isEmpty()) {
            return;
        }
        b.animate().translationX(-1.0f).start();


        Animator.AnimatorListener listener = new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {
                image2.setX(1.0f);
                image2.setVisibiilty(View.VISIBLE);

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                image2.setVisibiilty(View.INVISIBLE);
                Drawable nextDrawable = t.remove();

                if (nextDrawable != null) {

                    image1.setDrawable(image2.getDrawable());

                    image1.setX(0);
                    image2.setX(1.0f);
                    doAnimation();
                }
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        };
        b.animate().translationX(0f).setListener(listener).start();
    }

}
*/