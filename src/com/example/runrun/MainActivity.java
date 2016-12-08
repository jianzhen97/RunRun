package com.example.runrun;

import impl.Complete;
import impl.Home;
import impl.Unfinish;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import base.BasePager;

public class MainActivity extends Activity {
	List<BasePager> list = new ArrayList<BasePager>();
	ViewPager viewPager;
	RadioGroup radioGroup;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initList();
		viewPager = (ViewPager) findViewById(R.id.main_viewpager);
		radioGroup=(RadioGroup) findViewById(R.id.radiogroup);
		viewPager.setAdapter(new myadapter());
		radioSet();

	}

	private void radioSet() {
		radioGroup.check(R.id.radiobt1);
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
				case R.id.radiobt1:
					viewPager.setCurrentItem(0);
					break;
				case R.id.radiobt2:
					viewPager.setCurrentItem(1);
					break;
				case R.id.radiobt3:
					viewPager.setCurrentItem(2);
					break;

				}
			}
		});
	}

	private void initList() {
		list.add(new Home(this));
		list.add(new Complete(this));
		list.add(new Unfinish(this));
	}

	class myadapter extends PagerAdapter {

		@Override
		public int getCount() {
			return list.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == arg1;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			View view = list.get(position).initView();
			container.addView(view);
//			container.addView(list.get(position).initView());
			list.get(position).initData();
			
			return view;
			//return view;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {

			//container.removeView((View) object);
			container.removeView(list.get(position).initView());
		}

	}

}
