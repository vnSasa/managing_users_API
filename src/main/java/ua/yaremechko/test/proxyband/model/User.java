package ua.yaremechko.test.proxyband.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document(collection = "User")
@Data
@RequiredArgsConstructor
public class User {

	@Id
	private String id;
	@NonNull
	private String name;
	@NonNull
	private String email;

}
