package com.RunningWheel.everytour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.shan);
	
	
	// �����ĺ��Ĵ���
	new Handler().postDelayed(new Runnable() {
	@Override
	public void run() {
	Intent intent = new Intent(SplashActivity.this,LogoScreen.class); //����������ui��ת����ui
	startActivity(intent);
	SplashActivity.this.finish(); // ����������������
	}
	}, 3000); //������������3����
	}
}