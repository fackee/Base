package com.example.Observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	
	private List<Observer> mList = new ArrayList<Observer>();
	
	public void attach(Observer observer){
		mList.add(observer);
		System.out.println("Attach Observer");
	}
	
	public void detach(Observer observer){
		mList.remove(observer);
		System.out.println("Detach Observer");
	}
	
	public void notifyObservers(){
		for(Observer observer : mList){
			observer.update(this);
		}
	}

}
