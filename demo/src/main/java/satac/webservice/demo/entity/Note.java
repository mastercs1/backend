package satac.webservice.demo.entity;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Note {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long noteId;
private long applicantId;
private String note;
private LocalDateTime whenCreated;
@PrePersist
public void prePersist() {
    this.whenCreated = LocalDateTime.now();
}

public String getWhenCreated() {
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	return this.whenCreated.format(formatter);
}

}
