package com.example.langchaindemo;

import com.example.langchaindemo.AImodel.AImodel;
import com.example.langchaindemo.AImodel.FakeModel;
import com.example.langchaindemo.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LangChainDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LangChainDemoApplication.class, args);
		Utils.startConversationWith(new FakeModel());
	}
}
