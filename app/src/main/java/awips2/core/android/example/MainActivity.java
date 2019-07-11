package awips2.core.android.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		super.onResume();
		// this is really, really bad. In real life, you would never, EVER make a http request
		// on a UI thread. But at this point, I'm just trying to figure out how to use ThriftClient
		// directly by following the docs for awips2-python and attempting to approximate its
		// behavior using the Java classes with somewhat similar names. Ugh.
		AwipsClient.doSomethingAwipsRelated();
	}


}
