package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import java.util.Collections;
import java.util.List;

public class CustomView extends View
{
	private Paint mPaint = new Paint();
	private int backgroundFill;
	private List<CircleModel> circleModels = Collections.emptyList();

	public CustomView(Context context, @Nullable AttributeSet attrs)
	{
		super(context, attrs);

		mPaint.setStyle(Paint.Style.FILL);
	}

	@Override
	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);

		mPaint.setColor(backgroundFill);
		canvas.drawPaint(mPaint);

		mPaint.setColor(Color.BLUE);
		for(CircleModel model : circleModels)
			canvas.drawCircle(model.getX(), model.getY(), 100, mPaint);
	}

	public void setBackgroundFill(@ColorInt int backgroundFill)
	{
		this.backgroundFill = backgroundFill;
	}

	public void setCircles(List<CircleModel> circles)
	{
		circleModels = circles;
	}
}
