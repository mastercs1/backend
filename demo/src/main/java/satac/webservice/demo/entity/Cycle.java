package satac.webservice.demo.entity;

import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
 
public class Cycle {
	@Id
	private long cycleId;
	private String cycleCode;
	private String cycleName;
	private String cycleStatus;
	public long getCycleId() {
		return cycleId;
	}
	public void setCycleId(long cycleId) {
		this.cycleId = cycleId;
	}
	public String getCycleCode() {
		return cycleCode;
	}
	public void setCycleCode(String cycleCode) {
		this.cycleCode = cycleCode;
	}
	public String getCycleName() {
		return cycleName;
	}
	public void setCycleName(String cycleName) {
		this.cycleName = cycleName;
	}
	public String getCycleStatus() {
		return cycleStatus;
	}
	public void setCycleStatus(String cycleStatus) {
		this.cycleStatus = cycleStatus;
	}
	
	


}
