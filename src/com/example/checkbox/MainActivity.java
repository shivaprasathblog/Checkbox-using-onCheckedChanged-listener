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
	//Define Checkbox as c1,c2,c3 respectively
	CheckBox c1,c2,c3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		//Refer the checkbox with their respective id's from XML
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		c1=(CheckBox)findViewById(R.id.checkBox1);
		c2=(CheckBox)findViewById(R.id.checkBox2);
		c3=(CheckBox)findViewById(R.id.checkBox3);

	//Set the listener for Checkbox, we use onclik listener here 
		c1.setOnCheckedChangeListener(new OnCheckedChangeListener()
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1)
			{
				// TODO Auto-generated method stub
				if(arg1==true)
				{
					//Toast message if c1 is checked(clicked)
					Toast.makeText(MainActivity.this,"Salary Account is Selected",Toast.LENGTH_LONG).show();
				}
				else if(arg1==false)
				{
					//Toast message if c1 is unchecked
					Toast.makeText(MainActivity.this,"Salary Account is UnSelected",Toast.LENGTH_LONG).show();
				}
				
			}
		});
		
		c2.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				// TODO Auto-generated method stub
				if(arg1==true)
				{
					//Toast message if c2 is checked(clicked)					
					Toast.makeText(MainActivity.this,"Savings Account is Selected",Toast.LENGTH_LONG).show();
				}
				else if(arg1==false)
				{
					//Toast message if c2 is unchecked
					Toast.makeText(MainActivity.this,"Savings Account is UnSelected",Toast.LENGTH_LONG).show();
				}
			}
		});
		
		c3.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				// TODO Auto-generated method stub
				if(arg1==true)
				{
					//Toast message if c3 is checked(clicked)	
					Toast.makeText(MainActivity.this,"Current Account is Selected",Toast.LENGTH_LONG).show();
				}
				else if(arg1==false)
				{
					//Toast message if c3 is unchecked
					Toast.makeText(MainActivity.this,"Current Account is UnSelected",Toast.LENGTH_LONG).show();
				}
				
			}
		});
	}
}
