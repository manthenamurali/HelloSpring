package springdemo.utils;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class JSONUtils {

	@SuppressWarnings("unchecked")
	public static <T> T convertToModel(final String jsonRequest, final Type responseType) throws JsonSyntaxException {

		if (jsonRequest == null || jsonRequest.length() == 0) {
			return null;
		}

		Gson gson = new Gson();
		T jsonModel = (T) gson.fromJson(jsonRequest, responseType);
		return jsonModel;

	}
}
