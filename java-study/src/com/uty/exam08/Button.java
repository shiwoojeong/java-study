package com.uty.exam08;

public class Button {
	private OnClickListner onClickListner;

	public void setOnClickListner(OnClickListner onClickListner) {
		this.onClickListner = onClickListner;
	}
	
	public void touch() {
		onClickListner.onClick();
	}
	
	interface OnClickListner {
		void onClick(); // 추상 매소드 (public abstract 생략)
	}
}
