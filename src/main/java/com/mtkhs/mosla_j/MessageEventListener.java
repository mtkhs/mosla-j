package com.mtkhs.mosla_j;

import com.fasterxml.jackson.databind.JsonNode;

import allbegray.slack.rtm.EventListener;

public class MessageEventListener implements EventListener {

	public void onMessage(JsonNode message) {

		System.out.println( "-- MessageEventListener: onMessage()" );
		System.out.println( message.get( "text" ).textValue() );
	}

}