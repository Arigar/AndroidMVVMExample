package com.example.myapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableInt;

import java.util.ArrayList;
import java.util.List;

public class CustomViewModel extends BaseObservable
{
	public final ObservableInt backgroundFill = new ObservableInt();
	@Bindable
	private List<CircleModel> circleModels = new ArrayList<>();

	public List<CircleModel> getCircleModels()
	{
		return circleModels;
	}

	public void setCircleModels(List<CircleModel> circleModels)
	{
		this.circleModels = circleModels;
		notifyPropertyChanged(BR.circleModels);
	}
}
