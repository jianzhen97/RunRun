package base;

import java.util.ArrayList;
import java.util.List;

import com.example.runrun.R;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class BasePager {
	List<ImageView> list = new ArrayList<ImageView>();
	// public View view;
	public View rootView;
	public Activity activity;
	public ViewPager viewPager;
	int bg[] = new int[] { R.drawable.guide_1, R.drawable.guide_2 };

	public BasePager(Activity activity) {
		this.activity = activity;
		// view=initView();
		listInit();
	}

	public View initView() {

		// View rootView = View.inflate(activity, R.layout.basepagerlayout,
		// null);
		rootView = View.inflate(activity, R.layout.basepagerlayout, null);
		viewPager = (ViewPager) rootView.findViewById(R.id.home_viewpager);
		viewPager.setAdapter(new adapter());

		return rootView;
	}

	private void listInit() {
		for (int i = 0; i < 2; i++) {
			ImageView imageView = new ImageView(activity);
			imageView.setImageResource(bg[i]);
			list.add(imageView);
		}
	}

	public void initData() {

	}

	class adapter extends PagerAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			// TODO Auto-generated method stub
			return arg0 == arg1;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			container.addView(list.get(position));
			return list.get(position);
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			container.removeView((View) object);

		}
	}
}
