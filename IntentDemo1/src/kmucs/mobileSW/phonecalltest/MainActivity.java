package kmucs.mobileSW.phonecalltest;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	EditText editText;
	Button button;
	String number = "111";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		editText = (EditText) findViewById(R.id.edit);
		button = (Button) findViewById(R.id.btn);		
		
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				number = editText.getText().toString();
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:"+number));
				startActivity(intent);
			}
		});
	}
}
