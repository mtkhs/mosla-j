package com.mtkhs.mosla_j;

import com.fasterxml.jackson.databind.JsonNode;

import allbegray.slack.rtm.EventListener;

public class HelloEventListener implements EventListener {

	public void onMessage( JsonNode message ) {

		System.out.println( "-- HelloEventListener: onMessage()" );
		System.out.println( message );
	}

}
