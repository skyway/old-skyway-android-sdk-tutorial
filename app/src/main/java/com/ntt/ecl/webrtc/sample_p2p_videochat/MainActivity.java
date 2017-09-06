package com.ntt.ecl.webrtc.sample_p2p_videochat;

import android.Manifest;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;

import java.util.ArrayList;

//
// Import for SkyWay
//

public class MainActivity extends Activity {
	private static final String TAG = MainActivity.class.getSimpleName();

	//
	// Set your APIkey and Domain
	//

	//
	// declaration
	//

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		//
		// Windows title hidden
		//

		//
		// Set UI handler
		//

		//
		// Initialize Peer
		//

		//
		// Set Peer event callbacks
		//

		// OPEN

		// ERROR

		// CLOSE

		// DISCONNECTED

		// CALL (Incoming call)

		//
		// Set GUI event listeners
		//

		// Set GUI event listner for Button (make/hang up a call)

		// Action for switchCameraButton

	}

	//
	// onRequestPermissionResult
	//

	//
	// Activity Lifecycle
	//
	@Override
	protected void onStart() {
		super.onStart();

	}

	@Override
	protected void onResume() {
		super.onResume();

	}

	@Override
	protected void onPause() {
		super.onPause();
	}

	@Override
	protected void onStop()	{
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		destroyPeer();
		super.onDestroy();
	}

	//
	// Get a local MediaStream & show it
	//

	//
	// Set callbacks for MediaConnection.MediaEvents
	//

	//
	// Clean up objects
	//

	//
	// Unset callbacks for PeerEvents
	//

	//
	// Unset callbacks for MediaConnection.MediaEvents
	//

	//
	// Close a remote MediaStream
	//


	//
	// Create a MediaConnection
	//

	//
	// Listing all peers
	//


	//
	// Update actionButton title
	//
	
}

