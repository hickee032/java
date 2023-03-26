package sec_verify08;

public class Button {

	OnClickListener listener;

	interface OnClickListener {

		void OnClick();
	}

	public void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {

		listener.OnClick();
	}
}
