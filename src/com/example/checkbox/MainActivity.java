package com.example.checkbox;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity
{
	//STEP 1: Declare checkbox as c1,c2,c3; respectively
	CheckBox c1,c2,c3;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		 
		//STEP 2: Refer the checkboxs from xml
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		c1=(CheckBox)findViewById(R.id.checkBox1);
		c2=(CheckBox)findViewById(R.id.checkBox2);
		c3=(CheckBox)findViewById(R.id.checkBox3);

		//STEP 3: Set the listener & create the object for listener,checkbox c1
		c1.setOnCheckedChangeListener(new OnCheckedChangeListener()
		{
			/**public abstract void onCheckedChanged (CompoundButton buttonView, boolean isChecked)

			Added in API level 1
			Called when the checked state of a compound button has changed.

			Parameters
			buttonView	The compound button view whose state has changed.
			isChecked	The new checked state of buttonView.**/
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1)
			{
				// TODO Auto-generated method stub
				//STEP 3.1: Set the condition for checkbox c1
				if(arg1==true)
				{
					//STEP 3.2: Set toast message for checkbox c1 if it is checked
					Toast.makeText(MainActivity.this,"Salary Account is Selected",Toast.LENGTH_LONG).show();
				}
			
				else if(arg1==false)
				{
					//STEP 3.3: Set toast message for checkbox c1 if it is unchecked
					Toast.makeText(MainActivity.this,"Salary Account is UnSelected",Toast.LENGTH_LONG).show();
				}
				
			}
		});
		
		//STEP 4: Set the listener & Create the object for listener,checkbox c2
		c2.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				// TODO Auto-generated method stub
				//STEP 4.1: Set the condition for c2 checkbox
				if(arg1==true)
				{
					//STEP 4.2: Set toast message for checkbox c2 if it is checked					
					Toast.makeText(MainActivity.this,"Savings Account is Selected",Toast.LENGTH_LONG).show();
				}
				else if(arg1==false)
				{
					//STEP 4.3: Set toast message for checkbox c2 if it is unchecked
					Toast.makeText(MainActivity.this,"Savings Account is UnSelected",Toast.LENGTH_LONG).show();
				}
			}
		});
		
		//STEP 5: Set the listener & Create the object for listener,checkbox c3
		c3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				// TODO Auto-generated method stub
				if(arg1==true)
				{
					//STEP 5.1: Set the condition for checkbox c3	
					Toast.makeText(MainActivity.this,"Current Account is Selected",Toast.LENGTH_LONG).show();
				}
				else if(arg1==false)
				{
					//STEP 5.2: Set toast message for c3 checkbox if it is checked
					Toast.makeText(MainActivity.this,"Current Account is UnSelected",Toast.LENGTH_LONG).show();
				}
				
			}
		});
	}
}
