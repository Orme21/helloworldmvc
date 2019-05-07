package org.helloworldmvc.controller;

public class Controller {
	private final IView view;
	private final IModel Model;
	
	public Controller(final IView view, final IModel model) {
		this.view = view;
		this.Model = model;
	}
	public void run() {
		this.view.displayMessage(this.Model.getHelloWorld());
	}
}
