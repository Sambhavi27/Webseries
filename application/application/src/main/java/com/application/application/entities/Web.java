package com.application.application.entities;



	import javax.persistence.Entity;
	import javax.persistence.Table;

	import org.springframework.stereotype.Component;

	
	@Entity
	public class Web {

			@javax.persistence.Id
			private long Id;
			private String name;
			private int seasons;
			private int episodes;
			private int rating;
			public Web(long id, String name, int seasons, int episodes, int rating) {
				super();
				Id = id;
				this.name = name;
				this.seasons = seasons;
				this.episodes = episodes;
				this.rating = rating;
			}
			public Web() {
				super();
				// TODO Auto-generated constructor stub
			}
			public long getId() {
				return Id;
			}
			public String getName() {
				return name;
			}
			public int getSeasons() {
				return seasons;
			}
			public int getEpisodes() {
				return episodes;
			}
			public int getRating() {
				return rating;
			}
			public void setId(long id) {
				Id = id;
			}
			public void setName(String name) {
				this.name = name;
			}
			public void setSeasons(int seasons) {
				this.seasons = seasons;
			}
			public void setEpisodes(int episodes) {
				this.episodes = episodes;
			}
			public void setRating(int rating) {
				this.rating = rating;
			}
			@Override
			public String toString() {
				return "Web [Id=" + Id + ", name=" + name + ", seasons=" + seasons + ", episodes=" + episodes
						+ ", rating=" + rating + "]";
			}
			
			
}
