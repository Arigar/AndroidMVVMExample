package com.example.myapplication;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.myapplication.databinding.ActivityBinding;

import java.util.Arrays;

public class Activity extends AppCompatActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		//Do magic with binding
		ActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity);
		CustomViewModel viewModel = new CustomViewModel();
		binding.setVariable(BR.vm, viewModel);
		binding.executePendingBindings();

		//Fill model
		viewModel.backgroundFill.set(Color.WHITE);
		viewModel.setCircleModels(Arrays.asList(new CircleModel(0, 0), new CircleModel(200, 400)));
	}
}
