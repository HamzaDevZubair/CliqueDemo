package com.example.hamzaz.cliquedemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ViewPager pager = (ViewPager) findViewById(R.id.view_pager);

        Fragment[] fragments = new Fragment[]{
          createSlide("SlideOne"),
          createSlide("Slide OneTwo"),
          createSlide("Slide Three"),
        };

        MySplashAdapter adapter = new MySplashAdapter(getSupportFragmentManager(),fragments);
        pager.setAdapter(adapter);


    }


    private Fragment createSlide(String slideText){
        MySlide slide = new MySlide();
        slide.setSlideText(slideText);
        return slide;
    }

    class MySplashAdapter extends FragmentStatePagerAdapter{
        ArrayList<Fragment> slides = new ArrayList<>();
        public MySplashAdapter(FragmentManager fm,Fragment[] slides) {
            super(fm);
            this.slides.addAll(Arrays.asList(slides));
        }

        @Override
        public Fragment getItem(int position) {
            return slides.get(position);
        }

        @Override
        public int getCount() {
            return slides.size();
        }
    }
}
