package com.mtkhs.mosla_j;

import java.util.ResourceBundle;

import allbegray.slack.SlackClientFactory;
import allbegray.slack.rtm.Event;
import allbegray.slack.rtm.SlackRealTimeMessagingClient;
import allbegray.slack.webapi.SlackWebApiClient;


public class Mosla {

	private SlackRealTimeMessagingClient rtmClient = null;
	private SlackWebApiClient webClient = null;

	public Mosla() {
		ResourceBundle setting = ResourceBundle.getBundle("mosla");

		this.rtmClient = SlackClientFactory.createSlackRealTimeMessagingClient( setting.getString( "XOXB_TOKEN" ) );
		this.webClient = SlackClientFactory.createWebApiClient( setting.getString( "XOXP_TOKEN" ) );

		this.rtmClient.addListener( Event.HELLO, new HelloEventListener() );
		this.rtmClient.addListener( Event.MESSAGE, new MessageEventListener() );
		this.rtmClient.connect();
	}

}
