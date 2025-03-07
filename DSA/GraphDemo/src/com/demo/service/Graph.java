package com.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Graph {
	
	
	String[] key;
	int i = 0;

	
	private HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
	
	public Graph(int vertices) {
		key = new String[vertices];
	}

	public void addVertex(String vertex) {
		if(hm.get(vertex) == null) {
			hm.put(vertex, new ArrayList<String>());
		}
	}
	
	public void addEdge(String vertex1, String vertex2) {
		if(hm.get(vertex1) != null && hm.get(vertex2) != null) {
			hm.get(vertex1).add(vertex2);
			hm.get(vertex2).add(vertex1);
		}
		
		
	}
	
	public void printGraph() {
		System.out.println(hm);
		
		System.out.println("....................................................");
		
		for(int j = 0; j < key.length; j++) {
			System.out.println(key[j]);
		}
	}

	public void add(int vertices) {
		key = new String[vertices];
		
	}

	public void addVertices(String vertex) {
		key[i] = vertex;
		i++;
	}
	


}
