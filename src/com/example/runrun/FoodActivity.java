package com.example.runrun;

import java.util.ArrayList;
import java.util.List;

import bean.FoodBean;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class FoodActivity extends Activity {
	List<FoodBean> list = new ArrayList<FoodBean>();
   ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_food);
		init();
		listView=(ListView) findViewById(R.id.food_listView1);
		listView.setAdapter(new adapter());

	}

	private void init() {
		FoodBean foodBean1=new FoodBean(R.drawable.agency, "»ÆìË¼¦", "¶«·ç½Ö", "12");
		FoodBean foodBean2=new FoodBean(R.drawable.agency, "»ÆìË¼¦", "¶«·ç½Ö", "12");
		FoodBean foodBean3=new FoodBean(R.drawable.agency, "»ÆìË¼¦", "¶«·ç½Ö", "12");
		FoodBean foodBean4=new FoodBean(R.drawable.agency, "»ÆìË¼¦", "¶«·ç½Ö", "12");
		FoodBean foodBean5=new FoodBean(R.drawable.agency, "»ÆìË¼¦", "¶«·ç½Ö", "12");
		FoodBean foodBean6=new FoodBean(R.drawable.agency, "»ÆìË¼¦", "¶«·ç½Ö", "12");
		FoodBean foodBean7=new FoodBean(R.drawable.agency, "»ÆìË¼¦", "¶«·ç½Ö", "12");
		FoodBean foodBean8=new FoodBean(R.drawable.agency, "»ÆìË¼¦", "¶«·ç½Ö", "12");
		list.add(foodBean8);
		list.add(foodBean7);
		list.add(foodBean6);
		list.add(foodBean5);
		list.add(foodBean4);
		list.add(foodBean3);
		list.add(foodBean2);
		list.add(foodBean1);
		
	}

	class adapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return list.size();
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view;
			if (convertView == null) {
				view = View.inflate(FoodActivity.this, R.layout.fooditem, null);
			} else {
				view = convertView;
			}
			ImageView imageView=(ImageView) view.findViewById(R.id.fooditem_imageView1);
			TextView name=(TextView) view.findViewById(R.id.fooditem_textView1);
			TextView address=(TextView) view.findViewById(R.id.fooditem_textView2);
			TextView price=(TextView) view.findViewById(R.id.fooditem_textView3);
			imageView.setImageResource(list.get(position).getImage());
			name.setText(list.get(position).getName());
			address.setText(list.get(position).getAddress());
			price.setText(list.get(position).getPrice());
			return view;
		}

	}

}
