package spring.application.event.example.eventlistner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import spring.application.event.example.mockdata.MockData;

@Component
public class CustomListener implements ApplicationListener<CustomEvent> {

	@Autowired
	private MockData mockData;

	@Override
	public void onApplicationEvent(CustomEvent event) {
		this.completeCustomEvent(event);

	}

	private void completeCustomEvent(final CustomEvent event) {
		mockData.add(event.getMsg());

	}

}
