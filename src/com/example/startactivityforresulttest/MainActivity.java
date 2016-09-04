package com.example.startactivityforresulttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
/**
 * http://www.cnblogs.com/linjiqin/archive/2011/06/03/2071956.html
 *startActivityForResult用法详解 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void btn1(View view) {
		Bundle bundle = new Bundle();
		bundle.putString("main1", "btn3");
		startActivityForResult(
				new Intent(MainActivity.this, TwoActivity.class), 1, bundle);
	}

	public void btn2(View view) {
		Bundle bundle = new Bundle();
		bundle.putString("main2", "btn2");
		startActivityForResult(
				new Intent(MainActivity.this, TwoActivity.class), 2, bundle);
	}

	public void btn3(View view) {
		Bundle bundle = new Bundle();
		bundle.putString("main3", "btn3");
		startActivityForResult(
				new Intent(MainActivity.this, TwoActivity.class), 3, bundle);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);

		switch (requestCode) {
		case 1:
			Toast.makeText(MainActivity.this,
					"btn1请求----" + data.getExtras().getString("TwoActivity"),
					1000).show();
			break;

		case 2:
			Toast.makeText(MainActivity.this,
					"btn2请求----" + data.getExtras().getString("TwoActivity"),
					1000).show();
			break;

		case 3:
			Toast.makeText(MainActivity.this,
					"btn3请求----" + data.getExtras().getString("TwoActivity"),
					1000).show();
			break;
		default:
			break;
		}
	}

}
