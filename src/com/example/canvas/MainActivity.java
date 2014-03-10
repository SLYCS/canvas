package com.example.canvas;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		setContentView(new EjemploView(this));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
    public class EjemploView extends View {
        public EjemploView (Context context) {
            super(context);
        }
        protected void onDraw(Canvas canvas) {
        //Dibujar aquí
        	super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.BLUE);
            canvas.drawPaint(paint);
            canvas.drawCircle(100,100,3,paint);
            paint.setColor(Color.BLACK);
            paint.setAntiAlias(true);
            canvas.drawRect(16, 16, getWidth()-16, getHeight()-16, paint);
 
    	}
    }

}
 