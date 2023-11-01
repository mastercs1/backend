package satac.webservice.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 
// Class
public class Hero {
    @Id
	private long heroId ;
	private String heroName;
	private String heroRace;
	private String heroDob;
	@Lob
	private String description;
    private double  hirePrice;
    private double  starRating;
    private String  imageUrl;
    
	public long getHeroId() {
		return heroId;
	}

	public void setHeroId(long heroId) {
		this.heroId = heroId;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getHeroRace() {
		return heroRace;
	}

	public void setHeroRace(String heroRace) {
		this.heroRace = heroRace;
	}

	public String getHeroDob() {
		return heroDob;
	}

	public void setHeroDob(String heroDob) {
		this.heroDob = heroDob;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getHirePrice() {
		return hirePrice;
	}

	public void setHirePrice(double hirePrice) {
		this.hirePrice = hirePrice;
	}

	public double getStarRating() {
		return starRating;
	}

	public void setStarRating(double starRating) {
		this.starRating = starRating;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

}