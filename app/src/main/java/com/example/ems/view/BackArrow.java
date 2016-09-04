package com.example.ems.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhangpan on 16/9/4.
 */
public class BackArrow extends View {
    private Paint paint;

    public BackArrow(Context context) {
        super(context);
    }

    public BackArrow(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BackArrow(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        paint = new Paint();
        int height = getHeight();
        int width = getWidth();
        int cx = width/2;
        int cy = height/2;
        int r = 20;
        paint.setColor(Color.WHITE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(4F);

        canvas.drawLine(cx-r,cy,cx,cy-r,paint);
        canvas.drawLine(cx-r,cy,cx,cy+r,paint);
        canvas.drawLine(cx-r-2,cy,cx+r,cy,paint);
    }

}
