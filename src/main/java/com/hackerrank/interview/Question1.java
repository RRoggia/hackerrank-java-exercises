package com.hackerrank.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Question1 {
	public static void main(String[] args) {
		String[] titles = getTitles("spiderman");

		for (String title : titles) {
			System.out.println(title);
		}
	}

	static String[] getTitles(String titleName) {

		List<String> titles = new ArrayList<>();
		int numberOfPages = 1;
		for (int i = 1; i <= numberOfPages; i++) {
			TitlesDTO titlesDTO = getTitlesFromHackerRank(titleName, i);

			List<Title> hackerRankTitles = titlesDTO.getData();
			for (Title title : hackerRankTitles) {
				titles.add(title.getTitle());
			}

			numberOfPages = titlesDTO.getTotalPages();

		}

		Collections.sort(titles);
		return titles.toArray(new String[titles.size()]);
	}

	private static TitlesDTO getTitlesFromHackerRank(String title, int page) {
		final String hackerRankUrlWwithPlaceholder = "https://jsonmock.hackerrank.com/api/movies/search/?Title=%s&page=%d";
		final String hackerRankUrl = String.format(hackerRankUrlWwithPlaceholder, title, page);

		try {

			URL url = new URL(hackerRankUrl);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Content-Type", "application/json");
			int httpResponseStatusCode = connection.getResponseCode();

			if (httpResponseStatusCode == HttpURLConnection.HTTP_OK) {

				BufferedReader responseReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String titlesDTOLine;
				StringBuffer rawTitlesDTO = new StringBuffer();
				while ((titlesDTOLine = responseReader.readLine()) != null) {
					rawTitlesDTO.append(titlesDTOLine);
				}
				responseReader.close();
				return new Gson().fromJson(rawTitlesDTO.toString(), TitlesDTO.class);
			} else {
				throw new RuntimeException("HTTP request status code was not 200.");
			}

		} catch (IOException e) {
			throw new RuntimeException("Couldnt make the request to hackerrank.");
		}
	}
}

class TitlesDTO {
	private Integer total;
	@SerializedName("total_pages")
	private Integer totalPages;
	private List<Title> data;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}

	public List<Title> getData() {
		return data;
	}

	public void setData(List<Title> data) {
		this.data = data;
	}
}

class Title {
	private String Title;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
}
