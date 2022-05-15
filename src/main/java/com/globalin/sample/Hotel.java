package com.globalin.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hotel {

	@Autowired
	private Restaurant res;

	/**
	 * @return the res
	 */
	public Restaurant getRes() {
		return res;
	}

	/**
	 * @param res the res to set
	 */
	public void setRes(Restaurant res) {
		this.res = res;
	}

	@Override
	public String toString() {
		return "Hotel [res=" + res + "]";
	}
}
