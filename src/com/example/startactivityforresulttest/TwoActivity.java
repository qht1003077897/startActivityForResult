package com.example.startactivityforresulttest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TwoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		
	}
	public void btn(View view) {
		Intent intent=new Intent();
		intent.putExtra("TwoActivity", "TwoActivity");
		TwoActivity.this.setResult(4, intent);
		TwoActivity.this.finish();
	}
}
