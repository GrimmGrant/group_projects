package com.chocolate_rain.control;

import java.math.BigDecimal;

import com.chocolate_rain.provider_directory.ProviderDirectory;
import com.chocolate_rain.report.Report;



public class RecordFileSystem {
	
	public static enum Type{
		PROVIDER, MEMBER, EFT, SERVICE, SUMMARY
	}
	
	private RecordMaintainer maintainer;
	private ReportGenerator generator;
	private ProviderDirectory directory;
	
	
	
	
	public RecordFileSystem() {
		//TODO
		maintainer = new RecordMaintainer();
		generator = new ReportGenerator();
		directory = new ProviderDirectory();
	}
	
	public boolean lookUpService(String serviceCode){
		//return directory.getEntry(serviceCode); TODO
		return true;
	}
	
	public boolean createRecord(Type type, String[] personalInfo){
		//return maintainer.createRecord(type, personalInfo); TODO
		return true;
	}
	
	public boolean updateRecord(Type type, String key, String field, String value){
		//return maintainer.updateRecord(String type, String key, String field, String value); TODO
		return true;
	}
	
	public boolean deleteRecord(Type type, String key){
		//return maintainer.deleteRecord(type, key); TODO
		return true;
	}
	
	public Report requestReport(Type type, String number){
		switch(type){
		case MEMBER:
			//generator.generateReport(maintainer.getMember(number), maintainer.getServiceRecords()) TODO
			break;
		case PROVIDER:
			//generator.generateReport(maintainer.getProvider(number), maintainer.getServiceRecords()) TODO
			break;
		default:
			return null;
		}
		return null;
	}
	
	public ProviderDirectory requestProviderDirectory(){
		return directory;
	}
	
	public boolean updateProviderDirectory(String serviceCode, ProviderDirectory.Fields field, Object value){
		//providerDirectory.updateEntry(serviceCode, field, value)TODO
		return true;
	}
	
	public boolean addProviderDirectoryEntry(String serviceCode, String serviceName, BigDecimal serviceCost){
		//providerDirectory.addEntry(String serviceCode, String serviceName, BigDecimal serviceCost)TODO
		return true;
	}
	
	public String validate(Type type, String identifier){
		//return maintainer.validateAgainst(type, identifier);
		//TODO
		return null;
	}
	
}
