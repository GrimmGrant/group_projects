package com.chocolate_rain.control;

import java.util.HashMap;

import com.chocolate_rain.record.*;

public class RecordMaintainer {
	
	private HashMap<String, ProviderRecord> providers;
	private HashMap<String, MemberRecord> members;
	private HashMap<String, ServiceRecord> services;
	private final String FILE_NAME = "";//TODO decide on filename
	
	public RecordMaintainer() {
		// TODO Auto-generated constructor stub
		providers = new HashMap<>();
		members = new HashMap<>();
		services = new HashMap<>();
	}
	
	public boolean updateRecord(RecordFileSystem.Type type, String key, Record.Fields field, String value){
		switch(type){
		case PROVIDER:
			//providers.get(key).update(field, value); TODO
			break;
		case MEMBER:
			//members.get(key).update(field, value); TODO
			break;
		default:
			return false;
			
		}
		return true;
	}
	
	public boolean createRecord(RecordFileSystem.Type type, String[] values){
		//values argument order:
		//[0] = number
		//[1] = name
		//[2] = address
		//[3] = city
		//[4] =  state
		//[5] = zip
		//Member and Provider Records require 6 fields.
		if(values.length < 6){
			return false;
		}
		
		switch(type){
		case PROVIDER:
			//providers.put(values[0], 
			//new ProviderRecord(values[0], values[1], values[2], values[3], values[4], values[5])); TODO
			break;
		case MEMBER:
			//members.put(values[0], 
			//new MemberRecord(values[0], values[1], values[2], values[3], values[4], values[5])); TODO
			break;
		default:
			return false;
		}
		
		return true;
	}
	
	public boolean delete(RecordFileSystem.Type type, String key){
		switch(type){
		case PROVIDER:
			providers.remove(key);
			break;
		case MEMBER: 
			members.remove(key);
			break;
		default:
			return false;
		}
		return true;
	}
	
	public String validateAgainst(RecordFileSystem.Type type, String key){
		String status = "";
		
		//TODO decide on status. should it be an extra field on member/provider records?
		
		return status;
	}
	
	public ProviderRecord getProvider(String key){
		return providers.get(key);
	}
	
	public MemberRecord getMember(String key){
		return members.get(key);
	}
	
	public HashMap<String, ServiceRecord> getServiceRecords(){
		return services;
	}
	
	public boolean save(){
		//TODO figure out how to save to file. 
		//Serialize all 3 hash maps and write to file with FILE_NAME
		return true;
	}
	
	public boolean loadRecords(){
		//TODO figure out how to load from file.
		return true;
	}

}
