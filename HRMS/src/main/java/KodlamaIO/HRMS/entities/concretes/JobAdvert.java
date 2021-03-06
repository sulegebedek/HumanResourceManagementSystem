package KodlamaIO.HRMS.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_adverts")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvert {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "min_salary")
	private int minSalary;
	
	@Column(name = "max_salary")
	private int maxSalary;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "deadline")
	private LocalDate deadline;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "count_open_positions")
	private LocalDate countOpenPositions;
	
	@Column(name = "publish_date")
	private LocalDate publishDate;

	@ManyToOne()
	@JoinColumn(name="job_position_id")
	private Job job;
	
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
	
	@ManyToOne()
	@JoinColumn(name="employer_id")
	private EmployerUser employerUser;
}
