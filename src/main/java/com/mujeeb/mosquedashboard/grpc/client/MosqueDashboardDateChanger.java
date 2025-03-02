package com.mujeeb.mosquedashboard.grpc.client;

import java.io.IOException;

import com.mujeeb.mosquedashboard.grpc.EmptyRequest;
import com.mujeeb.mosquedashboard.grpc.MosqueDashboardServiceGrpc;
import com.mujeeb.mosquedashboard.grpc.MosqueDashboardServiceGrpc.MosqueDashboardServiceBlockingStub;
import com.mujeeb.mosquedashboard.grpc.MosqueDashboardServiceGrpc.MosqueDashboardServiceStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class MosqueDashboardDateChanger  {
	
	protected static ManagedChannel channel;
	protected static MosqueDashboardServiceBlockingStub blockingStub;
	protected static MosqueDashboardServiceStub asyncStub;
	
	public MosqueDashboardDateChanger(String host, int port) throws IOException {
		this(ManagedChannelBuilder.forAddress(host, port).usePlaintext());
	}

	public MosqueDashboardDateChanger(ManagedChannelBuilder<?> channelBuilder) {
		  channel = channelBuilder.build();
		  blockingStub = MosqueDashboardServiceGrpc.newBlockingStub(channel);
		  asyncStub = MosqueDashboardServiceGrpc.newStub(channel);
	}
	
	public static String hasDateChanged() {
		
		return blockingStub.hasDateChanged(EmptyRequest.newBuilder().build()).getStr();
	}
	
	public static void main(String[] args) throws IOException {
		
		try {
			new MosqueDashboardDateChanger("localhost", 8090);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
		System.out.println(hasDateChanged());
	}
}
