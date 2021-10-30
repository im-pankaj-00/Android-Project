package com.example.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SliderView sliderView = findViewById(R.id.imageSlider);

        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.gecbharatpur);
        images.add(R.drawable.gecb1);
        images.add(R.drawable.gecb2);
        images.add(R.drawable.gecb3);
        images.add(R.drawable.one);
        images.add(R.drawable.two);


        MyAdapter myAdapter = new MyAdapter(images);

        sliderView.setSliderAdapter(myAdapter);

        sliderView.setAutoCycle(true);

        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);

    }
}