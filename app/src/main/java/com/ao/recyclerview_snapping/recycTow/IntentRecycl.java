package com.ao.recyclerview_snapping.recycTow;

import android.os.Bundle;
import android.provider.Telephony;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.ao.recyclerview_snapping.R;
import com.bumptech.glide.Glide;

import static com.ao.recyclerview_snapping.R.drawable.imgsrc;

public class IntentRecycl extends AppCompatActivity {

	private ImageView mImageViewIntent;
	private TextView mTextViewIntent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent_recycl);
		mImageViewIntent = findViewById(R.id.imageView_intent);
		mTextViewIntent = findViewById(R.id.textView_intent);

		getIncoming();
	}

	public void  getIncoming(){

		if (getIntent().hasExtra("image_url")&&getIntent().hasExtra("image_Name")){

			String imageUrl = getIntent().getStringExtra("image_url");
			String imageNme = getIntent().getStringExtra("image_Name");


			setImage(imageNme,imageUrl );
		}
	}

	private void setImage(String imageName , String Image){
 		mTextViewIntent = findViewById(R.id.textView_intent);
		mTextViewIntent.setText(imageName);

		//ImageView mImageViewIntent =null;

		mImageViewIntent = findViewById(R.id.imageView_intent);
	//	mImageViewIntent.getImageAlpha();
		mImageViewIntent.setImageResource(imgsrc);








	}
}
